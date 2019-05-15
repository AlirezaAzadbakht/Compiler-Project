package entity;

import java.util.ArrayList;

public class token {
	String tokenType;
	String token;
	int symbolTableIndex = -1;

	public token(String tokenType, String token) {
		this.tokenType = tokenType;
		this.token = token;
	}

	public token(String tokenType, String token, SymbolTable st) {
		this.tokenType = tokenType;
		this.token = token;
		symbolTableIndex = st.checkAndAddToken(token);
	}

	@Override
	public String toString() {
		// if(symbolTableIndex>=0)
		// return "< " + tokenType + ", " + token + ", "+ symbolTableIndex +">";
		return "< " + tokenType + ", " + token + " >";
	}
	
	public String getToken() {
		return token;
	}
	public String getTokenType() {
		return tokenType;
	}
	

}
