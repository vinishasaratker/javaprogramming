#include<iostream>
using namespace std;
int main(){
    int arr[]={11,10,2};
    int n=sizeof(arr)/4;//size check krta hai
    int product=1;
    for(int i=0;i<=n;i++){
    product*=arr[i];
}
cout<<product;
return 0;
}