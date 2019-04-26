# https://www.hackerrank.com/challenges/ruby-strings-introduction/problem

def single_quote
  # single quote string here
  'Hello World and others!'
end

def double_quote
  # Double quote string here
  "Hello World and others!"
end

def here_doc
  # Here doc string here
  # document = <<-HERE         # We begin with <<- followed by the ending delimiter HERE
  # This is a string literal.
  # It has two lines and abruptly ends with a newline...
  # HERE
  <<-BILLYBOB
  Hello World and others!
  BILLYBOB
end
