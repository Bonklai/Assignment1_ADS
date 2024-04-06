import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int problem1_find_minimum(int n, ArrayList<Integer> arr, Scanner scanner){
        if (n<=0){
            int min = arr.get(0);
            for(int i=0;i<arr.size();i++) {
                if(min>arr.get(i))  min = arr.get(i);}
            return min;
        }
        else{
            arr.add(scanner.nextInt());
            return problem1_find_minimum(n-1,arr,scanner);
        }
    }
    public static void main(String[] args) {

    }
}