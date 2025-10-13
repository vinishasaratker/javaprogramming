
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
  import java.util.Scanner;
  class loop1{
    public static void main(String[] args) {
        int i=9;
        do{
            System.out.println(i++);
        }
        
        while(i<=19);
        System.out.println("               ");
        int b=2;
        while(b<9){
            System.out.println(b++);
        }
      System.out.println();
        for(int v=1;v<=15;v++){
            System.out.println(v);
        }

    }
  }