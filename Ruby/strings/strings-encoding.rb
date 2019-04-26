# https://www.hackerrank.com/challenges/ruby-strings-encoding/problem

# In this challenge, we practice setting the encoding information for some string of text using Ruby's Encoding methods.
# Write a function named transcode which takes a ISO-8859-1 encoded string as a parameter, converts it to an UTF-8
# encoded string, and returns the result.
#
# Input: Our hidden code checker will call your function, passing it an ISO-8859-1 encoded string as an argument.
# Output: Your function must return an UTF-8 encoded string.

# http://ruby-doc.org/core-2.2.2/Encoding.html#class-Encoding-label-Changing+an+encoding

def transcode(str)
  # str.encode!(Encoding::UTF_8)
  str.force_encoding(Encoding::UTF_8)
end
