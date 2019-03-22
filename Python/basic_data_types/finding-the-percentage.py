# https://www.hackerrank.com/challenges/finding-the-percentage/problem
if __name__ == '__main__':
    n = int(raw_input())
    student_marks = {}
    for _ in range(n):
        line = raw_input().split()
        name, scores = line[0], line[1:]
        scores = map(float, scores)
        student_marks[name] = scores
    query_name = raw_input()
    num_scores = len(student_marks[query_name])
    total = 0
    for x in range(num_scores):
        total += student_marks[query_name][x]
    print "{0:.2f}".format(total / num_scores)
