#include<iostream>
using namespace std;
int main()
{
    int a;
    cout<<"enter 1st number:";
    cin>>a;
    int b;
    cout<<"enter 2nd number:";
    cin>>b;
    int c;
    cout<<"enter 3rd number:";
    cin>>c;
    if(a>b && a>c)
    {
        cout<<" a is greater";
    }
    else if(b>a && c>b){
        cout<<" b is greatest";
    }
    else{
        cout<<" c is greatest";
    }
}