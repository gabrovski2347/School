public class Manager extends Employee
{
    private double financeBonus;

    public Manager(String name, double salary, double financeBonus)
    {
        super(name, salary);
        this.financeBonus = financeBonus;
    }

    public double getFinanceBonus() {
        return financeBonus;
    }

    public void setFinanceBonus(double financeBonus) {
        this.financeBonus = financeBonus;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", salary=" + salary +
                ", financeBonus=" + financeBonus;
    }
}
