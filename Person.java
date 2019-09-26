import java.io.Console;

class Person{
	public static void main(String args[]){
	Console cons = System.console();
	String username = cons.readLine("Username: ");
	char[] passwd = cons.readPassword("Password: ");
	System.out.print(username + passwd);
	
	
	}
}