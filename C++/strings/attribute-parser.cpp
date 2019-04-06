// https://www.hackerrank.com/challenges/attribute-parser/problem

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    string s[2];
    for (int i = 0; i < 2; i++) {
      getline(cin, s[i], ' ');
    }
    int n = atoi(s[0].c_str());
    int q = atoi(s[1].c_str());
    // cout << n << " " << q << endl;

    string line[n];
    for (int j = 0; j < n; j++) {
        getline(cin,line[j]);
    }

    string query[q];
    for (int k = 0; k < q; k++) {
        getline(cin,query[k]);
    }

    return 0;
}
