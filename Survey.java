import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;

        scanner.close();//prevent resourse leak?

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you " + name + " for answering all " + counter + " questions");//counter will answer how many Qs were answered

        System.out.println("Weekly, you spend $" + coffeeAmount + " on coffee");
        System.out.println("Weekly, you spend $" + foodAmount + " on food");

    }
}
