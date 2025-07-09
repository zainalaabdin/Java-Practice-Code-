class StudentMarksheet {
    String name;
    int english;
    int math;
    int science;
    int total;

    // Constructor
    StudentMarksheet(String name, int english, int math, int science) {
        this.name = name;
        this.english = english;
        this.math = math;
        this.science = science;
        this.total = english + math + science;
    }

    // Method to display data
    void display() {
        System.out.println("STUDENT NAME : " + name);
        System.out.println("ENGLISH      : " + english);
        System.out.println("MATH         : " + math);
        System.out.println("SCIENCE      : " + science);
        System.out.println("TOTAL MARKS  : " + total);
    }

    // Static method that returns object
    static StudentMarksheet createMarksheet(String name, int english, int math, int science) {
        return new StudentMarksheet(name, english, math, science);
    }
}

public class ReturningMarksheet {
    public static void main(String[] args) {
        StudentMarksheet m = StudentMarksheet.createMarksheet("Zain", 70, 77, 50);
        m.display();
    }
}
