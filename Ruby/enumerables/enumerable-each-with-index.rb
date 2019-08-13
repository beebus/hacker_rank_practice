# https://www.hackerrank.com/challenges/ruby-enumerable-each-with-index/problem

def skip_animals(animals, skip)
  results = []
  animals.drop(skip).each_with_index do |animal, i|
    results << "#{i+skip}:#{animal}"
  end
  results
end
