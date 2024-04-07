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
    public static int problem5_fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return problem5_fibonacci(n - 1) + problem5_fibonacci(n - 2);
        }
    }
    public static double problem6_power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * problem6_power(a, n - 1);
        } else {
            return 1 / (a * problem6_power(a, -n - 1));
        }
    }
    public static void problem7_reverse(int n,Scanner scanner){
        if(n==0) {

        }
        else{
            int temp = scanner.nextInt();
            problem7_reverse(n-1,scanner);
            System.out.print(temp + " ");
        }
    }
    public static boolean problem8_allDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (Character.isDigit(s.charAt(0))) {
            return problem8_allDigits(s.substring(1));
        }
        return false;
    }



}
