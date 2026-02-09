#include<iostream>
using namespace std;
int main(){
//     int a,b=1;
//     a=10;
//     if(++a)cout<<b;
//     else cout<<++b;
// cout<<endl;
int a=1;
int b=2;
if(a-->0 || ++b>2){//if(a--> && ++b>2)
    cout<<"inside if";
}
else{
  cout<<  "inside else";
}
cout<<endl;
cout<<a<<" "<<b<<endl;


}

    