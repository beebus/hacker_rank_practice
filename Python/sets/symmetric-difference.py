# https://www.hackerrank.com/challenges/symmetric-difference/problem

if __name__ == '__main__':
    m = int(input())
    m_set = set(list(map(int, input().split())))
    n = int(input())
    n_set = set(list(map(int, input().split())))

    sym_diff = m_set.union(n_set)
    for i in m_set.intersection(n_set):
        sym_diff.remove(i)
    for j in sorted(sym_diff):
        print(j)
