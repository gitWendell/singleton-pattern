public final class DB {
   private static DB INSTANCE;
   private String info = "Connected ...";
   
   private DB() {
   }
   
   public static DB getInstance() {
      if(INSTANCE == null) {
         INSTANCE = new DB();
      }
      
      return INSTANCE;
   }
   
   DB setInfo(String info) {
      this.info = info;
      
      return this;
   }
   
   String getInfo() {
      return this.info;
   }
}