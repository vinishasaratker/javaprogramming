

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    // Create an array to store squares
    int squares[n];

    // Fill the array with squares of natural numbers till n
    for (int i = 1; i <= n; i++) {
        squares[i-1] = i * i;
    }

    // Print the elements of the array
    cout << "Squares of natural numbers till " << n << " are: ";
    for (int i = 0; i < n; i++) {
        cout << squares[i] << " ";
    }

    return 0;
}
