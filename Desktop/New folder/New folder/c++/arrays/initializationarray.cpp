#include<iostream>
using namespace std;
int main(){
    int arr[5]={81,91,71,35,90};//this is called decleration +initialization

  //for(int i=0;i<=4;i++)//normal 
  
    for(int i=4;i>=0;i--)//output in reverse
    {
    cout<<arr[i]<<"  ";}
    return 0;

}
