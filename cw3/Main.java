package seminar3.cw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cub1 = new Cube(3,"желтый", "деревянный");
        Cube cub2 = new Cube(2,"красный", "стальной");
        Cube cub3 = new Cube(1,"желтый", "металлический");
        Cube cub4 = new Cube(2,"синий", "деревянный");
        List<Cube> allCube = new ArrayList<>();
        allCube.add(cub1);
        allCube.add(cub2);
        allCube.add(cub3);
        allCube.add(cub4);
        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (int i = 0; i < allCube.size(); i++) {
            if(allCube.get(i).getColor().equals("желтый")){
                k++;
                volume+= volumeCube(allCube.get(i).getSize());
            }
            if(allCube.get(i).getMaterial().equals("деревянный")&&allCube.get(i).getSize()==3){
                kWood++;
            }
        }
        System.out.println("1 пункт :"+k+" Volume ="+volume);
        System.out.println("2 пункт :"+kWood);
    }

    private static Integer volumeCube(Integer size) {
        return size*size*size;
    }
}
