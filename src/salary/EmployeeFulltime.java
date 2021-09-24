package salary;

public class EmployeeFulltime extends Employee {
    private int bonus;
    private int forfeit;
    private int salary;

    public EmployeeFulltime() {
    }

    public EmployeeFulltime(int bonus, int forfeit, int salary) {
        this.bonus = bonus;
        this.forfeit = forfeit;
        this.salary = salary;
    }

    public EmployeeFulltime(String id, String name, int age, String phoneNumber, String email, int bonus, int forfeit, int salary) {
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.forfeit = forfeit;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getForfeit() {
        return forfeit;
    }

    public void setForfeit(int forfeit) {
        this.forfeit = forfeit;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"EmployeeFulltime{" +
                "bonus=" + bonus +
                ", forfeit=" + forfeit +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int pay() {
        return salary+(bonus-forfeit);
    }
}
