/**
 * 
 */
package lang;

import java.util.Scanner;

import lang.tokenizer.Tokenizer;

/**
 * @author Linus Vogel <linvogel@student.ethz.ch>
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Tokenizer t = new Tokenizer(new Scanner(System.in));
		String last = "";
		while (last != "exit()") {
			System.out.print(">> ");
			last = t.next();
			System.out.println(last);
		}
	}
	
}
