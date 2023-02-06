package Oophw5.datatables;

import java.util.LinkedList;

import Oophw5.model.Model;

public class Person implements Model {
    // private static int lastId = 0;
    private int id;
    private String firstName;
    private String secondName;
    private String birthDate;
    private String commentary;
    
    private LinkedList<Phone> phones = new LinkedList<Phone>();
    // private Address adress;
    
    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }
    
    // public Person(String fName, String sName, String bDate, String comm) {
    //     this.id = getNewId();
    //     // System.err.println(persId + lastId);
    //     this.firstName = fName;
    //     this.secondName = sName;
    //     this.birthDate = bDate;
    //     if (comm == "" || comm == null) {
    //         this.commentary = " ";
    //     } else {
    //         this.commentary = comm;
    //     }
    // }
    
    public Person(int id, String fName, String sName, String bDate, String comm) {
        this.id = id;
        this.firstName = fName;
        this.secondName = sName;
        this.birthDate = bDate;
        if (comm == "") {
            this.commentary = " ";
        } else {
            this.commentary = comm;
        }
    }

    public Person(Person pers) {
        this(pers.getId(), pers.getFirstName(), pers.getSecondName(), pers.getBirthDate(), pers.getCommentary());
        for (Phone phone : pers.phones) {
            this.addPhone(phone);
        }
    }

    // private int getNewId() {
    //     return lastId++;
    // }

    @Override
    public String show() {
        // TODO Auto-generated method stub
        return (this.commentary.equalsIgnoreCase(" ") || this.commentary == null)
                ? String.format("%d - %s %s (%s)",
                        this.id,
                        this.firstName,
                        this.secondName,
                        this.birthDate)
                : String.format("%d - %s %s (%s) (%s)",
                        this.id,
                        this.firstName,
                        this.secondName,
                        this.birthDate,
                        this.commentary);

    }

    public LinkedList<Phone> getPhones() {
        LinkedList<Phone> ph = new LinkedList<Phone>();
        for (Phone phone : this.phones) {
            ph.add(phone);
        }
        return ph;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getCommentary() {
        return this.commentary;
    }

}
