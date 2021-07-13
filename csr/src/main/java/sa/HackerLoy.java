package sa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class HackerLoy {
    public static void main(String[] args) {

        String s = "{\n    Money Heist\n    {\n        The most important character Professor\n    }\n    {\n        Another character is Berlin\n        {\n            Berlin is in charge of the heist\n        }\n    }\n    {\n        Another character is Moscow\n        {\n            Moscow is Denver's father\n        }\n    }\n    {\n        Another character is Rio\n        {\n            Rio is a computer programmer\n            {\n                Rio is also a good hacker\n                {\n                    Rio is very happy to be a part of the heist\n                }\n            }\n        }\n    }\n    {\n        Another character is Denver\n    }\n}\n";
        int level = 2;
        String solt = "{\n" +
                "    Money Heist Info\n" +
                "    {\n" +
                "        The most important character is the Professor\n" +
                "    }\n" +
                "    {\n" +
                "        Another character is that of Berlin\n" +
                "        {\n" +
                "            Berlin is in charge of the money heist\n" +
                "        }\n" +
                "    }\n" +
                "    {\n" +
                "        Another character is that of Moscow\n" +
                "        {\n" +
                "            Moscow is Denver's dad\n" +
                "        }\n" +
                "    }\n" +
                "    {\n" +
                "        Another character is that of Rio\n" +
                "        {\n" +
                "            Rio is a programmer\n" +
                "            {\n" +
                "                Rio is also a decent hacker\n" +
                "                {\n" +
                "                    Rio is quite happy to be a part of the heist\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    {\n" +
                "        Another character is that of Denver\n" +
                "    }\n" +
                "}";

        System.out.println(extractData(s, 5));


    }

    public static List<String> extractData(String s, int level) {
        String s1[] = s.split("\\n");

        HashMap<String, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        int globallevel = 1;
        for (int i = 0; i < s1.length; i++) {

            if (s1[0].equalsIgnoreCase("{") && level == 1) {
                String key = "Level-" + globallevel;
                map.put(key, Arrays.asList(s1[1].trim()));
                stack.push(s1[0].trim());
                result.add(s1[i + 1].trim());
                break;
            } else {
                if (s1[i].trim().equalsIgnoreCase("{")) {

                    if (!stack.isEmpty()) {
                        if (stack.peek().equalsIgnoreCase("{")) {
                            stack.push(s1[i].trim());
                            globallevel++;
                        }
                    } else {
                        stack.push(s1[i].trim());
                    }
                } else if (s1[i].trim().equalsIgnoreCase("}")) {
                    if (!stack.isEmpty()) {
                        if (stack.peek().equalsIgnoreCase("{")) {
                            stack.pop();
                            globallevel--;
                        }
                    } else {
                        stack.push(s1[i].trim());
                    }
                } else {
                    String key = "Level-" + globallevel;
                    if (map.containsKey(key)) {
                        List<String> strings1 = map.get(key);
                        strings1.add(s1[i].trim());
                        map.put(key, strings1);
                    } else {
                        List<String> strings = new ArrayList<>();
                        strings.add(s1[i].trim());
                        map.put(key, strings);
                    }
                }
            }
        }
        result = map.get("Level-" + level);

        return result;
    }
}
/*"{\n    Money Heist\n    {\n        The most important character Professor\n    }\n    {\n        Another character is Berlin\n        {\n            Berlin is in charge of the heist\n        }\n    }\n    {\n        Another character is Moscow\n        {\n            Moscow is Denver's father\n        }\n    }\n    {\n        Another character is Rio\n        {\n            Rio is a computer programmer\n            {\n                Rio is also a good hacker\n                {\n                    Rio is very happy to be a part of the heist\n                }\n            }\n        }\n    }\n    {\n        Another character is Denver\n    }\n}\n"::1*/