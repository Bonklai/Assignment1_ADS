import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    public static int problem1_find_minimum(int n, ArrayList<Integer> arr, Scanner scanner){
        if (n == 0){
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
    public static double problem2_average(int n,ArrayList<Integer> arr,Scanner scanner){
        if(n<=0){
            double sum = 0 ;
            for(int i:arr){
                sum+=i;
            }
            return  sum/arr.size();
        }
        else{
            int temp = scanner.nextInt();
            arr.add(temp);
            return problem2_average(n-1,arr,scanner);
        }
    }

    public static boolean problem3_prime_number(int n){
        short count = 0;
        for(int i=2;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==1) return true;
        else return false;
    }
    public static int problem4_factorial_num(int n){
        if (n <=1) return n;
        else return n * problem4_factorial_num(n-1);
    }

}
