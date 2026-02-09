#include<iostream>
using namespace std;
int main(){
    int m;
    cout<<" enter number of rows";
    cin>>m;
    int n;
    cout<<" enter number of columns";
    cin>>n;
    for(int i=1;i<=m;i++){//rows
    for(int j=1;j<=n;j++){// this is called nested loop
        cout<<"   *";
    }
    cout<<endl;}
    return 0;
        
}