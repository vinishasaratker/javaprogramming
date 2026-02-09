// #include<iostream>
// using namespace std;
// int main(){
//     int n;
//     cout<<" enter n";
//     cin>>n;
//     for(int i=4;i<=3*n+1;i+=3)
//     {
//         cout<<i<<" ";
//     }
// }


#include<iostream>
using namespace std;

int series(int n) {
    int ap = (3 * n) + 7;
    return ap;
}

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    int result = series(n);
    cout << "Result: " << result << endl;

    return 0;
}

