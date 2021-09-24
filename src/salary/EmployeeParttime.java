package salary;

public class EmployeeParttime extends Employee {
    private int hour;

    public EmployeeParttime() {
    }

    public EmployeeParttime(int hour) {
        this.hour = hour;
    }

    public EmployeeParttime(String id, String name, int age, String phoneNumber, String email, int hour) {
        super(id, name, age, phoneNumber, email);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return super.toString()+"EmployeeParttime{" +
                "hour=" + hour +
                '}';
    }

    @Override
    public int pay() {
        return hour*1000000;
    }
}
