import java.util.Scanner;

public class function2 {
    void printname(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        function2 obj = new function2();  // Create object of class
        obj.printname(name);              // Call the method correctly
    }
}

