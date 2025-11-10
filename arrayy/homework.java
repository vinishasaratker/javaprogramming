class homework{
    static void maximumm(int max[]){
int n=max.length;
int temp=max[0];
for(int i=0;i<n;i++){
if(max[i]>temp){
    temp=max[i];
}
}
System.out.println(" maximum value is "+temp);
}
static void minimumm(int minn[]){
    int n=minn.length;
    int temp=minn[0];
    for(int i=0;i<n;i++){
        if(minn[i]<temp){
            temp=minn[i];
        }
    }
    System.out.println(" minimum valure is"+temp);

}
static  void secondmax(int mmax[]){
    int temp=mmax[0];
    int n=mmax.length;
    for(int i=0;i<n;i++){
if(mmax[i]>temp){
    temp=mmax[i];
}   }
int smax=mmax[0];
for(int i=1;i<n;i++){
    if(mmax[i]>smax && mmax[i]!=temp){
smax=mmax[i];
    }
}

System.out.println(" second maximum valu is "+smax);
}

static void even(int arr5[]){
    int n=arr5.length;
    for(int i=0;i<n;i++){
        if(arr5[i]%2==0){
            System.out.println("even"+arr5[i]);
        }
        else{
            System.out.println("odd");
        }
    }
}

public static void main(String[] args) {
        int max[]={34,87,65,66,54};
        maximumm(max);
        int minn[]={44,89,99,76,10};
        minimumm(minn);
        int mmax[]={54,67,89,23,76};
        secondmax(mmax);

int arr5[]={4,8,9,98,54};
even(arr5);


    }
}