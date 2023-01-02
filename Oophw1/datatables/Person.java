package datatables;

import model.Model;

public class Person implements Model {
    private static int lastId = 0;
    private int persId;
    private String firstName;
    private String secondName;
    private String birthDate;
    private String commentary;

    public Person(String fName, String sName, String bDate, String comm) {
        this.persId = getNewId();
        // System.err.println(persId + lastId);
        this.firstName = fName;
        this.secondName = sName;
        this.birthDate = bDate;
        this.commentary = comm;
    }

    private int getNewId() {
        return lastId++;
    }

    @Override
    public String showAll(int pid) {
        // TODO Auto-generated method stub
        return String.format("%d - %s %s (%s) (%s)", persId, firstName, secondName, birthDate, commentary);
    }

}
