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
            System.out.println(Methods.problem1_find_minimum(n,arr,scanner));
        }
        else if(task_number == 2){
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.print("Num of elements:");
            int n = scanner.nextInt();
            System.out.println(Methods.problem2_average(n,arr,scanner));
        } else if (task_number == 3) {
            System.out.print("Enter a num:");
            int n = scanner.nextInt();

            if(Methods.problem3_prime_number(n)) System.out.println("Prime");
            else System.out.println("Coposite");
        }else if (task_number == 4){
            System.out.print("Enter a num:");
            int n = scanner.nextInt();
            System.out.print(Methods.problem4_factorial_num(n));
        }else if( task_number == 5){
            System.out.print("Enter a num:");
            int n = scanner.nextInt();
            System.out.println(Methods.problem5_fibonacci(n));
        }else if(task_number == 6){
            System.out.print("Enter a for a^n  a=");
            double a = scanner.nextDouble();
            System.out.print("n=");
            int n = scanner.nextInt();
            System.out.println(Methods.problem6_power(a,n));
        }else if(task_number == 7){
            System.out.print("Enter num:");
            int n = scanner.nextInt();
            Methods.problem7_reverse(n,scanner);
        }

    }
}