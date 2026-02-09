#include<iostream>
using namespace std;
int main(){
    int arr[]={15,20,25,30,35,40,500};
    int n=sizeof(arr)/4;
    int maximum=arr[0];
    for(int i=1;i<=n;i++){
        
 // maximum=max(maximum,arr[i]);

  if(arr[i]>maximum)maximum=arr[i];
}
cout<<maximum;
    return 0;
    
}