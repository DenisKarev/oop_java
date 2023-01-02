package datatables;

import model.Model;

public class Phone implements Model {
    private static int lastId = 0;
    private int id;
    private String phone;
    private int person;
    private String commentary;

    public Phone(String phone, int person, String comm) {
        this.id = getNewId();
        this.phone = phone;
        this.person = person;
        this.commentary = comm;
    }

    private int getNewId() {
        return lastId++;
    }

    @Override
    public String showAll(int pid) {
        // TODO Auto-generated method stub
        return String.format("%d %s %s", id, phone, "(" + commentary + ")");
    }

}
