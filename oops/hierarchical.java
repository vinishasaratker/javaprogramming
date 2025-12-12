class hierarchical{
public static void main(String[] args) {
    animal a=new animal();

    fish f=new fish();
System.out.println(f.leg);
    snake s1= new snake();

    lion l= new lion();
 
}
}

class animal{
int leg=9;
String eat="food";
String swim;
String teeth;
String king;
void walk(){
    System.out.println(" they can walk");
}

}
class fish extends animal{
    void swim(){
    System.out.println(" they can swim");
}
}
class snake extends animal{
   // String teeth;
   void noteeth(){
    System.out.println(" they dont have teeth");
}

}
class lion extends animal{
    
   // String king;
   void king(){
    System.out.println(" lion is king");
}
}