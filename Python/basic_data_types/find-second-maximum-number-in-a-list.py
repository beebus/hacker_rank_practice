# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem
if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    
    if (arr[0] > arr[1]):
        m, m2 = arr[0], arr[1]
    else:
        m, m2 = arr[1], arr[0]

    for x in arr[2:]:
        if x > m2:
            if x == m:
                pass
            elif x > m:
                m2, m = m, x
       	    else:
                m2 = x
        elif m == m2:
            m2 = x
    print m2
