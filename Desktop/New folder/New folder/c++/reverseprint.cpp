#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<" enter a number";
    cin>>n;
    int r=0;//store reverse number
    
    while(n!=0){
        int ld=n%10;//first find last digit
        r*=10;//then last digit me 10 multiplie kro
        r+=ld;//reverse number me last digit add kr do
        n/=10;//then fir se n ko 10 se divide kr do

    cout<<r;//reverse number print kr do
    
    return 0;
}