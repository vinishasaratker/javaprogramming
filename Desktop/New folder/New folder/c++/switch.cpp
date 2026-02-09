// #include<iostream>
// using namespace std;
// int main(){
//     int n1;
//     cin>>n1;
//     char op;
//     cin>>op;
//     int n2;
//     cin>>n2;
//     switch(op){
//         case'+':
//         cout<<n1+n2<<endl;
//         break;
//         case'-':
//         cout<<n1-n2<<endl;
//         break;
//         case'*':
//         cout<<n1*n2<<endl;
//         break;
//         case'/':
//         cout<<n1/n2<<endl;
//         break;
//         default:
//         cout<<"invalid operator"<<endl;
//     }



// }

// homeworkk ques
#include<iostream>
using namespace std;
int main(){
    int amount;
    cin>>amount;
    int rs100,rs50,rs20,rs1;
    switch(1){
        case 1: rs100=amount/100;
        amount=amount%100;
        cout<<"number of 100 rupees notes="<<rs100<<endl;
        case 2: rs50=amount/50;
        amount=amount%50;
        cout<<" number of 50 rupees notes="<<rs50<<endl;
    

          case 3: rs20=amount/20;
        amount=amount%20;
        cout<<"number of 20 rupees notes="<<rs20<<endl;
        case 4: rs1=amount/1;
        amount=amount%1;
        cout<<" number of 1 rupees notes="<<rs1<<endl;
    

    }
    return 0;
}