package exceptionHandling;

import java.io.IOException;

public class AgeInvalidException extends IOException{
	public AgeInvalidException() {
		
	}
	public AgeInvalidException(String msg) {
		super(msg);
	}
}