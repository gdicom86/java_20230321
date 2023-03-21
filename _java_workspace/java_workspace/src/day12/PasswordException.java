package day12;

public class PasswordException extends IllegalArgumentException{ 
	
	public PasswordException(String message) {
		super(message); //super == IllegalArgumentException
	}
	
}
