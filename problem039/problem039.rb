# If p is the perimeter of a right angle triangle with integral length sides,
# {a,b,c}, there are exactly three solutions for p = 120.
#
# {20,48,52}, {24,45,51}, {30,40,50}
#
# For which value of p ≤ 1000, is the number of solutions maximised?

triplecounts = Hash.new(0)
c = 0

(1..1000).to_a.each do |a|
  (a..1000).to_a.each do |b|
    c = Math.hypot(a, b)
    next if c % 1 != 0.0
    side_length_sum = a + b + c.to_i
    break if side_length_sum > 1000
    triplecounts[side_length_sum] += 1
  end
end

puts triplecounts.max_by { |k, v| v }[0]
