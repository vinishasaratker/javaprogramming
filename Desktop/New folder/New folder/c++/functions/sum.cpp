// #include<iostream>
// using namespace std;
// // //sum of two numbers
//  int sum(int a,int b){
//  int s=a+b;
//  cout<<endl;
// return s;


// }
// int main(){

//    cout<<sum(8,6);//calling a function

   
//    return 0;}
// // }



// // }


 #include<iostream>
using namespace std;
int sumN(int n){
 int sum=0;
 for(int i=1;i<=n;i++){
     sum+=i;

 }
return sum;
 }

 int main(){
     cout<<sumN<<(5)<<endl;
     cout<<sumN<<(8)<<endl;
    cout<<sumN<<(500)<<endl;
     return 0;
 }
