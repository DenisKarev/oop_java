package datatables;

import model.Model;

public class Phone implements Model {
    private int lastId = 0;
    int id;
    String phone;
    int person;

    public Phone(String phone, int person) {
        this.id = getNewId();
        System.out.println(id + lastId);
        this.phone = phone;
        this.person = person;
    }

    private int getNewId() {
        return lastId++;
    }

    @Override
    public String showAll() {
        // TODO Auto-generated method stub
        return String.format("%s", phone);
    }

}
