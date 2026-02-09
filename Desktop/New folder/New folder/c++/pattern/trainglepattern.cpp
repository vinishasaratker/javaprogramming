
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter side of triangle: ";
    cin >> n;

    for (int i = 1; i <= n; i++) { // Outer loop for rows
        for (int j = 1; j <= i; j++) { // Inner loop for columns
            cout << " *"; // Print '*'
        }
        cout << endl; // Move to next line after each row
    }

    return 0; // Exit program correctly
}
