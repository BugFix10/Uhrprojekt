package Uhr;

public class Starten {

	 public static void start () {
		
		 
	 try { 
		 while (true){
	java.util.Date now = new java.util.Date();
    java.text.SimpleDateFormat sfd = new java.text.SimpleDateFormat("HH:mm:ss");
	String ausgabe = sfd.format(now);
    System.out.println(ausgabe); 	      
         Thread.sleep(1000);  
		 }
      }catch (Exception e) {
         System.out.println("Got an exception!"); 
      }
	}
}