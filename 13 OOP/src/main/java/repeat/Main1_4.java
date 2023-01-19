package repeat;

//Лямбда выражения
//StreamApi

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main1_4 {

    private static String staffFile = "resources/data/staff.txt";
    private static String dateFormat = "dd/MM/yyyy";

    public static void main(String[] args) {
        ArrayList<Employee1>staff = new ArrayList<>();

//        Stream<Employee1> stream = staff.stream();
//        stream.filter(employee1 -> employee1.getSalary() >= 100_000).forEach(System.out::println);
        staff.stream().filter(employee1 -> employee1.getSalary() >= 100_000).forEach(System.out::println);


        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        numbers.filter(number -> number % 2 == 0).forEach(System.out::println);
        Integer[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(numbers1).forEach(System.out::println);

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
