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

	private Pattern rule_if = Pattern.compile("if");
	private Pattern rule_else = Pattern.compile("else");
	private Pattern rule_for = Pattern.compile("for");
	private Pattern rule_while = Pattern.compile("while");
	private Pattern rule_do = Pattern.compile("do");
	private Pattern rule_use = Pattern.compile("use");
	private Pattern rule_function = Pattern.compile("function");
	private Pattern rule_number_type = Pattern.compile("num");
	private Pattern rule_boolean_type = Pattern.compile("bool");
	private Pattern rule_string_type = Pattern.compile("String");
	private Pattern rule_char_type = Pattern.compile("char");

	private Pattern rule_semi = Pattern.compile(";");
	private Pattern rule_open_bracket = Pattern.compile("\\(");
	private Pattern rule_close_bracket = Pattern.compile("\\)");
	private Pattern rule_open_square = Pattern.compile("\\[");
	private Pattern rule_close_square = Pattern.compile("\\]");
	private Pattern rule_open_curly = Pattern.compile("\\{");
	private Pattern rule_close_curly = Pattern.compile("\\}");
	private Pattern rule_open_angle = Pattern.compile("<");
	private Pattern rule_close_angle = Pattern.compile(">");
	private Pattern rule_quote = Pattern.compile("'");
	private Pattern rule_doublequote = Pattern.compile("\"");
	private Pattern rule_question = Pattern.compile("\\?");
	private Pattern rule_assign = Pattern.compile("=");
	private Pattern rule_comma = Pattern.compile(",");

	private Pattern rule_op_plus = Pattern.compile("\\+");
	private Pattern rule_op_minus = Pattern.compile("-");
	private Pattern rule_op_mult = Pattern.compile("\\*");
	private Pattern rule_op_divide = Pattern.compile("/");
	private Pattern rule_op_eq = Pattern.compile("==");
	private Pattern rule_op_large_eq = Pattern.compile(">=");
	private Pattern rule_op_large = Pattern.compile(">");
	private Pattern rule_op_less_eq = Pattern.compile("<=");
	private Pattern rule_op_less = Pattern.compile("<");
	private Pattern rule_op_and = Pattern.compile("&");
	private Pattern rule_op_or = Pattern.compile("|");
	private Pattern rule_op_not = Pattern.compile("!");
	private Pattern rule_op_xor = Pattern.compile("^");

	private Pattern rule_lit_num = Pattern.compile("[0-9]([0-9]|_[0-9])*(\\.[0-9]([0-9]|_[0-9])*)?");
	private Pattern rule_lit_bool = Pattern.compile("true|false");
	private Pattern rule_lit_string = Pattern.compile("\".*\"");
	private Pattern rule_lit_char = Pattern.compile("'.'");

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
		scanner.useDelimiter("\\s+|(?![A-Za-z0-9._])|(?<![A-Za-z0-9._])");
	}

	public boolean hasNext() {
		return scanner.hasNext();
	}

	public boolean hasNextIf() {
		return scanner.hasNext(rule_if);
	}

	public boolean hasNextElse() {
		return scanner.hasNext(rule_else);
	}

	public boolean hasNextFor() {
		return scanner.hasNext(rule_for);
	}

	public boolean hasNextWhile() {
		return scanner.hasNext(rule_while);
	}

	public boolean hasNextDo() {
		return scanner.hasNext(rule_do);
	}

	public boolean hasNextUse() {
		return scanner.hasNext(rule_use);
	}

	public boolean hasNextFunction() {
		return scanner.hasNext(rule_function);
	}

	public boolean hasNextNumberType() {
		return scanner.hasNext(rule_number_type);
	}

	public boolean hasNextBooleanType() {
		return scanner.hasNext(rule_boolean_type);
	}

	public boolean hasNextStringType() {
		return scanner.hasNext(rule_string_type);
	}

	public boolean hasNextCharType() {
		return scanner.hasNext(rule_char_type);
	}

	public boolean hasNextOperatorPlus() {
		return scanner.hasNext(rule_op_plus);
	}

	public boolean hasNextOperatorMinus() {
		return scanner.hasNext(rule_op_minus);
	}

	public boolean hasNextOperatorMult() {
		return scanner.hasNext(rule_op_mult);
	}

	public boolean hasNextOperatorDivide() {
		return scanner.hasNext(rule_op_divide);
	}

	public boolean hasNextOperatorEquals() {
		return scanner.hasNext(rule_op_eq);
	}

	public boolean hasNextOperatorLess() {
		return scanner.hasNext(rule_op_less);
	}

	public boolean hasNextOperatorLarge() {
		return scanner.hasNext(rule_op_large);
	}

	public boolean hasNextOperatorLessOrEqual() {
		return scanner.hasNext(rule_op_less_eq);
	}

	public boolean hasNextOperatorLargeOrEqual() {
		return scanner.hasNext(rule_op_large_eq);
	}

	public boolean hasNextOperatorAnd() {
		return scanner.hasNext(rule_op_and);
	}

	public boolean hasNextOperatorOr() {
		return scanner.hasNext(rule_op_or);
	}

	public boolean hasNextOperatorNot() {
		return scanner.hasNext(rule_op_not);
	}

	public boolean hasNextOperatorXor() {
		return scanner.hasNext(rule_op_xor);
	}

	public boolean hasNextNumber() {
		return scanner.hasNext(rule_lit_num);
	}

	public boolean hasNextString() {
		return scanner.hasNext(rule_lit_string);
	}

	public boolean hasNextChar() {
		return scanner.hasNext(rule_lit_char);
	}

	public boolean hasNextBoolean() {
		return scanner.hasNext(rule_lit_bool);
	}

	public boolean hasNextSemi() {
		return scanner.hasNext(rule_semi);
	}

	public boolean hasNextOpenBracket() {
		return scanner.hasNext(rule_open_bracket);
	}

	public boolean hasNextCloseBracket() {
		return scanner.hasNext(rule_close_bracket);
	}

	public boolean hasNextOpenSquare() {
		return scanner.hasNext(rule_open_square);
	}

	public boolean hasNextCloseSquare() {
		return scanner.hasNext(rule_close_square);
	}

	public boolean hasNextOpenCurly() {
		return scanner.hasNext(rule_open_curly);
	}

	public boolean hasNextCloseCurly() {
		return scanner.hasNext(rule_close_curly);
	}

	public boolean hasNextOpenAngle() {
		return scanner.hasNext(rule_open_angle);
	}

	public boolean hasNextClsoeAngle() {
		return scanner.hasNext(rule_close_angle);
	}

	public boolean hasNextQuote() {
		return scanner.hasNext(rule_quote);
	}

	public boolean hasNextDoublequote() {
		return scanner.hasNext(rule_doublequote);
	}

	public boolean hasNextQuestion() {
		return scanner.hasNext(rule_question);
	}

	public boolean hasNextAssign() {
		return scanner.hasNext(rule_assign);
	}

	public boolean hasNextComma() {
		return scanner.hasNext(rule_comma);
	}

	public String next() {
		return scanner.next();
	}

	public String nextIf() {
		return scanner.next(rule_if);
	}

	public String nextElse() {
		return scanner.next(rule_else);
	}

	public String nextFor() {
		return scanner.next(rule_for);
	}

	public String nextWhile() {
		return scanner.next(rule_while);
	}

	public String nextDo() {
		return scanner.next(rule_do);
	}

	public String nextUse() {
		return scanner.next(rule_use);
	}

	public String nextFunction() {
		return scanner.next(rule_function);
	}

	public String nextNumberType() {
		return scanner.next(rule_number_type);
	}

	public String nextBooleanType() {
		return scanner.next(rule_boolean_type);
	}

	public String nextStringType() {
		return scanner.next(rule_string_type);
	}

	public String nextCharType() {
		return scanner.next(rule_char_type);
	}

	public String nextOperatorPlus() {
		return scanner.next(rule_op_plus);
	}

	public String nextOperatorMinus() {
		return scanner.next(rule_op_minus);
	}

	public String nextOperatorMult() {
		return scanner.next(rule_op_mult);
	}

	public String nextOperatorDivide() {
		return scanner.next(rule_op_divide);
	}

	public String nextOperatorEquals() {
		return scanner.next(rule_op_eq);
	}

	public String nextOperatorLess() {
		return scanner.next(rule_op_less);
	}

	public String nextOperatorLarge() {
		return scanner.next(rule_op_large);
	}

	public String nextOperatorLessOrEqual() {
		return scanner.next(rule_op_less_eq);
	}

	public String nextOperatorLargeOrEqual() {
		return scanner.next(rule_op_large_eq);
	}

	public String nextOperatorAnd() {
		return scanner.next(rule_op_and);
	}

	public String nextOperatorOr() {
		return scanner.next(rule_op_or);
	}

	public String nextOperatorNot() {
		return scanner.next(rule_op_not);
	}

	public String nextOperatorXor() {
		return scanner.next(rule_op_xor);
	}

	public String nextNumber() {
		return scanner.next(rule_lit_num);
	}

	public String nextString() {
		return scanner.next(rule_lit_string);
	}

	public String nextChar() {
		return scanner.next(rule_lit_char);
	}

	public String nextBoolean() {
		return scanner.next(rule_lit_bool);
	}

	public String nextSemi() {
		return scanner.next(rule_semi);
	}

	public String nextOpenBracket() {
		return scanner.next(rule_open_bracket);
	}

	public String nextCloseBracket() {
		return scanner.next(rule_close_bracket);
	}

	public String nextOpenSquare() {
		return scanner.next(rule_open_square);
	}

	public String nextCloseSquare() {
		return scanner.next(rule_close_square);
	}

	public String nextOpenCurly() {
		return scanner.next(rule_open_curly);
	}

	public String nextCloseCurly() {
		return scanner.next(rule_close_curly);
	}

	public String nextOpenAngle() {
		return scanner.next(rule_open_angle);
	}

	public String nextClsoeAngle() {
		return scanner.next(rule_close_angle);
	}

	public String nextQuote() {
		return scanner.next(rule_quote);
	}

	public String nextDoublequote() {
		return scanner.next(rule_doublequote);
	}

	public String nextQuestion() {
		return scanner.next(rule_question);
	}

	public String nextAssign() {
		return scanner.next(rule_assign);
	}

	public String nextComma() {
		return scanner.next(rule_comma);
	}

}