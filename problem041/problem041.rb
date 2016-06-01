def is_prime?(num)
  result = num > 1;
  (2..Math.sqrt(num)).to_a.each do |n|
    if num % n == 0
      result = false
      break
    end
  end
  return result
end

(1..9).to_a.each do |limit|
  permutations = (1..limit).to_a.permutation.map(&:join).sort!
  permutations.each do |p|
    p = Integer(p)
    if is_prime?(p)
      puts p
    end
  end
end