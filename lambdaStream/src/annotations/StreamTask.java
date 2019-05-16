package annotations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTask {

    private static final String SEPARATOR = "===================";
//    final String PATH = "C:\\Users\\wondercat\\Documents\\GitHub\\" +
//            "InterfacesLambdasETC\\payload\\java8\\stream\\1.txt";
    final String PATH = ".\\payload\\java8\\stream\\1.txt";

    public void streamFromList() {
        System.out.println("STREAM FROM ARRAY");
        System.out.println(SEPARATOR);
        List<String> streamFromList = new ArrayList<>();
        streamFromList.add("a1");
        streamFromList.add("a2");
        streamFromList.add("a3");
        streamFromList.forEach(System.out::println);
    }

    public void streamFromEnumeration(){
        System.out.println("STREAM FROM ENUMERATION");
        System.out.println(SEPARATOR);
        Stream.of("a1", "a2", "a3")
                .forEach(System.out::println);
    }

    public void streamFromArray(){
        System.out.println("STREAM FROM ARRAY");
        System.out.println(SEPARATOR);
        String[] array = new String[]{"a1", "a2", "a3"};
        Arrays.stream(array)
                .forEach(System.out::println);
    }

    public void streamFromFile(){
        System.out.println("STREAM FROM FILE");
        System.out.println(SEPARATOR);
        try {
            Files.lines(Paths.get(PATH)).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void streamFromString(){
        System.out.println("STREAM FROM STRING");
        System.out.println(SEPARATOR);
        String someString = "A string";
        someString.chars().mapToObj((x) -> Character.toString((char) x))
                .forEach(System.out::println);

    }

    public void parallelStream(){
        System.out.println("PARALLEL STREAM");
        System.out.println(SEPARATOR);
        List<String> streamFromList = new ArrayList<>();
        streamFromList.add("a1");
        streamFromList.add("a2");
        streamFromList.add("a3");
        streamFromList.parallelStream().forEach(System.out::println);
    }

    public void powerStream(){
        System.out.println("INFINITY STREAM");
        System.out.println(SEPARATOR);
        try {
            Stream.iterate(2, x -> Math.toIntExact(Math.round(Math.pow(x, 2))))
                    .limit(5).forEach(System.out::println);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fibonacciStream(){
        System.out.println("FIBONACCI STREAM");
        System.out.println(SEPARATOR);
        Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]})
                .limit(8).forEach(x -> System.out.println(x[0]));
    }

    public void filterArray(){
        System.out.println("FILTERED ARRAY");
        System.out.println(SEPARATOR);
        ArrayList<Integer> testArray = new ArrayList<>();
        Stream.of(1, 2, 3, 4, 5, 6, 6, 7, 8).forEach(testArray::add);
        testArray.stream().filter(x -> x % 2 == 1).forEach(System.out::println);
    }

    public void filterArrayOfObject(){

        
    }
}
