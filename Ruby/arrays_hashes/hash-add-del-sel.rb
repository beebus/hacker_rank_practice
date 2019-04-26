# https://www.hackerrank.com/challenges/ruby-hash-add-del-sel/problem

# In this challenge, a hash object called hackerrank is already created. You have to add

# Retain all key-value pairs where keys are Integers ( clue : is_a? Integer )
hackerrank.keep_if {|key, value| key.is_a? Integer}

# Delete all key-value pairs where keys are even-valued.
hackerrank.delete_if {|key, value| key % 2}

# A key-value pair [543121, 100] to the hackerrank object using store
hackerrank.store(543121, 100)
