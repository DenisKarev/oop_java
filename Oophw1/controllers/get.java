package controllers;

import database.PHDataBase;

public class get {
    public static String getAllInfo(int id, PHDataBase db) {
        
        // Person s = db.getPersDb().get(id).showAll();
    
        return String.format("%s %s %s",
            db.getPersDb().get(id).showAll(),
            db.getAddrDb().get(id).showAll(),
            db.getPhonDb().get(id).showAll()
        );
      }
}
