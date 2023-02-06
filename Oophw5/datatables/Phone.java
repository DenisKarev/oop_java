package Oophw5.datatables;

import Oophw5.model.Model;

public class Phone implements Model {
    // private static int lastId = 0;
    // private int id;
    private String phone;
    private int persId;

    private String commentary;

    public Phone(String phone, int person, String comm) {
        // this.id = getNewId();
        this.phone = phone;
        this.persId = person;
        if (comm == "" || comm == null) {
            this.commentary = " ";
        } else {
            this.commentary = comm;
        }
    }

    // private int getNewId() {
    //     return lastId++;
    // }

    @Override
    public String show() {
        return (this.commentary.equalsIgnoreCase(" ") || this.commentary == null)
                ? String.format("%s", this.phone)
                : String.format("%s %s", this.phone, "(" + this.commentary + ")");
    }

    public String getPhone() {
        return this.phone;
    }

    public int getPersId() {
        return this.persId;
    }

    public String getCommentary() {
        return this.commentary;
    }
}
