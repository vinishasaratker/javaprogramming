// #include<iostream>
// using namespace std;
// int main(){
//     int x=7;
//     int y=8;
//     cout<<x<<endl;
//     cout<<y<<endl;
//     int temp=x;//temprary is third variable
//     x=y;
//     y=temp;
//     cout<<x<<endl;
//     cout<<y;
//     return 0;     
// }


//method 2 using math w/t temp


#include<iostream>
using namespace std;
int main(){
    int x=9;
    int y=7;
    cout<<x<<"  "<<y<<endl;
   
    x=x+y;
    y=x-y;
    x=x-y;
    cout<<x<<" "<<y<<endl;
   
    return 0;
}