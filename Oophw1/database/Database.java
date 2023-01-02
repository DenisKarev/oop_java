package database;

import java.util.LinkedList;

// import model.Address;
// import model.Person;
// import model.Phone;

public class Database<T> {
    private LinkedList<T> base = new LinkedList<T>();
    
    public void add2Db(T item) {
        this.base.add(item);
    }

    public T getFdb(int item){
        return this.base.get(item);
    }

}