package exercise3;

import java.util.Scanner;

public class TestExercise3
{
    public static void main(String[] args)
    {
        Scanner input   = new Scanner(System.in);

        Exercise3 list1 = new Exercise3 ();
        Exercise3 list2 = new Exercise3 ();

        System.out.print("Enter five integers for list1: ");

        for (int i = 0; i < 5; i++)
        {
            list1.add(input.nextInt());
        }

        System.out.print("Enter five integers for list2: ");

        for (int i = 0; i < 5; i++)
        {
            list2.add(input.nextInt());
        }

        System.out.println("Max number is "         + exercise3.Exercise3.max(list1));
        System.out.println("Sum of list is "        + exercise3.Exercise3.sum(list1));
        System.out.println("Union of the lists is " + exercise3.Exercise3.union(list1, list2));
    }
}
