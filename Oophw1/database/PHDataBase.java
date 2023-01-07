package database;

import datatables.Person;
import datatables.Phone;

import java.util.LinkedList;

import datatables.Address;

public class PHDataBase { // extends Db ?? extends Database
    Database<Person> persDb = new Database<Person>();
    Database<Address> addrDb = new Database<Address>();
    Database<Phone> phonDb = new Database<Phone>();

    // Инициализация
    public PHDataBase() {
        init();
    }

    private void init() {
        persDb.add2Db(new Person("Сергей", "Соколов", "08.01.93", "56784"));
        persDb.add2Db(new Person("Кирилл", "Ярославцев", "17.09.1990", "64295"));
        persDb.add2Db(new Person("Мария", "Суворова", "12.04.1997", "97560"));
        persDb.add2Db(new Person("Денис", "Федоров", "12.04.1987", "1213"));

        persDb.getFdb(0).addPhone(new Phone("56784", 0, ""));
        persDb.getFdb(1).addPhone(new Phone("64295", 1, ""));
        persDb.getFdb(2).addPhone(new Phone("97560", 2, "Основной"));
        persDb.getFdb(2).addPhone(new Phone("97561", 2, "Дом."));
        persDb.getFdb(3).addPhone(new Phone("1213", 3, "Не брать!"));

        // phonDb.add2Db(new Phone("56784", 0, ""));
        // phonDb.add2Db(new Phone("64295", 1, ""));
        // phonDb.add2Db(new Phone("97560", 2, "1"));
        // phonDb.add2Db(new Phone("97561", 2, "2"));
        // phonDb.add2Db(new Phone("1213", 3, "3"));
        
        
        // System.out.println(phonDb.getFdb(4).getPersId());
        // addrDb.add2Db(new Address("Minsk", "Miroshnichenko str.", 2, 17, "%)"));
        // addrDb.add2Db(new Address("Minsk", "Ghamarnika", 11, 23, "123"));
        // addrDb.add2Db(new Address("Moscow", "Lenina str.", 119, 1, ""));
        // addrDb.add2Db(new Address("St. Petersburg", "Ladogov blvr.", 191, 13,
        // "13!"));
        // return db;
    }

    public Object getDataById(int pid) {
        return String.format("%s %s", persDb.getFdb(pid).show(), persDb.getFdb(pid).getPhones());
    } // , addrDb.getFdb(pid).showById(pid)

    public int size() {
        return persDb.size();
    }

    public void printById(int id) {
        LinkedList<Phone> ph = persDb.getFdb(id).getPhones();
        for (Phone phone : ph) {
            System.out.printf("%s ", persDb.getFdb(id).show());
            System.out.printf("%s \n", phone.show());
        }

    }
}