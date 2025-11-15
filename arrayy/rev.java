public class rev {
static void remove(int acc[]){
    int temp=acc[0];
    for(int i=0;i<acc.length;i++){
        }}
    static void reverse(int arr4[]){
        int n=arr4.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int temp=arr4[start];
            arr4[start]=arr4[end];
            arr4[end]=temp;
            start++;
            end--;
        }
       
        for(int i=0;i<n;i++){
            System.out.println(" reverse number is "+arr4[i]);
        }

    }
    static void swapalternate(int arrayy[]){
int n=arrayy.length;
for(int i=0;i<n;i+=2){
    if(i+1<n){
      int temp=arrayy[i];
        arrayy[i]=arrayy[i+1];
        arrayy[i+1]=temp;}
       }
   for(int i = 0; i < n; i++){
        System.out.println(arrayy[i]);
    }

    }
    static void uniqueelement(int unique[]){
        int ans = 0;
        for(int i = 0; i < unique.length; i++){
            ans = ans ^ unique[i];
        }
        System.out.println(" unique element is "+ans);
    }
    
    static void pallindrom(int arr5[]){
        int n=arr5.length;
        
        int start=0;
        int end=n-1;
        boolean ispalindrom=true;
        while(start<end){
            if(arr5[start]==arr5[end]){
            ispalindrom=true;
        break;}
            start++;
            end--;
        }
       
       if(ispalindrom){
        System.out.println(" array is pallindrom");
       }
       else if(!ispalindrom){
        System.out.println(" not pallindrom");
       }
       

    }
    public static void main(String[] args) {
        int arr4[]={1,2,3,4,5};
        reverse(arr4);
        int arrayy[]={  5,82,44,56,6,7};
        swapalternate(arrayy);
     int unique[]={3,3,99,6,7,7,3,99};
uniqueelement(unique);
int acc[]={1,1,2,2,3,3,4};
remove(acc);
int arr5[]={1,2,3,7,9,10};
pallindrom(arr5);

    }
}
