    class Employee{
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this. jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getjobTitle(){
        return jobTitle;
    }

    public void setjobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double percentage){
        salary = salary + salary * percentage / 100;
    }

    public void printEmployeeDetail(){
        System.out.println("NAME : " + name);
        System.out.println("JOB TITLE : " + jobTitle);
        System.out.println("SALARY : " + salary);
    }
}

    public class EmployeeExample{
        public static void main(String arg[]){
            Employee emp1 = new Employee("ZAIN ", "FRONT-END DEVELOPER", 40000);
            Employee emp2 = new Employee("ADNAN", "JAVA DEVELOPER", 60000);

            emp1.printEmployeeDetail();
            emp2.printEmployeeDetail();

            emp1.raiseSalary(8);
            emp2.raiseSalary(12);

            System.out.println("AFTER RAISE SALARY ");
            System.out.println("FOR ZAIN");
            emp1.printEmployeeDetail();
            System.out.println("FOR ADNAN");
            emp2.printEmployeeDetail();
        }
    }