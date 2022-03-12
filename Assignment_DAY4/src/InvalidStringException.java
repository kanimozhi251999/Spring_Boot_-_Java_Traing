public class InvalidStringException extends Exception{
    public InvalidStringException()
    {
        super("Invalid Password");
    }
    public InvalidStringException(String msg)
    {
        super(msg);
    }
}
