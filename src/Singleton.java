/**
 * Created by user on 10/06/17.
 */
public class Singleton {




    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }

}
