
// repetative tast    same work perform krna hai multiple time
//2*2
//2*2
//2*2
  // iteration    same kind of work
  //2*1
  //2*2
  //2*3
  // why we make three loop--- readability  ko shi krne ke liye mtlb kon se question me kon sa suitable honga
  // do whilw loop ek bar to chalta hi chalta hai 
  // while--- exit control loop bhi khte hai 

    //     int i=9;
    //     do{
    //         System.out.println(i++);}
    //      while(i<=19);
    //     System.out.println("   ");
    //     int b=2;
    //     while(b<9){
    //         System.out.println(b++);
    //     }
    //   System.out.println();
    //     for(int v=1;v<=15;v++){
    //         System.out.println(v);
    //     }
    // Scanner obj=new Scanner(System.in);
    // System.out.println(" enter any number");
    // int n=obj.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(n*i);
    // }
    //     System.out.println(" enter any number 2");
    // int n2=obj.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(n2*i);
    // }

    // int n3=obj.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(n3*i);
    // }
    // int n4=obj.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(n4*i);
    // }
    // int n5=obj.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(n5*i);
    // }
    // int n6=obj.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(n6*i);
    // }
  import java.util.Scanner;
  class loop1{
    public static void main(String[] args) {
    int m=5;
    int fact=1;
    for(int i=1;i<=5;i++){
         fact=fact*i;}
    System.out.println(fact);
    }
  }