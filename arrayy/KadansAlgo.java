public class KadansAlgo {
    // kadans algorithm says ki koi bhi array hai or agr  usme kisi bhi values ka sum zero aa rha hai to usko zero bna do because negative hone se better haiki vo zero ho jaye 
    public static void kadans(int numbers[]){

        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            currentsum=currentsum+numbers[i];
            if(currentsum<0){
        currentsum=0;
            }
         maxsum=Math.max(currentsum,maxsum);
        }
        System.out.println("our maximum sub array is " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,-6,-1,-4,8,9,7};
        kadans(numbers);
    }
}
