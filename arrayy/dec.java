public class dec {

    static void target(int t[]){
        int n=t.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(((t[i]+t[j])==7)) {
                    System.out.println( " value is  "+t[i]+"   "+t[j]);
                    }
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 90, 65, 12};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {  // Swap if current is greater than next
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Ascending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 🔹 Descending order sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {  // Swap if current is smaller than next
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int t[]={1,9,6,4,5,6};
        target(t);
    }
}

