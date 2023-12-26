import java.util.*;
import java.io.*;

class GradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;
        System.out.println("Enter the marks of 5 Subjects for each subject 100 marks");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Total Marks:" + sum);
        int avg = sum / 5;
        System.out.println("The average of 5 Subjects:" + avg + "%");
        if (sum > 450 && sum < 500) {
            System.out.println("Your Grade is O");
        } else if (sum > 400 && sum <= 450) {
            System.out.println("Your Grade is A");
        } else if (sum > 350 && sum <= 400) {
            System.out.println("Your Grade is B");
        } else if (sum > 300 && sum <= 350) {
            System.out.println("your Grade is C");
        } else if (sum > 250 && sum <= 300) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("You are FAILED");
        }
    }
}
