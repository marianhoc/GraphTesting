import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by user on 10/06/17.
 */
public class Persona {
    private String name;
    private List<Book> myBooks;
    private List<Book> wantedBooks;


    public Persona(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getMyBooks() {
        return myBooks;
    }

    public void setMyBooks(List<Book> myBooks) {
        this.myBooks = myBooks;
    }

    public List<Book> getWantedBooks() {
        return wantedBooks;
    }

    public void setWantedBooks(List<Book> wantedBooks) {
        for (Book b : wantedBooks){
            this.wantedBooks.add(b);
        }
    }

    public void addWantedBook(Book b){
        this.wantedBooks.add(b);
    }

    public Boolean addBookToCollection(Book b){
        try{
            this.myBooks.add(b);
            return true;
        }catch (Exception e){
            System.out.println("Persona.addBookToCollection " + e);
            return false;
        }

    }


//
//    public void bfs()
//    {
//        //BFS uses Queue data structure
//        Queue q = new LinkedList();
//        q.add(this.rootNode);
//        printNode(this.rootNode);
//        rootNode.visited=true;
//        while(!q.isEmpty())
//        {
//            Node n=(Node)q.remove();
//            Node child=null;
//            while((child=getUnvisitedChildNode(n))!=null)
//            {
//                child.visited=true;
//                printNode(child);
//                q.add(child);
//            }
//        }
//        //Clear visited property of nodes
//        clearNodes();
//    }


    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", myBooks=" + myBooks +
                ", wantedBooks=" + wantedBooks +
                '}';
    }
}
