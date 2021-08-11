package sa;

import java.util.ArrayList;
import java.util.List;

public interface Command {
    ResponseObj create();
}

class PlanetTypeMovieObject implements Command {
    private String type;
    private String name;
    private List<String> movieList;

    public PlanetTypeMovieObject(List<String> movieList, String type, String name) {
        this.type = type;
        this.name = name;
        this.movieList = movieList;
    }

    @Override
    public ResponseObj create() {
        System.out.println("hello planer");
        long planetCount = movieList.stream().filter(movie -> movie.contains(name)).count();
        ResponseObj responseObj = new ResponseObj();
        return null;
    }
}

class PeopleTypeMovieObject implements Command {
    private String type;
    private String name;
    private List<String> movieList;

    public PeopleTypeMovieObject(List<String> movieList, String type, String name) {
        this.type = type;
        this.name = name;
        this.movieList = movieList;
    }

    @Override
    public ResponseObj create() {
        long planetCount = movieList.stream().filter(movie -> movie.contains(name)).count();
        ResponseObj responseObj = new ResponseObj();
        return null;
    }
}


class MainProcessing {
    public ResponseObj createObj(Command command) {
        return command.create();
    }
}
class MainResult {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("hi");
        MainProcessing mainProcessing = new MainProcessing();
        mainProcessing.createObj(new PlanetTypeMovieObject(list,"Planet","hello"));
    }
}

