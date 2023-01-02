package datatables;

import model.Model;

public class Address implements Model {
    private int lastId = 0;
    int id;
    String town;
    String street;
    int building;
    int appartment;
    String commentary;

    public Address(String town, String street, int building, int appartment) {
        this.id = getNewId();
        System.out.println(id + lastId);
        this.town = town;
        this.street = street;
        this.building = building;
        this.appartment = appartment;
    }

    private int getNewId() {
        return lastId++;
    }

    @Override
    public String showAll() {
        // TODO Auto-generated method stub
        return String.format("%d %s %s %d-%d", id, town, street, building, appartment);
    }

}
