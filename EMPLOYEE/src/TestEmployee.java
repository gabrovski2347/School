import java.util.ArrayList;

public class TestEmployee
{
    public static void main(String[] args)
    {
        var employee = new Employee("Gosho", 1200);
        System.out.println(employee);
        var manager = new Manager("Pesho", 1200, 200);
        System.out.println(manager);

        var spokenLanguages = new ArrayList<String>();
        spokenLanguages.add("English");
        spokenLanguages.add("Deutch");
        spokenLanguages.add("Spanish");
        spokenLanguages.add("Bulgarian");

        var secretary = new Secretary("Gergana", 900,spokenLanguages );
        System.out.println(manager);
    }
}
