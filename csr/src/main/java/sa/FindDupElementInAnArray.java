package sa;

import java.util.Arrays;
import java.util.HashMap;

public class FindDupElementInAnArray {
    public static void main(String[] args) {
        String[] arr = new String[]{"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(s -> {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        });
        map.entrySet().stream().filter(s -> s.getValue() > 1).forEach(System.out::println);
    }
}
