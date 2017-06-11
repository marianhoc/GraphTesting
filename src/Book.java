import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 10/06/17.
 */
public class Book {
    private String title;



    public Book(String title) {
        this.title = title;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }


    @Override
    public String toString() {
        return "Book{" +
                " title =' " + title + '\'' +
                '}' + "\n";
    }
}
