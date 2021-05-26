package sa;

import java.util.HashSet;

public class RemoveDupCharFromString {
    public static void main(String[] args) {
//        Input: s = "bcabc"
//        Output: "abc"

        String s = "abbca";

        HashSet<Character> characters = new HashSet<>();
//       s.toCharArray()
        for (Character c : s.toCharArray()) {
            characters.add(c);

        }

       /* characters.stream().forEach(s1->{
            String.join("",s1);
        });*/
        System.out.println(characters.toString());
    }
}
