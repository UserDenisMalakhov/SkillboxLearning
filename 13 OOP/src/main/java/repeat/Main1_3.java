package repeat;

//Лямбда выражения
//forEach

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1_3 {

    private static String staffFile = "resources/data/staff.txt";
    private static String dateFormat = "dd/MM/yyyy";

    public static void main(String[] args) {
        ArrayList<Employee1>staff = new ArrayList<>();
        Collections.sort(staff, Comparator.comparing(Employee1::getSalary));

//        for (Employee1 employee1 : staff){
//            System.out.println(employee1);
//        }

//        staff.forEach(employee1 -> System.out.println(employee1));
//        staff.forEach(System.out::println);
//
        System.out.println("Old salary: ");
        staff.forEach(System.out::println);

        int salaryIncrease = 10_000;
        staff.forEach(employee1 -> employee1.setSalary(employee1.getSalary() + salaryIncrease));

        System.out.println("\nNew salary: ");
        staff.forEach(System.out::println);
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
