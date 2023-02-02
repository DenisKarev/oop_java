package datatables;

import java.util.LinkedList;

import model.Model;

public class Person implements Model {
    private static int lastId = 0;
    private int Id;
    private String firstName;
    private String secondName;
    private String birthDate;
    private String commentary;
    private LinkedList<Phone> phones = new LinkedList<Phone>();
    // private Address adress;

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public Person(String fName, String sName, String bDate, String comm) {
        this.Id = getNewId();
        // System.err.println(persId + lastId);
        this.firstName = fName;
        this.secondName = sName;
        this.birthDate = bDate;
        if (comm == "") {
            this.commentary = " ";
        } else {
            this.commentary = comm;
        }
    }

    private int getNewId() {
        return lastId++;
    }

    @Override
    public String show() {
        // TODO Auto-generated method stub
        return String.format("%d - %s %s (%s) (%s)", Id, firstName, secondName, birthDate, commentary);
    }

    public LinkedList<Phone> getPhones() {
        LinkedList<Phone> ph = new LinkedList<Phone>();
        for (Phone phone : phones) {
            ph.add(phone);
        }
        return ph;
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCommentary() {
        return commentary;
    }

}
