import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task number:");
        int task_number = scanner.nextInt();

        if(task_number == 1){
            System.out.print("Num of elements");
            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            long time1 = System.currentTimeMillis();
            System.out.println(Methods.problem1_find_minimum(n,arr,scanner));
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }
        else if(task_number == 2){
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.print("Num of elements:");
            int n = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            System.out.println(Methods.problem2_average(n,arr,scanner));
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        } else if (task_number == 3) {
            System.out.print("Enter a num:");
            int n = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            if(Methods.problem3_prime_number(n)) System.out.println("Prime");
            else System.out.println("Coposite");
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }else if (task_number == 4){
            System.out.print("Enter a num:");
            int n = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            System.out.print(Methods.problem4_factorial_num(n));
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }else if( task_number == 5){
            System.out.print("Enter a num:");
            int n = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            System.out.println(Methods.problem5_fibonacci(n));
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }else if(task_number == 6){
            System.out.print("Enter a for a^n  a=");
            double a = scanner.nextDouble();
            System.out.print("n=");
            int n = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            System.out.println(Methods.problem6_power(a,n));
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }else if(task_number == 7){
            System.out.print("Enter num:");
            int n = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            Methods.problem7_reverse(n,scanner);
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }else if(task_number == 8){
            System.out.print("Enter a string:");
            String s = scanner.next();
            long time1 = System.currentTimeMillis();
            if(Methods.problem8_allDigits(s)) System.out.println("Yes");
            else System.out.println("No");
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }else if (task_number == 9){
            System.out.print("Enter n=");
            int n = scanner.nextInt();
            System.out.print("Enter k=");
            int k = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            System.out.println(Methods.problem9_binomialCoefficient(n,k));
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }else if(task_number == 10){
            System.out.print("Enter a=");
            int a = scanner.nextInt();
            System.out.print("Enter b=");
            int b = scanner.nextInt();
            long time1 = System.currentTimeMillis();
            System.out.println(Methods.problem10_gcd(a,b));
            long time2 = System.currentTimeMillis();
            System.out.println(time2-time1 + "ms");
        }
        else{
            System.out.println("Wrong!");
        }
    }
}