// #include<iostream>
// using namespace std;
// int fact(int x){//declare function
//     int f=1;
//     for(int i=1;i<=x;i++){
//         f*=i;
//         f*=i;
//     }
//     return f;

// }
// int ncr(int n,int r){
//     int a=fact(n);
//     int b=fact(r);
//     int c=fact(n-r);
//     return a/(b*c);

// }
// int main(){
//     int n;
//     cout<<" enter n:";
//     cin>>n;
//     for(int i=0;i<=n;i++)
//     for(int j=0;j<=i;j++)
//     {
//         cout<<ncr(i,j)<<" ";
//     }
//     cout<<endl;
//     return 0;
// }  #include<iostream>
#include<iostream>
using namespace std;

int fact(int x){
    int f = 1;
    for(int i = 1; i <= x; i++){
        f *= i;
    }
    return f;
}

int ncr(int n, int r){
    return fact(n) / (fact(r) * fact(n - r));
}

int main(){
    int n;
    cout << "Enter n: ";
    cin >> n;
    for(int i = 0; i <= n; i++) {
        for(int j = 0; j <= i; j++) {
            cout << ncr(i, j) << " ";
        }
        cout << endl;
    }
    return 0;
}
