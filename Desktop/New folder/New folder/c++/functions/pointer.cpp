#include<iostream>
using namespace std;
int main(){
    int x=8;
    int* ptr=&x;
    
    cout<<&x<<endl;//address of variable
    cout<<ptr<<endl;//adress
    cout<<*ptr<<endl;//prt me jo address store hai vo value
    cout<<x<<endl;
    cout<<&ptr<<endl;//p ek  box hai lekin p ka bhi ek address hai
    return 0;
    //* is derefrence operator
}