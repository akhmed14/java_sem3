package seminar3.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("высший1",220,1);
        Product product2 = new Product("средний",120,2);
        Product product3 = new Product("высший2",420,3);
        Product product4 = new Product("высший3",330,2);
        Product product5 = new Product("высший4",330,2);
        List<Product> allProduct = new ArrayList<>();
        allProduct.add(product1);
        allProduct.add(product2);
        allProduct.add(product3);
        allProduct.add(product4);
        allProduct.add(product5);
        String searchName = "высший";
        Integer temp = 0;
        String nameVariety = "";
        for (int i = 0; i < allProduct.size(); i++) {;
            if(allProduct.get(i).getName().equals(searchName) &&
                    allProduct.get(i).getVariety()==1 ||
                    allProduct.get(i).getVariety()==2 ){
                if(temp < allProduct.get(i).getPrice()){
                    temp = allProduct.get(i).getPrice();
                }
            }
        }
        for (int i = 0; i < allProduct.size(); i++) {
            if (allProduct.get(i).getName().equals(searchName) &&
                    allProduct.get(i).getVariety() == 1 ||
                    allProduct.get(i).getVariety() == 2) {
                if (allProduct.get(i).getPrice().equals(temp)) {
                    nameVariety+=allProduct.get(i).getName()+ "\n";
                }
            }
        }
        System.out.println("Name product дорогих содержащих слово 'высший':");
        System.out.println(nameVariety);
        System.out.println("Наибольшая цена товара "+temp+" рублей");
    }
}
