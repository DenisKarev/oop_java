package database;

import java.util.LinkedList;

public class Database<Person> {
    private LinkedList<Person> base = new LinkedList<Person>();

    public void add2Db(Person item) {
        this.base.add(item);
    }

    public Person getFdb(int item) {
        return this.base.get(item);
    }

    public int size() {
        return base.size();
    }

}