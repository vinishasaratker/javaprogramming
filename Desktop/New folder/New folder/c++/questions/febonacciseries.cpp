// #include<iostream>
// using namespace std;
// int main(){
//     int n;
//     cout<<" enter n";
//     cin>>n;
//     int a=0;
//     int b=1;
//     for(int i=1;i<=n;i++){
//         int nextnumber=a+b;
//         cout<<nextnumber<<endl;
//         a=b;
//         b=nextnumber;
//     }
// }


#include<iostream>
using namespace std;

int fibonacci(int n) {
    int a = 0;
    int b = 1;
    
    // if(n == 1) return a;
    // if(n == 2) return b;

    int nextNumber;
    for(int i = 3; i <= n; i++) {
        nextNumber = a + b;
        a = b;
        b = nextNumber;
    }
    return b;
}

int main() {
    int p;
    cout << "Enter position p: ";
    cin >> p;

    int nthTerm = fibonacci(p);
    cout << p << "th term of Fibonacci series is: " << nthTerm << endl;

    return 0;
}
