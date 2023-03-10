package seminar3.cw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Items items = new Items("qwe", "asd", 4);
        Items items1 = new Items("qwe", "asd1", 4);
        Items items2 = new Items("qwe2", "asd2", 4);
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        System.out.println(itemsList);
        String searchName = "qwe";
        Integer sumValue = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)){
                sumValue+= itemsList.get(i).getValue();
                boolean f = true;
                for (int j = 0; j < country.size(); j++) {
                    if(itemsList.get(i).getCountry().equals(country.get(j))) {
                        f = false;
                    }
                }
                if(f){
                    country.add(itemsList.get(i).getCountry());
                }
            }
        }
            System.out.println("c"+country);
            System.out.println("Value = "+sumValue);
    }
}