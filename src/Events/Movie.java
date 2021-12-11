package Events;

import java.time.LocalDate;

public class Movie extends Event{
    private String director;
    private String Language;

    public Movie(String name, String location, String hoster, int attendNumber, LocalDate time) {
        super(name, location, hoster, attendNumber, time);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String toString(){
        return super.toString() +
                " type: Movie";
    }
}
