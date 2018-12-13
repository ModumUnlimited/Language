/**
 * 
 */
package lang.exceptions;

/**
 * @author Linus Vogel <linvogel@student.ethz.ch>
 *
 */
public class ParserException extends LangException {
	
	private String message;
	
	public ParserException(String error) {
		message = "PARSE_ERROR: " + error;
	}
	
	public String getMessage() {
		return message;
	}
	
}
