# https://www.hackerrank.com/challenges/validate-a-roman-number/problem

import re

regex_pattern = r"(?:M|MM|MMM)?(?:C|CC|CCC|CD|D|DC|DCC|DCCC|CM)?(?:X|XX|XXX|XL|L|LX|LXX|LXXX|XC)?(" \
                r"?:I|II|III|IV|V|VI|VII|VIII|IX)?$"  # Do not delete 'r'.

print(str(bool(re.match(regex_pattern, input()))))
