package datatables;

import model.Model;

public class Phone implements Model {
    private static int lastId = 0;
    private int id;
    private String phone;
    private int persId;
    private String commentary;

    public Phone(String phone, int person, String comm) {
        this.id = getNewId();
        this.phone = phone;
        this.persId = person;
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
        return String.format("%s %s", phone, "(" + commentary + ")");
    }

    public String getPhone() {
        return phone;
    }

    public String getCommentary() {
        return commentary;
    }       
}
