package Oophw5.database;

import Oophw5.datatables.Person;
import Oophw5.datatables.Phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;

// import datatables.Address;

public class PHDataBase{
    Database<Person> persDb = new Database<Person>();

    // Инициализация
    public PHDataBase() {
        this.readDb();
    }

    public Person getPersonById(int pid) {
        return new Person(persDb.getFromdb(pid));  /// 
    }

    public int getSize() {
        return persDb.getSize();
    }

    private void readDb() {
        Charset cs = Charset.forName("UTF-8");
        // Charset ch = Charset.defaultCharset();
        // TODO Auto-generated method stub
        String str = "";

        try {
            File file = new File(Oophw5.database.dbfile.dbfile);
            FileReader f = new FileReader(file, cs);
            BufferedReader bufR = new BufferedReader(f);
            if(bufR.ready()) bufR.readLine();

            String pprev = "";

            while ((str = bufR.readLine()) != null) {
                String[] a = str.split(";");
                if (a[0].equals(pprev)) {
                    persDb.getFromdb(Integer.parseInt(a[0])).addPhone(new Phone(a[5], Integer.parseInt(a[0]), a[6]));
                } else {
                    persDb.addToDb(new Person(Database.getLastId(), a[1], a[2], a[3], a[4]));
                    persDb.getFromdb(Integer.parseInt(a[0])).addPhone(new Phone(a[5], Integer.parseInt(a[0]), a[6]));
                }
                pprev = a[0];
            }
            bufR.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void writeDb() {
        // TODO Auto-generated method stub
        try (FileWriter bufW = new FileWriter(Oophw5.database.dbfile.dbfile, false)) {
            if (this.getSize() > 0) {
                bufW.append("PHDataBase;" + System.lineSeparator());
                for (int i = 0; i < this.getSize(); i++) {
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
        Person person = this.persDb.getFromdb(i);
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