import java.util.ArrayList;
import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task number:");
        int task_number = scanner.nextInt();

        if(task_number == 1){
            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println(Methods.problem1_find_minimum(n,arr,scanner));
        }
    }
}