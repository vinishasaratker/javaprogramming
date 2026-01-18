//  class two{
//     void sum(){
//         System.out.println("sum");

//     }
//  }
//  class one extends two{
//     void sum(){
//         System.out.println("sum3");
//     }
//  }

// class polymorphism{
//     public static void main(String[] args) {
//         // polymorphism means many form of objects operators and objects
//         //function overloading-- mtlb do function ke name same hote hai ek hi class me 
//         // agr aisa hai to ya to unke parameters alg kro ya koi or parameter de do


//        two obj=new two();
//        sum();
//     }
// }

//**** function overriding */
//==0----- polymorphism by class
class two{
    void sum(){
        System.out.println("sum1");
        
    }
}

class three extends two{
    void sum(){
        System.out.println("sum3");
    }

}
class polymorphism{
    public static void main(String[] args) {
        two obj;
        obj=new two();
        obj.sum();
        obj=new three();
        obj.sum();


    }
}