package Oophw5.database;

import java.util.LinkedList;

public class Database<T> {
    private static int lastId = 0;

    private LinkedList<T> base = new LinkedList<T>();

    protected void addToDb(T item) {
        this.base.add(item);
        lastId++;
    }

    protected T getFromdb(int item) {
        return this.base.get(item);
    }

    public static int getLastId() {
        return lastId;
    }

    protected int getSize() {
        return base.size();
    }

}