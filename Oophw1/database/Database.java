package database;

import java.util.LinkedList;

// import model.Address;
// import model.Person;
// import model.Phone;

public class Database<T> {
    private LinkedList<T> base = new LinkedList<T>();

    // private int lastId;

    // public int getLastId(){
    //     return lastId++;
    // };
    
    public void add(T item) {
        this.base.add(item);
    }

    public T get(int item){
        return this.base.get(item);
    }

}