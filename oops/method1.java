class bike{
    int price=90000;
     String quality ="nice";
    static int b=90;
     private int health;// yeh private hai to hum isko only class ke andr hi access kar skte hai 
// getter and setter use
// Getter वह method होता है जो private variable की value return करता है।
// Setter वह method होता है जो private variable की value set/change करता है।
private int price2;
private String condition;

int getprice2(){
    return price2;
    }
    void setprice2(int price2){
        this.price2=price2;
        }
}

public class method1 {
    
    public static void main(String[] args) {
        
        bike obj=new bike();
       
        System.out.println("method 1"+obj.price); //ya to hu8um aise print kr skte hai obj lga kar   kyunki yeh abhi non static hai 
      System.out.println("method 2"+bike.b);

//       ✔ static member → class के नाम से access कर सकते हैं
// ❌ non-static member → class के नाम से access नहीं कर सकते

//------
obj.setprice2(67000);
System.out.println("new price is getter variable "+obj.getprice2());

    }
}
