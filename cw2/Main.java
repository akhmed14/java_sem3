package seminar3.cw2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Павлова", 2, 16000,  List.of(3,4,6));
        Student st2 = new Student("Смирнова", 2, 12000,  List.of(4,4,6));
        Student st3 = new Student("Смирнов", 2, 12000,  List.of(4,4,6));
        Student st4 = new Student("Мирнова", 2, 13000,  List.of(4,4,6));
        Student st5 = new Student("Смирнов", 2, 12000,  List.of(4,4,6));
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(st1);
        allStudents.add(st2);
        allStudents.add(st3);
        allStudents.add(st4);
        allStudents.add(st5);
        for (Student student:allStudents){
            if(strStudentsEnd(student.getName(),"ова")){
                int sum = 0;
                for (Integer count: student.getCount()){
                    sum+=count;
                }
                if(sum % 2 == 0){
                    System.out.println("Фамилия-"+student.getName()+"; Стипендия="+student.getMoney());

                }
            }
        }
    }

    public static boolean strStudentsEnd(String strName, String findStr) {
        int charCount = strName.length() - findStr.length();
        if(strName.substring(charCount).equals(findStr)) return true;
        return false;
    }
}
