# https://www.hackerrank.com/challenges/ruby-strings-indexing/problem

# In this challenge, your task is to code a serial_average method which is described below:
#
# It takes a fixed width string in format: SSS-XX.XX-YY.YY. SSS is a three digit serial number, XX.XX and YY.YY are two digit numbers including up to two decimal digits.
# It returns a string containing the answer in format SSS-ZZ.ZZ where SSS is the serial number of that input string, and ZZ.ZZ is the average of XX.XX and YY.YY.
# All numbers are rounded off to two decimal places.
# For example:
#
# > serial_average('002-10.00-20.00')
# "002-15.00"
# You can use string interpolation to insert Ruby code within a string.
# For example:
#
# > tmp = 123
# > "Hello #{tmp}"
# Hello 123

def serial_average(str)
  sss = str[0,4]
  x = str[4,5].to_f   # to float?
  y = str[10,5].to_f  # to float?
  avg = ((x + y) / 2).round(2)
  "#{sss}#{avg}"
end
