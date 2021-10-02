package sa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ABCDKkMain {
    public static void main(String[] args) {
        List<AAk> aAks = new ArrayList<>();
        aAks.add(new AAk(null));
        aAks.add(new AAk(new BBk(new CCk(new DDk("hello2")))));
        aAks.add(new AAk(new BBk(new CCk(new DDk("hello9")))));
        aAks.add(new AAk(new BBk(new CCk(new DDk("hello10")))));
        aAks.add(new AAk(new BBk(new CCk(new DDk("hello3")))));
        aAks.add(new AAk(new BBk(null)));
        aAks.add(new AAk(new BBk(new CCk(null))));
        aAks.add(new AAk(new BBk(new CCk(new DDk(null)))));


        List<Optional<String>> collect = aAks.stream().map(s ->
                Optional.of(s).map(s1 -> s1.getB())
                        .map(s2 -> s2.getcCk())
                        .map(s3 -> s3.getDdk())
                        .map(s4 -> s4.getName()))
                .collect(Collectors.toList());

        List<Optional<String>> collect1 = collect.stream()
                .filter(d -> d.isPresent())
                .filter(s -> s.isPresent())
                .filter(s -> s.isPresent())
                .filter(s4 -> s4.isPresent())
                .collect(Collectors.toList());
        System.out.println(collect1.size());

    }
}
