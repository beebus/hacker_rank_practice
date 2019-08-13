# https://www.hackerrank.com/challenges/ruby-lazy/problem

# Enter your code here. Read input from STDIN. Print output to STDOUT

require 'prime'

n = gets.to_i
p Prime.each.lazy.select{|x| x == x.to_s.reverse.to_i}.first(n)
