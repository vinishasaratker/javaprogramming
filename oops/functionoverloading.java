public class functionoverloading {
    // compile time poly morphism 
    public static void main(String[] args) {
        calculator calc=new calculator();
        System.out.println(calc.sum(1,3));
        System.out.println(calc.sum( (float)1.6,(float)3.7));
        System.out.println(calc.sum(1,3,6));
        animal obj=new animal();
obj.eat();
dog d=new dog();
d.eat();
    }
}

class animal{
    void eat(){
        System.out.println("eat food");
    }
}
class dog extends animal{
    void eat(){
        System.out.println(" hello there is function overriding ");
    }
}


class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}