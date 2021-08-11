package sa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BMI {

    public static void main(String[] args) throws IOException {
        String json = "[{\"name\": \"Java\", \"description\": \"Java is a class-based, object-oriented programming language.\"},{\"name\": \"Python\", \"description\": \"Python is an interpreted, high-level and general-purpose programming language.\"}, {\"name\": \"JS\", \"description\": \"JS is a programming language that conforms to the ECMAScript specification.\"}]";


        calculateBMI(json);
    }

    public static void calculateBMI(String json) throws IOException {

        final ObjectMapper objectMapper = new ObjectMapper();
        Language[] langs = objectMapper.readValue(json, Language[].class);
        List<Language> langList = objectMapper.readValue(json, new TypeReference<List<Language>>(){});
//        List<Language> langList = new ArrayList(Arrays.asList(langs));

        langList.forEach(x -> System.out.println(x.toString()));

//        ObjectMapper mapper = new ObjectMapper();
//

        // 1. convert JSON array to Array objects
        Person[] pp1;
        List<Person> ppl2=new ArrayList<>();

      /*  {
            try {
                pp1 = objectMapper.readValue(json, Person[].class);
                ppl2 = Arrays.asList(objectMapper.readValue(json, Person[].class));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(ppl2);*/

    }



}


@JsonIgnoreProperties(ignoreUnknown = true)
class Person {
    private String gender;
    private int heightCm;
    private int weightKg;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", heightCm=" + heightCm +
                ", weightKg=" + weightKg +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }
}
class Language {

    private String name;
    private String description;
}