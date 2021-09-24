package salary;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Employee[] employees=new Employee[4];
        employees[0]=new EmployeeFulltime("1A","Yasuo",21,"123456","q123@gmail.com",200000,200000,2000000);
        employees[1]=new EmployeeFulltime("2A","Zed",21,"654321","ư123@gmail.com",150000,50000,0);
        employees[2]=new EmployeeParttime("1B","Bob", 18,"1346","b123@123",15);
        employees[3]=new EmployeeParttime("2B","Senna", 18,"654","c23@123",15);
        information(employees);
//        Employee[] newarray=add(employees);
//        information(newarray);
        employeeLessAverage(employees);
        int moneyPaidToPartTime=moneyToPaid(employees);
        System.out.println("Money paid to Employee Part time: "+moneyPaidToPartTime);
        list(employees);


    }
    public static void information(Employee[] employees){

        for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static Employee[] add(Employee[] employees){
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.print("Enter type:");
        String type=scanner.nextLine();
        int size=employees.length+1;
        Employee[] newEmployee=new Employee[size];
        for (int i = 0; i <employees.length ; i++) {
            newEmployee[i]=employees[i];
        }
        System.out.print("\nEnter ID:");
        String id=scanner.nextLine();
        System.out.print("\nEnter name");
        String name=scanner.nextLine();
        System.out.print("\nEnter age:");
        int age=scanner1.nextInt();
        System.out.print("\nEnter phone number:");
        String phone=scanner.nextLine();
        System.out.print("\nEnter Email:");
        String email=scanner.nextLine();
        if(type.equals("EmployeeFulltime")){
            System.out.print("\nEnter bonus:");
            int bonus=scanner.nextInt();
            System.out.print("\nEnter forfeit:");
            int forfeit=scanner.nextInt();
            System.out.print("\nEnter salary:");
            int salary=scanner.nextInt();
            newEmployee[size-1]=new EmployeeFulltime(id,name,age,phone,email,bonus,forfeit,salary);
        }else {
            System.out.print("\nEnter hour:");
            int hour =scanner.nextInt();
            newEmployee[size-1]=new EmployeeParttime(id,name,age,phone,email,hour);
        }
        return newEmployee;
    }
    public static void employeeLessAverage(Employee[] employees){
        int sum=0;
        int count=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof EmployeeFulltime) {
                sum += employees[i].pay();
                count++;
            }
        }
        int average=sum / count;
        System.out.println("Employee whose salary is less than the average salary of all:");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof EmployeeFulltime) {
                if (employees[i].pay() < average) {
                    System.out.println(employees[i].toString());
                }
            }
        }
    }

    public static int moneyToPaid(Employee[] employee){
        int moneyPartTime=0;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i]instanceof EmployeeParttime){
                moneyPartTime+=employee[i].pay();
            }
        }
        return moneyPartTime;
    }

    public static void list(Employee[] employees){
        System.out.println("List of Salary:");
        int count=0;
        for (int i = 0; i < employees.length ; i++) {
            if(employees[i] instanceof EmployeeFulltime){
                count++;
            }
        }
        Employee[] newEmployee=new Employee[count];
        for (int i = 0,j=0; i < employees.length; i++) {
                if(employees[i] instanceof EmployeeFulltime){
                    newEmployee[j]=employees[i];
                    j++;
                }
        }

        Employee test;
        for (int i = 0; i < newEmployee.length-1; i++) {
            for (int j = 1; j < newEmployee.length; j++) {
                if(newEmployee[i].pay()>newEmployee[j].pay()){
                    test=newEmployee[i];
                    newEmployee[i]=newEmployee[j];
                    newEmployee[j]=test;
                }
            }
        }
        information(newEmployee);
    }


}
