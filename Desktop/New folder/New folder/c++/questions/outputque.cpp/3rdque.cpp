#include<iostream>
using namespace std;
int main(){
    for(int i=0;i<5;i++){
        for(int j=i;j<=i;j++){
            if(i+j==10){
                break;
            }
            cout<<i<<" "<<j<<endl;
        }
    }
}
