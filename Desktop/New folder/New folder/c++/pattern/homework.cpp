#include<iostream>
 using namespace std;
 int main(){
     int n;
     cout<<" enter n";
     cin>>n;
     for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
             if(i%2==1){
                 cout<<j<<" ";
             }
             else{
                 cout<<(char)(j+64)<<" ";
             }
           
         }
         cout<< endl;
     }
     return 0;
}
//#include<iostream>
// using namespace std;
// int main(){
//     int n;
//     cout << "Enter n: ";
//     cin >> n;

//     for(int i = 1; i <= n; i++) {
//         for(int j = 1; j <= i; j++) {
//             if(i % 2 == 1) {
//                 // Odd row: print numbers
//                 cout << j << " ";
//             } else {
//                 // Even row: print characters
//                 cout << (char)(j + 64) << " ";
//             }
//         }
//         cout << endl; // Move to the next line after each row
//     }

//     return 0;
// }
