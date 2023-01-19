package repeat;

//Лямбда выражения
//Map reduce

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main1_6 {

    private static String staffFile = "resources/data/staff.txt";
    private static String dateFormat = "dd/MM/yyyy";

    public static void main(String[] args) {
        ArrayList<Employee1>staff = new ArrayList<>();

        staff.stream().map(employee1 -> employee1.getSalary())
                .filter(salary -> salary >= 100_000)
                .reduce((salary1, salary2) -> salary1 + salary2)
                .ifPresent(System.out::println);

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
