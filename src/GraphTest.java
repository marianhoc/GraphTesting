import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/06/17.
 */
public class GraphTest {

    public static void main(String args[]){

        Persona uno = new Persona("A");
        Persona dos = new Persona("B");
        Persona tres = new Persona("F");
        Persona cuatro = new Persona("E");
        Persona cinco = new Persona("M");
        Persona seis = new Persona("R");
        Persona siete = new Persona("J");

        BookCatalog catalogo = createBookCatalog();

        System.out.println(catalogo.toString());

    }


    public static BookCatalog createBookCatalog(){
        BookCatalog catalogo = BookCatalog.getInstance();
        catalogo.addNewBook(new Book("moby dick"));
        catalogo.addNewBook(new Book("sherlock holmes"));
        catalogo.addNewBook(new Book("harryu potter 1"));

        return catalogo;

    }


    public static List<Book> biliotecaA (){
        List<Book> livros = new ArrayList<>();


        return livros;
    }

    public static List<Book> biliotecaB (){
        List<Book> livros = new ArrayList<>();


        return livros;
    }

    public static List<Book> livrosPedidos(){
        List<Book> pedidos = new ArrayList<>();

        return pedidos;
    }



}
