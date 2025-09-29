//  Part A: Sum of Integers Using Autoboxing and Unboxing

import java.util.*;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            int num = Integer.parseInt(input);
            numbers.add(num);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println("Total Sum: " + sum);
    }
}
