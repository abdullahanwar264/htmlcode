// Write a program to input marks of five subjects Physics, Chemistry, Biology, 
// Mathematics and Computer. Calculate percentage and grade according to following:
// • Percentage >= 90% : Grade A
// • Percentage >= 80% : Grade B
// • Percentage >= 70% : Grade C
// • Percentage >= 60% : Grade D
// • Percentage >= 40% : Grade E
// • Percentage < 40% : Grade F

package control;

import java.util.Scanner;

public class ques19
 {
    public static void main(String[] args) 
    {
         (Scanner scanner = new Scanner(System.in) {
            int physics = scanner.nextInt();;
            int chemistry = scanner.nextInt();;
            int biology = scanner.nextInt();;
            int mathematics = scanner.nextInt();;
            int computer = scanner.nextInt();;
            
            // Corrected the order of operations using parentheses
            int totalMarks = physics + chemistry + biology + mathematics + computer;
            double percentage = (double) totalMarks / 500 * 100;

            System.out.println("Percentage: " + percentage);

            if (percentage >= 90) {
                System.out.println("Grade A");
            } else if (percentage >= 80) {
                System.out.println("Grade B");
            } else if (percentage >= 70) {
                System.out.println("Grade C");
            } else if (percentage >= 60) {
                System.out.println("Grade D");
            } else if (percentage >= 50) {
                System.out.println("Grade E");
            } else {
                System.out.println("Grade F");
            }

            String grade = (percentage >= 90) ? "A" :
                    (percentage >= 80) ? "B" :
                    (percentage >= 70) ? "C" :
                    (percentage >= 60) ? "D" :
                    (percentage >= 40) ? "E" : "F";

            System.out.println("Grade: " +grade);
        }
    }
}
