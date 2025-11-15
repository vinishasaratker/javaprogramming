public class freqcount {
    static void freqcount(int arr1[]){
int n=arr1.length;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr1[i]==arr1[j]){
                    ++count;
                    arr1[j]=-1;
                }
            }
            if(arr1[i]!=-1){
                System.out.println(arr1[i]+" "+count+"times");
            }

        }
    }
    public static void main(String[] args) {
     int arr1[]={1,2,2,23,5,5,6,8,90,7,7,6,5,4,32,23};
        freqcount(arr1);
    }
}
