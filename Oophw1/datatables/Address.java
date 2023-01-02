package datatables;

import model.Model;

public class Address implements Model {
    private static int lastId = 0;
    private int id;
    private String town;
    private String street;
    private int building;
    private int appartment;
    private String commentary;

    public Address(String town, String street, int building, int appartment, String comm) {
        this.id = getNewId();
        this.town = town;
        this.street = street;
        this.building = building;
        this.appartment = appartment;
        this.commentary = comm;
    }

    private int getNewId() {
        return lastId++;
    }

    @Override
    public String showAll(int pid) {
        // TODO Auto-generated method stub
        return String.format("%d %s %s %d-%d (%s)", id, town, street, building, appartment, commentary);
    }

}
