public class multipleinheritance {
    public static void main(String[] args) {
        janwar animal=new janwar();
        animal.eat="food";
        dog doggy=new dog();
        doggy.color="brown";
        System.out.println(" dogs color is "+doggy. color);

       snake kobra=new snake();
       kobra.teeth="no teethy";
       System.out.println(" kobra is "+ kobra.teeth);
    }
}

class janwar{
    String eat;
    String color;
    int legs;
    
}
class dog extends janwar{
String hair;

}
class snake extends dog{
    String teeth;
}
