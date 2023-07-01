import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//TASK 1: BUILD A HASHMAP
		Map<FullName,String> phones = buildHashMap();
		
		//TASK 2: Run input and output in a loop
		while(true) {
			String text = JOptionPane.showInputDialog("Enter full name");
			if(text.isEmpty())
				break;
			
			//SUBTASK 1: Parse the full name(firstName lastName)
			String[] names = text.split(" ");
			String fn = names[0];
			String ln = names[1];
			FullName key = new FullName(fn, ln);
			
			//SUBTASK 2: Use get() to retrieve phone number
			String phoneNumber = (String) phones.get(key);
			
			//SUBTASK 3: Print the phone number
			if(phoneNumber != null)
				System.out.println(text + ": " + phoneNumber);
			else
				System.out.println("Subscriber unknown");
		}
	}

	public static Map<FullName, String> buildHashMap(){
		//TASK 1: Create 5 Names
		FullName n1 = new FullName("Manuel", "Nader");
		FullName n2 = new FullName("Bobo", "Baca");
		FullName n3 = new FullName("Kacey", "Que");
		FullName n4 = new FullName("Reed", "Paul");
		FullName n5 = new FullName("Jason", "Red");
		
		//TASK 2: Create HashMap and add key and values
		Map<FullName, String> phones = new HashMap<FullName,String>();
		phones.put(n1, "639-2237");
		phones.put(n2, "990-5463");
		phones.put(n3, "223-2287");
		phones.put(n4, "129-8372");
		phones.put(n5, "449-8887");
		return phones;
	}
}