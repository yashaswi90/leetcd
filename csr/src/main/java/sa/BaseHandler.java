package sa;

import java.util.List;

public abstract class BaseHandler {
    public abstract int getMovieDetails(String type, String name, List<Movies> movies);
}

class PeopleMovieHandler extends BaseHandler {

    @Override
    public int getMovieDetails(String type, String name, List<Movies> movies) {
        return 0;
    }
}

class PlatformMovieHandler extends BaseHandler {

    @Override
    public int getMovieDetails(String type, String name, List<Movies> movies) {
        return 0;
    }
}

class Movies {
    private String type;
    private String name;
    private String people;
    private String platnet;

    public Movies(String type, String name, String people, String platnet) {
        this.type = type;
        this.name = name;
        this.people = people;
        this.platnet = platnet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPlatnet() {
        return platnet;
    }

    public void setPlatnet(String platnet) {
        this.platnet = platnet;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", people='" + people + '\'' +
                ", platnet='" + platnet + '\'' +
                '}';
    }
}