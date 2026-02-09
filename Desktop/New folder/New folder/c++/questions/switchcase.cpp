// #include<iostream>
// using namespace std;
// int main(){
//    int a,b;
//    cout<<" enter a:";
//    cin>>a;
//    cout<<" enter b:";
//    cin>>b;
//    char op;
//    cout<<" enter the operation you want to perform"<<endl;
//    cin>>op;
//    switch(op){
//     case'+':cout<<(a+b)<<endl;
//     break;
//     case'-':cout<<(a-b)<<endl;
//     break;
//     case'*':cout<<(a*b)<<endl;
//     break;
//     case'/':cout<<(a/b)<<endl;
//     break;
//     default:cout<<"enter a valid operation";
//        }


// }

#include <iostream>
using namespace std;

int main() {
    int amount = 1330;
    int hundred = 0, twenty = 0, one = 0;

    switch (1) {
        case 1:
            hundred = amount / 100;
            amount = amount % 100;
        case 2:
            twenty = amount / 20;
            amount = amount % 20;
        case 3:
            one = amount;
            break;
        default:
            cout << "Invalid operation" << endl;
    }

    cout << "₹100 notes: " << hundred << endl;
    cout << "₹20 notes: " << twenty << endl;
    cout << "₹1 notes: " << one << endl;

    return 0;
}
