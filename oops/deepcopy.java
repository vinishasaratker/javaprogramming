public class deepcopy {
    public static void main(String[] args) {
        String name[]={"hyy","byyy","hmmm"};
        Copy obj1=new Copy(name);
        Copy obj2=new Copy(obj1);
        obj2.name[0]="namaste";
        System.out.println(obj1.name[0]);
         System.out.println(obj2.name[0]);
    }
}

class Copy{
    
String name[];
Copy(String name[]){
    this.name=name;
}
Copy(Copy obj1){
    this.name=new String[obj1.name.length];
    for(int i=0;i<obj1.name.length;i++);
        {
        name[i]=obj1.name[i];
    }
}
}