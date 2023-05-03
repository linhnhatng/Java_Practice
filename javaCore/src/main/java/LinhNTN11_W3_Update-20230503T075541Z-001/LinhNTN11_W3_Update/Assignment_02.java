package assignment03;

import java.util.Scanner;

public class Assignment_02 {
    // the first way
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount: ");
        int money = sc.nextInt();

        int note1 = money / 500;
        System.out.println("500$: " + note1);

        int note2 = money % 500 / 200;
        System.out.println("200$: " + note2);

        int note3 = money % 500 % 200 / 100;
        System.out.println("100$: " + note3);

        int note4 = money % 500 % 200 % 100 / 50;
        System.out.println("50$: " + note4);

        int note5 = money % 500 % 200 % 100 % 50 / 20;
        System.out.println("20$: " + note5);

        int note6 = money % 500 % 200 % 100 % 50 % 20 / 10;
        System.out.println("10$: " + note6);

        int note7 = money % 500 % 200 % 100 % 50 % 20 % 10 / 5;
        System.out.println("5$: " + note7);

        int note8 = money % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2;
        System.out.println("2$: " + note8);

        int note9 = money % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1;
        System.out.println("1$: " + note9);

        int totalNote = note1 + note2 + note3 + note4 + note5
                + note6 + note7 + note8 + note9;
        System.out.println("Total number of banknote used: " + totalNote);
    }


    // The second way
//    public static void countAmount(int amount)
//    {
//        int[] notes = new int[]{ 500, 200, 100, 50, 20, 10, 5, 2, 1 };
//        int[] noteCount = new int[9];
//
//        for (int i = 0; i < 9; i++) {
//            if (amount >= notes[i]) {
//                noteCount[i] = amount / notes[i];
//                amount = amount % notes[i];
//            }
//        }
//        System.out.println("Number of note: ");
//
//        for (int i = 0; i < 9; i++) {
//            if (noteCount[i] != 0) {
//                System.out.println(notes[i] + " : "
//                        + noteCount[i]);
//            }
//        }
//    }
//
//    public static void main(String argc[]){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input amount: ");
//        int amount = scanner.nextInt();
//        countAmount(amount);
//    }
}
