package LOGICALINTERVIEWQUESTION;
public class Twiceelement {
 public static void checktwice(int aarray[]) {
    int n = aarray.length;

    for (int i = 0; i < n; i++) {
        int count = 1;
      for (int j = i + 1; j < n; j++) {
            if (aarray[i] == aarray[j]) {
                count++;
            }
        }
     if (count == 2) {
            System.out.println("Occurring exactly twice: " + aarray[i]);
        }
    }
}
    public static void main(String[] args) {
       int aarray[]={8,9,0,7,7};
       checktwice(aarray);

    }
}
