package Events;

import java.time.LocalDate;

public class Reading extends Event{
    private String bookName;

    public Reading(String name, String location, String hoster, int attendNumber, LocalDate time) {
        super(name, location, hoster, attendNumber, time);
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookname(String bookName) {
        this.bookName = bookName;
    }

    public String toString(){
        return super.toString() +
                " type: Reading";
    }
}
