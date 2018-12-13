/**
 * 
 */
package lang.tokenizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Linus Vogel <linvogel@student.ethz.ch>
 *
 */
public class Tokenizer {

	private Scanner scanner;

	private Pattern rule_if 		= Pattern.compile("if\\s*");
	private Pattern rule_else 		= Pattern.compile("else");

	public Tokenizer(InputStream input) {
		this(new Scanner(input));
	}

	public Tokenizer(String input) {
		this(new Scanner(input));
	}

	public Tokenizer(File input) throws FileNotFoundException {
		this(new Scanner(input));
	}
	
	public Tokenizer(Scanner scanner) {
		this.scanner = scanner;
		scanner.useDelimiter("\\s+|((?![A-Za-z0-9.\\{\\[\\(])|(?<![A-Za-z0-9.\\{\\[\\(]))");
	}
	
	public boolean hasNext() {
		return scanner.hasNext();
	}
	
	public boolean hasNextIf() {
		return scanner.hasNext(rule_if);
	}
	
	public String next() {
		return scanner.next();
	}

}