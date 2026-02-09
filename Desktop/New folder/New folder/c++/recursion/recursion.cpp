#include<iostream>
using namespace std;
void greet(){
cout<<"vini"<<endl;
greet();// jab function apne ap ko bar bar call krta hai to usko recursion khte hai
}


int main(){
    greet();
    return 0;

}