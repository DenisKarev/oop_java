package Oophw5.datatables;

import Oophw5.model.Model;

public class Address implements Model {
    private static int lastId = 0;
    private int persId;
    private String town;
    private String street;
    private int building;
    private int appartment;
    private String commentary;

    public Address(String town, String street, int building, int appartment, String comm) {
        this.persId = getNewId();
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
    public String show() {
        // TODO Auto-generated method stub
        return this.commentary.equalsIgnoreCase(" ") ?
            String.format("%d %s %s %d-%d",
            this.persId,
            this.town,
            this.street,
            this.building,
            this.appartment)
            :
            String.format("%d %s %s %d-%d (%s)",
            this.persId,
            this.town,
            this.street,
            this.building,
            this.appartment,
            this.commentary);
    }

    public int getPersId() {
        return persId;
    }
}
