public class SpeedException extends Exception
{
    private String message;
    public SpeedException(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return message;
    }
}
