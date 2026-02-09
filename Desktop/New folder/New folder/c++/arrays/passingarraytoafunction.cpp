#include<iostream>
using namespace std;
void change(int arr[]){// array koo bhheja hai to array hi recieve krenga array ka name change bhi kr skte hai like x,y,z
    arr[0]=9;
}
int main(){
    int arr[3]={4,7,8};
    for(int i=0;i<=2;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    change(arr);
    for(int i=0;i<=2;i++){
        cout<<arr[i]<<" ";
    }
}
// array pass by refrence hota hai 
