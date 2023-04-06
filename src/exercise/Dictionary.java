package exercise;

import test.TuDien;

import java.util.*;

public class Dictionary {
    private Map<String, String> data = new TreeMap<String, String>();

    // Thêm 1 từ vào data...
    public String addWords(String key, String translate) {
        return data.put(key, translate);
    }

    // Xoá 1 từ trong data...
    public String removeWords(String key) {
        return data.remove(key);
    }

    // Tra từ trong từ điển...
    public String searchWords(String key) {
        return data.get(key);
    }

    // In ra tất cả danh sách từ khoá...
    public void displayWords() {
        Set<String> listKey = this.data.keySet();
        System.out.println(Arrays.toString(listKey.toArray()));
    }

    // In số lượng từ...size()...
    public int count() {
        return data.size();
    }

    // Xoá tất cả dữ liệu...
    public void clearAll() {
        data.clear();
    }
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
            choice = scanner.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter your key:");
                    String key = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter your translate:");
                    String translates = scanner.nextLine();
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


//    public static void main(String[] args) {
//        TuDien tuDien = new TuDien();
//        int choice = 0;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("---------------");
//            System.out.println("MENU ");
//            System.out.println("Tra từ điển Anh - Việt:\n"
//                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
//                    + "2. Xóa từ\n"
//                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
//                    + "4. In ra danh sách từ khóa\n"
//                    + "5. Lấy số lượng từ\n"
//                    + "6. Xóa tất cả các từ khóa\n"
//                    + "0. Thoát khỏi chương trình\n"
//                    + "");
//            System.out.println("Vui lòng chọn chức năng: ");
//            choice = sc.nextInt();
//            sc.nextLine();
//            if (choice == 1) {
//                System.out.println("Nhập vào từ khóa: ");
//                String key = sc.nextLine();
//                System.out.println("Nhập vào ý nghĩa: ");
//                String translate = sc.nextLine();
//                tuDien.addWords(key, translate);
//            } else if (choice == 2) {
//                System.out.println("Nhập vào từ khóa: ");
//                String key = sc.nextLine();
//                tuDien.removeWords(key);
//            } else if (choice == 3) {
//                System.out.println("Nhập từ cần dịch: ");
//                String key = sc.nextLine();
//                System.out.println("Ý nghĩa là: " + tuDien.searchWords(key));
//            } else if (choice == 4) {
//                tuDien.displayWords();
//            } else if (choice == 5) {
//                System.out.println("Số lượng từ khóa là: " + tuDien.count());
//            } else if (choice == 6) {
//                tuDien.clearAll();
//            }
//        } while (choice != 0);
//    }
}
