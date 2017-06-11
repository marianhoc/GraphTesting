import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 10/06/17.
 */
public class BookCatalog {
    private static Map<Book , ArrayList<Persona>> ownersOf;



    private static BookCatalog catalogo = new BookCatalog();
    private BookCatalog(){};
    public static BookCatalog getInstance(){
        return  catalogo;
    }


    public  ArrayList<Persona> getOwnersOf(Book b) {
        return ownersOf.get(b);
    }

    public  void addNewOwner(Persona p , Book b){
        ArrayList<Persona> novaLista = new ArrayList<Persona>();
        novaLista.add(p);
        if(ownersOf.containsKey(b)) {
            ownersOf.get(b).add(p);
        }else{
            ownersOf.put(b, novaLista);
        }
    }

    public  void addNewBook(Book b){
        if(!ownersOf.containsKey(b)){
            ArrayList<Persona> owners = null;
            ownersOf.put(b, owners);
        }
    }

    public void addBooks(List<Book> books){
        for (Book book : books){
            addNewBook(book);
        }
    }
}
