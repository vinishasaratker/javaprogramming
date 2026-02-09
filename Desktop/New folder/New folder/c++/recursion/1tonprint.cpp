#include<iostream>
using namespace std;
void print(int x,int n){//here we use extra parameter which is called parameterized form
    if(x>n)return;
    cout<<x<<endl;
    print(x+1,n);
}

int main(){
    int n;
    cout<<" enter n";
    cin>>n;
    print(1,n);
    return 0;
}