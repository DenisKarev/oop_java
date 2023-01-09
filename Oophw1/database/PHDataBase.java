package database;

import datatables.Person;
import datatables.Phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;

import datatables.Address;

public class PHDataBase implements Db_Io { // extends Db ?? extends Database
    Database<Person> persDb = new Database<Person>();
    // Database<Address> addrDb = new Database<Address>();
    // Database<Phone> phonDb = new Database<Phone>();

    // Инициализация
    public PHDataBase() {
        init();
    }

    private void init() {
        this.readDb();
        // persDb.add2Db(new Person("Сергей", "Соколов", "08.01.93", "56784"));
        // persDb.add2Db(new Person("Кирилл", "Ярославцев", "17.09.1990", "64295"));
        // persDb.add2Db(new Person("Мария", "Суворова", "12.04.1997", "97560"));
        // persDb.add2Db(new Person("Денис", "Федоров", "12.04.1987", "1213"));

        // persDb.getFdb(0).addPhone(new Phone("56784", 0, ""));
        // persDb.getFdb(1).addPhone(new Phone("64295", 1, ""));
        // persDb.getFdb(2).addPhone(new Phone("97560", 2, "Основной"));
        // persDb.getFdb(2).addPhone(new Phone("97561", 2, "Дом."));
        // persDb.getFdb(3).addPhone(new Phone("1213", 3, "Не брать!"));

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

    public String getDataById(int pid) {
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

    public void readDb() {
        // Charset ch = Charset.forName("UTF-8");
        // Charset ch = Charset.defaultCharset();
        // TODO Auto-generated method stub
        String str = "";

        try {
            // File file = new File(database.settings.dbfile);
            // FileReader f = new FileReader(file, ch);

            BufferedReader bufR = new BufferedReader(new FileReader(database.settings.dbfile));

            while ((str = bufR.readLine()) != null) {
                String[] a = str.split(";");
                persDb.add2Db(new Person(a[0], a[1], a[2], a[3]));
                persDb.getFdb(Integer.parseInt(a[0])).addPhone(new Phone(a[4], Integer.parseInt(a[5]), a[6]));
            }
            bufR.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // return str;
    }

    public void writeDb() {
        // TODO Auto-generated method stub
        try (FileWriter bufW = new FileWriter(database.settings.dbfile, false)) {
            if (this.size() > 0) {
                for (int i = 0; i < this.size(); i++) {
                    this.writePerson2Db(i, bufW);
                }
                bufW.flush();
                bufW.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void writePerson2Db(int i, FileWriter bw) throws IOException {
        Person person = this.persDb.getFdb(i);
        LinkedList<Phone> phones = person.getPhones();
        String strPer = String.format("%d;%s;%s;%s;%s;",
                person.getId(),
                person.getFirstName(),
                person.getSecondName(),
                person.getBirthDate(),
                person.getCommentary());

        System.out.println(strPer);
        for (Phone phone : phones) {
            String strPh = String.format("%s;%s;",
                    phone.getPhone(),
                    phone.getCommentary());

            bw.append(strPer);
            bw.append(strPh);
            bw.append(System.lineSeparator());
        }

    }
}