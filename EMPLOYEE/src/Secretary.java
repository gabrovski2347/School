import java.util.ArrayList;

public class Secretary extends Employee
{
    private ArrayList<String> spokenLanguages;
    public Secretary(String name, double salary, ArrayList<String> spokenLanguages)
    {
        super(name, salary);
        this.spokenLanguages = spokenLanguages;
    }

    public ArrayList<String> getSpokenLanguages()
    {
        return spokenLanguages;
    }

    public void setSpokenLanguages(ArrayList<String> spokenLanguages)
    {
        this.spokenLanguages = spokenLanguages;
    }

    @Override
    public String toString()
    {
        return  "name='" + name + '\'' +
                ", salary=" + salary +
                ", spokenLanguages=" + spokenLanguages.size();
    }
}
