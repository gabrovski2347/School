public class ColorException extends Exception
{
    private String message;
    public ColorException(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return message;
    }
}
