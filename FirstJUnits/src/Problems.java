
public class Problems {
	public int square(int x){
		return x*x;
	}
	
	public String reverse(String s){
		String newStr = "";
		for(int i = s.length() -1; i >= 0; i--){
		  newStr += s.charAt(i);	
		}
		return newStr;
	}
	
	public Person createPerson(String first, String last){
	   Person person = new Person(first, last);
	   return person;
	}
	
}
