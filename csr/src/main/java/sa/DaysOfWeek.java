package sa;

import java.util.HashMap;
import java.util.Map;

public class DaysOfWeek {
    public static void main(String[] args) {
        String []input = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        System.out.println(DaysOfWeek.getDaysOfWeek("WED",19));
    }

    public static String getDaysOfWeek(String s, int days){

        HashMap<String,Integer> inputDaysWeekFix = new HashMap<>();
        inputDaysWeekFix.put("SUN",0);
        inputDaysWeekFix.put("MON",1);
        inputDaysWeekFix.put("TUE",2);
        inputDaysWeekFix.put("WED",3);
        inputDaysWeekFix.put("THI",4);
        inputDaysWeekFix.put("FRI",5);
        inputDaysWeekFix.put("SAT",6);

        int remainder=0;

//
//        inputDaysWeekFix.put(0,"SUN");
//        inputDaysWeekFix.put(1,"MON");
//        inputDaysWeekFix.put(2,"TUE");
//        inputDaysWeekFix.put(3,"WED");
//        inputDaysWeekFix.put(4,"THI");
//        inputDaysWeekFix.put(5,"FRI");
//        inputDaysWeekFix.put(6,"SAT");
        if(days>7){
             remainder = days%7;
            System.out.println(remainder);
        }
        if(remainder<7){


            Integer integer = inputDaysWeekFix.get(s);
            int sum = integer+remainder;

            for (Map.Entry<String, Integer> stringIntegerEntry : inputDaysWeekFix.entrySet()) {
                if(stringIntegerEntry.getValue()==sum){
                    return stringIntegerEntry.getKey();
                }
            }


        }
        if(days<7){
            Integer integer = inputDaysWeekFix.get(s);
            int sum = integer+days;
            for (Map.Entry<String, Integer> stringIntegerEntry : inputDaysWeekFix.entrySet()) {
                if(stringIntegerEntry.getValue()==sum){
                    return stringIntegerEntry.getKey();
                }
            }
        }

        return s;
    }
}
