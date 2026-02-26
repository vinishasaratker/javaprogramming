import java.util.ArrayList;
import java.util.Scanner;

public class CrudOperation {
      public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner sk=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter name of"+(i+1)+"students ");
            String name=sk.nextLine();
            list.add(name);

        }
        System.out.println("student list before update ,delete ");
        for(int i=0;i<list.size();i++){
            String n=list.get(i);
            System.out.println(i);
            System.out.println(" "+n);
            if(n.equals("vini")){
                list.set(i, "xxx");
            }
            else if(n.equals("motu")){
                list.remove(i);
            }
        }
    }
}
