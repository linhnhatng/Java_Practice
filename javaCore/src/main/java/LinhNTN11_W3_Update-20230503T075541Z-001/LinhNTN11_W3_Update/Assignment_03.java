package assignment03;

import java.util.Scanner;

public class Assignment_03 {
    public static int menu() {
        int itemSelection;
        System.out.println("Welcome, Here's our menu: ");
        System.out.println("1. Coffee");
        System.out.println("2. Bubble Tea");
        System.out.println("3. Beer");
        System.out.println("4. Alcohol");
        System.out.println("5. Orange Juice");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your drink: ");
        itemSelection = scanner.nextInt();
        scanner.nextLine();
        return itemSelection;
    }

    public static boolean ageCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int userSelect;
        do {
            userSelect = menu();
            switch (userSelect) {
                case 1:
                    System.out.println("Your drink is: Coffee");
                    break;
                case 2:
                    System.out.println("Your drink is: Bubble Tea");
                    break;
                case 3:
                    boolean check = ageCheck();
                    if (check) {
                        System.out.println("You are not allow to use this drink");
                        break;
                    }
                    System.out.println("Your drink is: Beer");
                    break;
                case 4:
                    boolean check1 = ageCheck();
                    if (check1) {
                        System.out.println("You are not allow to use this drink");
                        break;
                    }
                    System.out.println("Your drink is: Alcohol");
                    break;
                case 5:
                    System.out.println("Your drink is: Orange Juice");
                    break;
                default:
                    break;
            }
        }
        while (userSelect > 5);
    }
}
