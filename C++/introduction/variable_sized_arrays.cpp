/*
https://www.hackerrank.com/challenges/variable-sized-arrays/

Input Format
------------
The first line contains two space-separated integers denoting the respective values of n (the number of variable-length arrays) and q (the number of queries). 
Each line i of the n subsequent lines contains a space-separated sequence in the format k a[i]0 a[i]1 … a[i]k-1 describing the k-element array located at a[i]. 
Each of the q subsequent lines contains two space-separated integers describing the respective values of i (an index in array a) and j (an index in the array referenced by a[i]) for a query.

Output Format
-------------
For each pair of i and j values (i.e., for each query), print a single integer denoting the element located at index j of the array referenced by a[i]. There should be a total of q lines of output.
*/

#include <vector>
#include <iostream>
using namespace std;

int main() {
    int n,q;

    // First line of input
    cin >> n; // the number of variable-length arrays
    cin >> q; // the number of queries

    // create vector of vectors
    vector<vector<int>> a(n);

    // fill each 2D vector i with k_i values
    for (int i = 0; i < n; i++) {
      // get the length k of the vector at a[i]
      int k;
      cin >> k;

      // fill the vector with k values
      a[i].resize(k);
      for (int j = 0; j < k; j++) {
        cin >> a[i][j];
      }
    }

    // run queries on a
    for (int q_num = 0; q_num < q; q_num++) {
      // get i, j as the 'query' to get a value from a
      int i, j;
      cin >> i >> j;
      cout << a[i][j] << endl;
    }

    return 0;
}
