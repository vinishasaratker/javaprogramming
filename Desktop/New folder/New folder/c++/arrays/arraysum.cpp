#include<iostream>
using namespace std;
int main(){
    int arr[]={34,56,90, 9,8,7,6,5};
    int n=sizeof(arr)/4;//size check krta hai
    int sum=0;
    for(int i=0;i<=n;i++){
    sum+=arr[i];//sum me hamesha array ke element ko add kr
}
cout<<sum;
return 0;
}