package exercise;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int choice = -1;
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("MENU ---------------------");
            System.out.println("-ENGLISH VIETNAMESE DICTIONARY-\n" +
                    " Please choice! \n" +
                    " 1.  Add a word... \n" +
                    " 2.  Delete a word... \n" +
                    " 3.  Search a word... \n" +
                    " 4.  Display words... \n" +
                    " 5.  Display word count...\n" +
                    " 6.  Delete all Word... \n" +
                    " 0.  Exit...\n");
            System.out.println("Please enter function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:{
                    System.out.println("Enter your key:");
                    String key = new Scanner(System.in).nextLine();
                    System.out.println("Enter your translate:");
                    String translates = new Scanner(System.in).nextLine();
                    dictionary.addWords(key, translates);
                    break;}
                case 2:{
                    System.out.println("Enter you key:");
                    String key = new Scanner(System.in).nextLine();
                    dictionary.removeWords(key);
                    break;}
                case 3:{
                    System.out.println("Enter you key:");
                    String key = new Scanner(System.in).nextLine();
                    System.out.println("Translate is: "+ dictionary.searchWords(key));
                    break;}
                case 4:
                    dictionary.displayWords();
                    break;
                case 5:
                    System.out.println("Count:" + dictionary.count());
                    break;
                case 6:
                    dictionary.clearAll();
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Goobye! See you again +_*");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }
}
