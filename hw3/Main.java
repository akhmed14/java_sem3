package seminar3.hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("name1","author1",100,2010,7);
        Book book2 = new Book("name2","uthor2",150,2015,2);
        Book book3 = new Book("name3","author3",160,2000,7);
        Book book4 = new Book("name4","uthor4",120,2001,7);
        Book book5 = new Book("name5","Author5",130,2011,7);
        List<Book> allBook = new ArrayList<>();
        allBook.add(book1);
        allBook.add(book2);
        allBook.add(book3);
        allBook.add(book4);
        allBook.add(book5);
        String a = "A";
        String nameBook = "";
        for (int i = 0; i < allBook.size(); i++) {
            if(prostCh(allBook.get(i).getCountPg()) && allBook.get(i).getAuthor().toUpperCase().contains(a)){
                if(allBook.get(i).getYear()>=2010 && allBook.get(i).getYear()<=2023 ) {
                   nameBook += allBook.get(i).getName()+"\n";
                }
            }
        }
        System.out.println(nameBook);
    }
    private static boolean prostCh(Integer num) {
        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
