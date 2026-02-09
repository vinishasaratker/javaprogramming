#include<iostream>
using namespace std;

int main() {
    int n;
    cout<<"enter n";
    cin>>n;
    //count number of 1's in the given number
    int count=0;
    while(n!=0)
    {
        if(n&1){
            count++;
        }
        n=n>>1;
    }
    cout<<count;
return 0;






    return 0;
}