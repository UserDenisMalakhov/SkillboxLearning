package repeat;

//Лямбда выражения
//Sorted, max, min

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main1_5 {

    private static String staffFile = "resources/data/staff.txt";
    private static String dateFormat = "dd/MM/yyyy";

    public static void main(String[] args) {
        ArrayList<Employee1>staff = new ArrayList<>();

        staff.stream().sorted(Comparator.comparing(Employee1::getSalary)).forEach(System.out::println);
        Optional<Employee1> optional = staff.stream().max(Comparator.comparing(Employee1::getSalary));

        //staff.forEach(System.out::println);
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
