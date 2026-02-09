#include<iostream>
using namespace std;
int main(){
    int cp;
    cout<<"enter cost price:";
    cin>>cp;
    int sp;
    cout<<"enter selling price:";
    cin>>sp;
    if(cp<sp){
        cout<<"profit";
    }
    else if(cp>sp){
        cout<<"lose";
    }
    else{
        cout<<"no profit no lose";
    }
return 0;
}