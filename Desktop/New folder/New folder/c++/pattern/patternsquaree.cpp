#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter size of square: ";
    cin >> n;

    for (int i = 1; i <= n; i++) { // Corrected outer loop braces
        for (int j = 1; j <= n; j++) {
            cout << "* ";
        }
        cout << endl; // Moved inside the outer loop
    }

    return 0;
}
