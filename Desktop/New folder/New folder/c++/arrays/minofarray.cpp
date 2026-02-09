#include<iostream>
using namespace std;
int main(){
    int arr[]={15,20,25,30,35,40,500};
    int n=sizeof(arr)/4;
    int minimum=arr[0];
    for(int i=1;i<=n;i++){
        
  minimum=min(minimum,arr[i]);

  //if(arr[i]<minimum)minimum=arr[i];
}
cout<<minimum;
    return 0;
    
}