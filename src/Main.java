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
            int n = scanner.nextInt();
            System.out.print("Enter a num:");
            if(Methods.problem3_prime_number(n)) System.out.println("Prime");
            else System.out.println("Coposite");
        }//

    }
}