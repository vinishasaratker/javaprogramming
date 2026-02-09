#include<iostream>
using namespace std;
int main(){
    int arr [5];//decleration
    cout<<" enter array elements:";
    for(int i=0;i<=4;i++){
        cin>>arr[i];

    }
    for(int i=0;i<=4;i++){
        cout<<arr[i]<<"  ";
    }
    arr[0]=800;//update
    cout<<endl;
    for(int i=0;i<=4;i++){
        cout<<arr[i]<<"  ";
    }
    return 0;
}