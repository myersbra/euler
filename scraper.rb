# File to scrape answers from solved Project Euler problems
# and save them in their respective problem files

require 'rubygems'
require 'nokogiri'
require 'open-uri'
require 'mechanize'

agent = Mechanize.new
page = agent.get("https://projecteuler.net/sign_in")
form = page.form("sign_in_form")
puts "Enter Project Euler username: "
form.username = gets.chomp 
puts "Enter Project Euler password: "
form.password = gets.chomp
page = agent.submit(form, form.buttons.first)
html = Nokogiri::HTML(page.body)
table = html.xpath("//a[starts-with(@href, 'problem')]")

table.each do |t|
  html = Nokogiri::HTML(agent.click(t).body)
  problem = html.css('h3').text
  answer = html.css("td b").text
  puts "#{problem}: #{answer}"

  # parse file directory and name
  a = problem.downcase.split
  if a[1].length == 1
    dir = "#{a[0]}00#{a[1]}"
  elsif a[1].length == 2
    dir = "#{a[0]}0#{a[1]}"
  else
    dir = "#{a[0]}#{a[1]}"
  end
  name = dir + ".txt"

  File.open("#{dir}/answer.txt", 'w') { |f| f.write(answer) }
end
