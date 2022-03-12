public class InvalidStringException extends Exception{
    public InvalidStringException()
    {
        super("invalid Password");
    }
    public InvalidStringException(String msg)
    {
        super(msg);
    }
}