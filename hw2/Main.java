package seminar3.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("name1", "country1",10,21,1);
        Tovar tovar2 = new Tovar("name2", "country2",14,20,2);
        Tovar tovar3 = new Tovar("name3", "country3",10,25,3);
        Tovar tovar4 = new Tovar("name4", "country4",15,20,2);
        Tovar tovar5 = new Tovar("name5", "country5",20,30,1);
        List<Tovar> allTovar = new ArrayList<>();
        allTovar.add(tovar1);
        allTovar.add(tovar2);
        allTovar.add(tovar3);
        allTovar.add(tovar4);
        allTovar.add(tovar5);
        Integer minPrice = 0;
        Integer varietyName = 0;
        String nameVariety = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт 1,2,3");
        int n = scanner.nextInt();
        if(n > 0 && n <= 3){
            varietyName = n;
        }
        else{
            System.out.println("Такого сорта нет. Введите заново");
        }
        scanner.close();
        for (int i = 0; i < allTovar.size(); i++) {
            if(allTovar.get(i).getVariety().equals(varietyName)){
                     minPrice = allTovar.get(i).getPrice();
            }
        }
        for (int i = 0; i < allTovar.size(); i++) {
            if(allTovar.get(i).getVariety().equals(varietyName)){
                 if (allTovar.get(i).getPrice() <= minPrice) {
                     minPrice = allTovar.get(i).getPrice();
                     nameVariety+=allTovar.get(i).getName()+ "\n";
                 }
            }
        }
        System.out.println("Наименования заданного сорта с наименьшой ценой :");
        System.out.println(nameVariety);
        System.out.println("Наименьшяя цена товаров "+minPrice+" рублей");
    }
}
