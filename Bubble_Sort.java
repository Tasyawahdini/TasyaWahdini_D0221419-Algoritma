import java.util.*;
public class JavaApplication1 {

    public static void main(String[] args) {
    
        ArrayList<Integer> arr = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Panjang Array : ");
        int panjang = scan.nextInt();
        
        for (int i = 0; i < panjang; i++) {
            System.out.print("Nilai index ke "+i+" : ");
            int nilai = scan.nextInt();
            arr.add(nilai);
        }
        System.out.println("Sebelum Di Sorting : "+arr);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size()-1; j++) {
                if (arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
        System.out.println("Setelah Di Sorting : "+arr);
    }
}