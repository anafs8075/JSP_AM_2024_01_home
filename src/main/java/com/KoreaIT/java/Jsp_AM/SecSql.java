package com.KoreaIT.java.Jsp_AM;

public class SecSql extends RuntimeException {
	private Exception origin;

	public SecSql(String message, Exception origin) {
		super(message);
		this.origin = origin;
	}

	public Exception getOrigin() {
		return origin;
	}
}