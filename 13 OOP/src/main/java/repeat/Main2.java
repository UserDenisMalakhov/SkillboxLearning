package repeat;

//Лямбда выражения
//Comparator.comparing

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    private static String staffFile = "resources/data/staff.txt";
    private static String dateFormat = "dd/MM/yyyy";

    public static void main(String[] args) {
        ArrayList<Employee1>staff = new ArrayList<>();
//        Collections.sort(staff, new Comparator<Employee1>() {
//            @Override
//            public int compare(Employee1 o1, Employee1 o2) {
//                return o1.getSalary().compareTo(o2.getSalary());
//            }
//        });
        Collections.sort(staff, Comparator.comparing(Employee1::getSalary));

        for (Employee1 employee1 : staff){
            System.out.println(employee1);
        }
    }

    private static ArrayList<Employee1> loadStaffFromFile(){
        ArrayList<Employee1>staff = new ArrayList<>();
        try {
            List<String>lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines){
                String[]fragments = line.split("\t");
                if (fragments.length != 3){
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee1(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat).parse(fragments[2]))
                ));
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return staff;
    }
}
