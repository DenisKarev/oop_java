
import database.PHDataBase;
import controllers.Menus;
class Oophw1 {
    public static void main(String[] args) {
        Menus m = new Menus();
        PHDataBase db = new PHDataBase();
        // db.writeDb();
        // System.out.printf("0 %s \n", db.getDataById(0));
        // System.out.printf("1 %s \n", db.getDataById(1));
        // System.out.printf("2 %s \n", db.getDataById(2));
        // System.out.printf("3 %s \n", db.getDataById(3));
        // System.out.println(db.searchById(2));
        for (int i = 0; i < db.size(); i++) {
            db.printById(i);
            // System.out.printf("%s \n", db.getDataById(i));
        }
        // System.err.println(m.mainMenu());
    }
}
