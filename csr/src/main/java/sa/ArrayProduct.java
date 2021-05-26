package sa;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayProduct {
    public static void main(String[] args) {

        String s = "a5icssd1adfix2f";


        String s1 = ZoneId.of("UTC+2:00").toString();

        ZoneOffset zoneOffSet = ZoneOffset.of("+02:00");
        ZoneOffset of = ZoneOffset.of("+02:00");
        ZoneOffset.ofOffset("UTC",ZoneOffset.of("+02:00"));

        ZoneId utc1 = ZoneOffset.ofOffset("UTC", ZoneOffset.of("+02:00"));

        TimeZone timeZone = TimeZone.getTimeZone(utc1);

        System.out.println(utc1.toString());

        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(utc1);

        String id = utc1.getId();
        OffsetDateTime now = OffsetDateTime.now(zoneOffSet);

        int utc = TimeZone.getTimeZone("UTC").getOffset(Instant.now().getEpochSecond());

//        TimeZone timeZone = TimeZone.getTimeZone("UTC");
//        ZoneOffset of = ZoneOffset.of("+2:00");

//        ZonedDateTime zonedDateTime = Instant.now().atZone(of);
        TimeZone tz = TimeZone.getDefault();
        String offsetId = tz.toZoneId().getRules().getStandardOffset(Instant.now()).getId();


        String[] availableIDs1 = TimeZone.getAvailableIDs(2);


        String[] availableIDs = TimeZone.getAvailableIDs(TimeZone.getTimeZone(
                "UTC+02:00").getRawOffset());
        List<String> collect = Arrays.stream(availableIDs).collect(Collectors.toList());


        System.out.println();

        for(int i=0;i<s.length()-1;i++){

        }
    }

}
