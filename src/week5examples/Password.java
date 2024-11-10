package week5examples;

public class Password {
    private String password;



    public Password(String password) throws InvalidPasswordException{
        if(password.length() > 7){
            throw new InvalidPasswordException("Invalid Password");
        }
        else if (password.length() < 4)
            throw new InvalidPasswordException("too small");
    }




}
