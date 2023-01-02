
import database.PHDataBase;
import controllers.Menus;
class Oophw1 {
    public static void main(String[] args) {
        Menus m = new Menus();
        PHDataBase db = new PHDataBase();
        
        System.out.println(db.getAllData(0));
        System.out.println(db.getAllData(1));
        System.out.println(db.getAllData(2));
        System.out.println(db.getAllData(3));
        
        System.err.println(m.mainMenu());
    }
}
