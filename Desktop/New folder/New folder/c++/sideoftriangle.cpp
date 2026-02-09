#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<" enter a";
    cin>>a;
    int b;
    cout<<" enter b";
    cin>>b;
    int  c;
    cout<<" enter c";
    cin>>c;
    if((a+b)>c && (b+c)>a && (c+a)>b){
        cout<<" side of triangle";
    }
    else{
        cout<<" not a side of triangle";
    }
    return 0;
}