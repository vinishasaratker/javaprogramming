// pass by reference means direct valuue  se nahi address  se swapping krai hai address involved hota hai
#include<iostream>
using namespace std;
void swap(int*a,int*b){// jo address hai vo pointer me store  ho rhe hai
    int temp=*a;
    *a=*b;
    *b=temp;

}
int main(){
    int x=12;
    int y=34;
    cout<<x<<" "<<y<<endl;
    swap(&x,&y);//address ko bhej rhe hai
    cout<<x<<" "<<y<<endl;
    return 0;
    //*a  or *b se hum printing bhi kar skte hai or value bhi access kar skte hai
} 