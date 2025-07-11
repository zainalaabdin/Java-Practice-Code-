class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

     void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        }
    }

    public class PersonExample{
        public static void main(String arg[]){
            Person p1 = new Person("ZAIN", 31);
            Person p2 = new Person("AHMED", 32);

            System.out.println("PERSON 1 :");
            p1.display();

            System.out.println("PERSON 2 :");
            p2.display();
            
        }
    }
    
    

   



