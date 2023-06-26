import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        question_1();
        System.out.println("_________________");
        question_2();
        System.out.println("_________________");
        question_3();
    }

    public static void question_2() {
        System.out.print("Enter your grade : ");
        double grade = input.nextDouble();

        if (grade <= 100 && grade >= 85)
            System.out.println("grade A");
        else if (grade < 85 && grade >= 75)
            System.out.println("grade B");
        else if (grade < 75 && grade >= 65)
            System.out.println("grade C");
        else if (grade < 65 && grade >= 60)
            System.out.println("grade D");
        else
            System.out.println("grade E");
    }

    public static void question_1() {
        System.out.print("Enter your name : ");
        String name = input.next();

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        System.out.print("Enter your length : ");
        double length = input.nextDouble();

        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age);
        System.out.println("Your age is : " + length);


    }

    public static void question_3() {
        System.out.print("Enter your count : ");
        double count = input.nextDouble();
        System.out.print("Enter your earnsByYear : ");
        double earnsByYear = input.nextDouble();
        double temp = count;
        int yearsToDouble;
        for (yearsToDouble = 0; temp <= 2 * count; yearsToDouble++)
            temp *= 1 + earnsByYear;
        System.out.println("The number of the yearsToDouble to double your account : " + yearsToDouble);

    }
}
