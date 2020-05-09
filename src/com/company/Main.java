package com.company;

import com.company.backpacktask.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        startMenu();
        try {
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Please enter a number");
                    System.out.println(FirstTask.isEvenAndIsSimple(input.nextInt()));
                    break;
                case 2:
                    System.out.println("Please enter two numbers");
                    System.out.println(SecondTask.greatestCommonDivisorAndLeastCommonMultiple(input.nextInt(), input.nextInt()));
                    break;
                case 3:
                    System.out.println("Please enter a text");
                    input.nextLine();
                    ThirdTask.sortByLengthAndFirstLetterToUpperRegister(input.nextLine()).forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Please enter a text and word");
                    input.nextLine();
                    System.out.println(FourthTask.countOfWordInText(input.nextLine(), input.nextLine()));
                    break;
                case 5:
                    System.out.println("Please enter a final count which is <= 100");
                    int N = input.nextInt();
                    if (N > 100) {
                        throw new Exception();
                    }
                    for (int i = 0; i <= N; i++) {
                        if ((FifthTask.isPalindrome(i))) {
                            System.out.println(i + " is palindrome");
                        }
                    }
                    break;
                case 6:
                    List<Item> items = new ArrayList<>();
                    System.out.println("Please enter a amount of items");
                    int countOfItems = input.nextInt();
                    for (int i = 0; i < countOfItems; i++) {
                        System.out.println("Please enter weight and price");
                        items.add(new Item(input.nextDouble(), input.nextDouble()));
                    }
                    System.out.println("Please enter weight of backpack");
                    SixthTask sixthTask = new SixthTask(input.nextDouble());
                    sixthTask.makeAllSets(items);
                    sixthTask.getBestSet().forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("Error enter, try again");
        }
    }

    public static void startMenu() {
        System.out.println("Enter number of task:");
        System.out.println("1. First  task.");
        System.out.println("2. Second task.");
        System.out.println("3. Third  task.");
        System.out.println("4. Fourth task.");
        System.out.println("5. Fifth  task.");
        System.out.println("6. Sixth  task.");
    }
}
