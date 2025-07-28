import java.util.Scanner;

public class MainClass {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        Student.total = 500;

        Student s1 = new Student();
        System.out.print("Name of Student : ");
        s1.name =  sc.nextLine();

        System.out.print("Obtained Marks : ");
        s1.obtained = sc.nextInt();

        System.out.println(s1);
    }
}


class Student{
    static int total;
    String name;
    int obtained;
    

    public String toString(){
        double percentage = (obtained * 100.0) / total;
            return "NAME: " + name + " OBTAINED MARKS : " + obtained + " PERCENTAGE :  " + percentage;
    }
}