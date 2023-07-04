package openrewrite;

import java.util.Scanner;

public class SimpleSystemOutExample {

	public static void main(String[] args) {		
		
		Scanner console = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
        String name = console.nextLine();
		
        SimpleSystemOutExample ssoe = new SimpleSystemOutExample();
        ssoe.print(name);

        console.close();        
	}
	
	public void print(String name) {
        /*‮ } ⁦ direction  ⁩ ⁦ begin welcome message */
		System.out.println("Welcome "+ name);
		System.out.println("Entering the system.");
		  /* welcome message ending ‮ { ⁦ */
	}

}
