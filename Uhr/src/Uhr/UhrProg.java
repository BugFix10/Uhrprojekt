package Uhr;

public class UhrProg {

	 public static void main(String[] args) {
		
	while (true){
	java.util.Date now = new java.util.Date();
	
	java.text.SimpleDateFormat sfd = new java.text.SimpleDateFormat("HH:mm:ss");
	String ausgabe = sfd.format(now);
	
		
	System.out.println(ausgabe);
	}
}
}