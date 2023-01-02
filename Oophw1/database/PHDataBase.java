package database;

import datatables.Person;
import datatables.Phone;
import datatables.Address;

public class PHDataBase { // extends Db ??
    Database<Person> persDb = new Database<Person>();
    Database<Address> addrDb = new Database<Address>();
    Database<Phone> phonDb = new Database<Phone>();

    public Database<Person> getPersDb() {
        return persDb;
    }

    public Database<Address> getAddrDb() {
        return addrDb;
    }

    public Database<Phone> getPhonDb() {
        return phonDb;
    }

    // Инициализация
    public PHDataBase() {
        init();
    }

    private void init() {
        persDb.add(new Person("Сергей", "Соколов", "08.01.93", "56784"));
        persDb.add(new Person("Кирилл", "Ярославцев", "17.09.1990", "64295"));
        persDb.add(new Person("Мария", "Суворова", "12.04.1997", "97560"));

        phonDb.add(new Phone("56784", 0, ""));
        phonDb.add(new Phone("64295", 1, ""));
        phonDb.add(new Phone("97560", 2, "1"));
        phonDb.add(new Phone("97561", 2, "2"));

        addrDb.add(new Address("Minsk", "Miroshnichenko str.", 9, 117, ""));
        addrDb.add(new Address("Минск", "Миро", 11, 23, ""));
        addrDb.add(new Address("Moscow", "Lenina str.", 119, 1, ""));
        // return db;
    }

    public Object getAllData(int pid) {
        return String.format("%s %s %s", persDb.get(pid).showAll(pid), phonDb.get(pid).showAll(pid),
                addrDb.get(pid).showAll(pid));
    }
}