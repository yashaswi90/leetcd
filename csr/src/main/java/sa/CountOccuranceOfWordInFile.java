package sa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccuranceOfWordInFile {
    public static void main(String[] args) throws IOException {
        List<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Sam");
        names.add("James");
        names.add("Joe");
        names.add("Selena");
        names.add("Sam");
        names.add("James");

        Map<String, Integer> frequencyMap = names.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)));

        Map<String, Long> frequencyMap1 = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(frequencyMap);

        System.out.println(frequencyMap1);

        Long wordsCount = Files.lines(Paths.get("D:\\Event-Management Project\\Developement-TP\\csr\\src\\main\\resources\\tarjan.txt"))
                .flatMap(str -> Stream.of(str.split("[ ,.!?\r\n]")))
                .filter(s -> s.length() > 0 && s.equals("This")).count();


        System.out.println(wordsCount);


        String s1 = "Hello|2|3|Word|33|HiHij|22";

        List<String> collect = Stream.of(s1.split("\\|")).
                collect(Collectors.toList());

        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        List<Integer> sortedList = collect.stream()
                .filter(s -> pattern.matcher(s).matches())
                .map(s2 -> Integer.parseInt(s2))
                .sorted()
                .collect(Collectors.toList());


        System.out.println(sortedList);


        //create function which will reverse the string

        reverseString("Hello world");

    }

    public static void reverseString(String s) {
        Arrays.stream(s.split(" "))
                .map(eachStr -> new StringBuilder(eachStr).reverse())
                .forEach(System.out::println);


        Arrays.stream(s.split(" ")).forEach(s1 -> {
            String output = "";
            for (int i = s1.length() - 1; i >= 0; i--) output = output + s1.charAt(i);
        });


        for (String inProgReverse : s.split(" ")) {
            int length = inProgReverse.length();
            String output = "";
            for (int i = length - 1; i >= 0; i--) output = output + inProgReverse.charAt(i);
            System.out.println(output);

        }

    }
}
