public class pairsum{
   static void ps(int arr5[]){
     int target=5;
     int n=arr5.length;
      int keyarray[]=new int[100];
      int index=0;
      for(int i=0;i<arr5.length;i++){
         for(int j=i+1;j<arr5.length;j++){
if(arr5[i]+arr5[j]==target){
   int num1=arr5[i];
   int num2=arr5[j];
   if(num1>num2){
      int temp=num1;
      num1=num2;
      num2=temp;
   }
        int keypair=num1*10+num2;
               boolean dup=false;
   for(int k=0;k<index;k++){
      if(keypair==keyarray[k]){
         dup=true;
         break;
      }
      if(!dup){
         System.out.println(num1+" "+num2);
         keyarray[index++]=keypair;     }
   }
}
         }
      }
       }
   public static void main(String[] args) {
      int arr5[]={1,2,3,4,5,4,3,2,1,4,5,6,0};
      ps(arr5);
   }
}
