# https://www.hackerrank.com/challenges/ruby-strings-methods-ii/problem

=begin

=end

def mask_article(str, words)
  pattern = words.join("|")
  str.gsub(/#{pattern}/) {|match| strike(match)}
end

def strike(str)
  str.insert(0, '<strike>') + '</strike>'
end