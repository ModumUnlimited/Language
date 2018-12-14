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
		boolean b;
		while (last != "exit") {
			System.out.print(">> ");
			System.out.println(b = t.hasNextDoublequote());
			if (b) {
				last = t.nextDoublequote();
				t.disableDelimiter();
				while (!t.hasNextDoublequote()) {
					t.next();
				}
				t.enableDelimiter();
				last += t.nextDoublequote();
			} else {
				last = t.next();
			}
			System.out.println(last);
		}
	}
	
}
