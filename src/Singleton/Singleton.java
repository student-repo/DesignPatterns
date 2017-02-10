package Singleton;

/**
 * Created by ubuntu-master on 27.01.17.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        return instance;
    }





    //only for tests
    public String name;
    public String getName(){
        return name;
    }

}
