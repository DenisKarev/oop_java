package Oophw5.Interfaces;

import java.util.List;
import Oophw5.database.PHDataBase;
import Oophw5.datatables.Person;
import Oophw5.datatables.Phone;

public class Controller {
    View v;
    PHDataBase db;
    ConsoleInput ci = new ConsoleInput();

    public Controller(View v, PHDataBase db) {
        this.v = v;
        this.db = db;
    }

    public int run() {
        // TODO Auto-generated method stub╕
        boolean exit = false;
        String ch = "-1";

        v.menu0();

        while (!exit) {
            ch = ci.input();
            switch (Integer.parseInt(ch)) {
                case 1:
                    showAllData();
                    v.textOut("Press Enter for menu");
                    ci.input();
                    v.menu0();
                    break;
                case 2:
                    v.menuSearch();
                    String m2 = ci.input();
                    switch (Integer.parseInt(m2)) {
                        case 1:
                            v.textOut("Enter name (second name)\n");
                            String name = ci.input();
                            searchPerson(name);
                            break;
                        case 2:
                            v.textOut("Enter phone number\n");
                            String phone = ci.input();
                            searchPhone(phone);
                            break;
                        case 0:
                            v.menu0();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    v.mDeletePerson();
                    break;
                case 4:
                    v.mAddPerson();
                    break;
                case 5:
                    v.mAddPhoneToPerson();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public void showPerson(int pid) {
        Person pe = db.getPersonById(pid);
        List<Phone> ph = pe.getPhones();
        for (int i = 0; i < ph.size(); i++) {
            System.out.printf("%s ", pe.show());
            System.out.printf("%s\n", ph.get(i).show());
        }
    }

    private void showAllData() {
        for (int i = 0; i < db.getSize(); i++) {
            showPerson(i);
        }
    }

    private void searchPhone(String phone) {
    }

    private void searchPerson(String name) {

    }
}
