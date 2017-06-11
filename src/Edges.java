import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created by user on 10/06/17.
 */
public class Edges {
    private Book book;
    private Persona giving;
    private Persona taking;


    public Edges() {}

    public Edges(Book book, Persona giving, Persona taking) {
        this.book = book;
        this.giving = giving;
        this.taking = taking;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Persona getGiving() {
        return giving;
    }

    public void setGiving(Persona giving) {
        this.giving = giving;
    }

    public Persona getTaking() {
        return taking;
    }

    public void setTaking(Persona taking) {
        this.taking = taking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edges)) return false;

        Edges edges = (Edges) o;

        if (getBook() != null ? !getBook().equals(edges.getBook()) : edges.getBook() != null) return false;
        if (getGiving() != null ? !getGiving().equals(edges.getGiving()) : edges.getGiving() != null) return false;
        return getTaking() != null ? getTaking().equals(edges.getTaking()) : edges.getTaking() == null;
    }

    @Override
    public int hashCode() {
        int result = getBook() != null ? getBook().hashCode() : 0;
        result = 31 * result + (getGiving() != null ? getGiving().hashCode() : 0);
        result = 31 * result + (getTaking() != null ? getTaking().hashCode() : 0);
        return result;
    }
}
