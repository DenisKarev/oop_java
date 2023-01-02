
import controllers.get;
import database.PHDataBase;

class Oophw1 {
    public static void main(String[] args) {
        PHDataBase db = new PHDataBase();

        
        // System.out.println(get.getAllInfo(0, db));
        // System.out.println(get.getAllInfo(1, db));
        // System.out.println(get.getAllInfo(2, db));

        System.out.println(db.getAllData(0));
        System.out.println(db.getAllData(1));
        System.out.println(db.getAllData(2));
    }
}
