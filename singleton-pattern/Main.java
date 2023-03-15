import java.io.*;

class Main {

   public static void main(String[] args) {
      DB db = DB.getInstance();
      DB db2 = DB.getInstance();
      
      System.out.println(db.getInfo());
      db2.setInfo("New Information");
      
      System.out.println(db.getInfo());
      System.out.println(db2.getInfo());
   }
}