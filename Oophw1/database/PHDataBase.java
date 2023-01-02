package database;

import datatables.Person;
import datatables.Phone;
import datatables.Address;

public class PHDataBase { // extends Db ??
    Database<Person> persDb = new Database<Person>();

    public Database<Person> getPersDb() {
        return persDb;
    }

    Database<Address> addrDb = new Database<Address>();

    public Database<Address> getAddrDb() {
        return addrDb;
    }

    Database<Phone> phonDb = new Database<Phone>();

    public Database<Phone> getPhonDb() {
        return phonDb;
    }

    // Инициализация всех БД
    public PHDataBase() {
        init();
    }

    private void init() {
        persDb.add(new Person("Сергей", "Соколов", "08.01.93", ""));
        persDb.add(new Person("Кирилл", "Ярославцев", "17.09.1990", ""));
        persDb.add(new Person("Мария", "Суворова", "12.04.1997", ""));

        phonDb.add(new Phone("56784", 2));
        phonDb.add(new Phone("64295", 1));
        phonDb.add(new Phone("97560", 0));

        addrDb.add(new Address("Minsk", "Miroshnichenko str.", 9, 117));
        addrDb.add(new Address("Минск", "Миро", 11, 23));
        addrDb.add(new Address("Moscow", "Lenina str.", 119, 1));
        // return db;
    }
}