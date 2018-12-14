package lang.parser;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import lang.exceptions.ParserException;
import lang.tokenizer.Tokenizer;

public class Parser {
	
	private Tokenizer tokens;
	private OutputStream out;
	
	private List<String> lit_strings;
	
	public Parser(Tokenizer tokens, OutputStream out) {
		this.tokens = tokens;
		this.out = out;
	}
	
	public void parse() throws ParserException {
		lit_strings = new ArrayList<>(512);
		while (tokens.hasNextUse()) {
			parseUse();
		}
	}
	
	public void parseUse() throws ParserException {
		String use = tokens.nextUse();
		int addr = parseString();
	}
	
	public int parseString() throws ParserException {
		if (!tokens.hasNextString()) throw new ParserException("unexpected token '" + tokens.next() +  "', expected string litteral");
		if (lit_strings.contains(o))
	}

}
