// #include<iostream>
// using namespace std;
// int main(){
//     int n;
//     cout<<" enter number of rows: ";
//     cin>>n;
//     int m;
//     cout<<" enter number of column: ";
//     cin>>m;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if((i+j)%2==0){
//                 cout<<"*";
//             }
//             else
//             cout<<"  ";
//         }
//         cout<<endl;
//     }
//     return 0;
// }
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter an odd number: ";
    cin >> n;

    if (n % 2 == 0) {
        cout << "Please enter an odd number!" << endl;
        return 0;
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j || i + j == n - 1)
                cout << "* ";
            else
                cout << "  ";
        }
        cout << endl;
    }

    return 0;
}
