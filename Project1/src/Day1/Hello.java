
package Day1;

public class Hello {
	
	public static void Practise1 (){
		
		System.out.println (""
				+ "This program prints the first lines\nof the song " + '"' + "slots" + "." + '"' + "\n\n"
				+ '"'+ "She lives in a traler" + '"' + '\n'
				+ '"'+ "On the outskirts 'a Reno" + '"' + '\n'
				+ '"'+ "She plays quarter slots in the locals casion." + '"'
				+"");
	}
	
	public static void Practise2 (){
		System.out.println (""
				+ "A " + '"' + "quoted" + '"' + " string is\n"
				+ "'much' better if you learn\n"
				+ "the rules of " + '"' + "escape sequences." + '"' + "\n\n"
				+ "Also, " + '"' + '"' + "represents an empty String.\n"
				+ "Don't forget to use " + "\\" + '"' + " instead of " + '"' + "!\n"
				+ "'' is not same as " + '"'
				+"");
	}
	
	
	public static void Practise3 () {
		System.out.println ("\ta\tb\tc");
		System.out.println("\\\\");
		System.out.println ("'");
		System.out.println ("\"\"\"");
		System.out.println ("C: \nin\the downward spiral");
	}
	
	public static void Practise4 () {
		System.out.println ("/\\//\\\\///\\\\\\");
	}
	
	public static String header = ""
			+ "     ______\n"
			+ "    /      \\\n"
			+ "   /        \\\n"
			+ "";
	
	public static String footer = ""
			+ "   \\        /\n"
			+ "    \\______/"
			+ "";
	
	public static void Activity2 () {
		System.out.println (header + footer);
		
		System.out.println (header
				+ "  |          |\n"
				+ "  |          |\n"
				+ "  |          |\n"
				+ footer);
		
		System.out.println (header + "    +------+");
		
		System.out.println (header);
	}
	

	public static void main (String[] args) {
//		Practise1();
//		Practise2();
//		Practise3();
//		Practise4();
		Activity2 ();
	}
}
