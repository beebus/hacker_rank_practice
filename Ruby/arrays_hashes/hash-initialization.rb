# https://www.hackerrank.com/challenges/ruby-hash-initialization/problem

# Initialize 3 variables here as explained in the problem statement

# Hashes, also called associative arrays, are dictionary-like data structures which are similar to arrays. Instead of
# using integers to index an object, however, hashes use any object as its index.
#    In this challenge, your task is to create three different Hash collections as explained below.

# 1. Initialize an empty Hash with the variable name empty_hash
empty_hash = Hash.new

# 2. Initialize an empty Hash with the variable name default_hash and the default value of every key set to 1.
# default_hash = Hash.new(1)
# or
default_hash = Hash.new
default_hash.default = 1

# 3. Initialize a hash with the variable name hackerrank and having the key-value pairs
#     "simmy", 100
#     "vivmbbs",200
# hackerrank = {"simmy" => 100, "vivmbbs" => 200}
# or
hackerrank = Hash.new
hackerrank["simmy"] = 100
hackerrank["vivmbbs"] = 200
