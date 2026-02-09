#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<" enter rows: ";
    cin>>n;
    int k;
    cout<<" enter column:";
    cin>>k;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=k;j++){
           if(i==1 or i==n or j==1 or j==k)
            cout<<" *";
            else
            cout<<"  ";
        }
        cout<<endl;
    }
    return 0;
}