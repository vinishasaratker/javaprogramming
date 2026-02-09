#include<iostream>
using namespace std;
int main(){
    int l;
    cout<<" enter l:";
    cin>>l;
    int b;
    cout<<" enter b:";
    cin>>b;
    int a=l*b;
    int p=2*(l+b);
    if(a>p){
        cout<<"a is greater than p";
    }
    else{
        cout<<"p is greater than l";
    }
    return 0;
}