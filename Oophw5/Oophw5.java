package Oophw5;

import Oophw5.Interfaces.View;
import Oophw5.Interfaces.ConsoleView;
import Oophw5.Interfaces.Controller;
import Oophw5.database.PHDataBase;

class Oophw5 {
    public static void main(String[] args) {
        PHDataBase db = new PHDataBase();
        View v = new ConsoleView();
        // ConsoleView v = new ConsoleView();
        Controller phBook = new Controller(v, db);
        
        int res = phBook.run();
        System.out.printf("Exit status - %d", res);
    }
}
