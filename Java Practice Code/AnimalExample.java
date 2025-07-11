import java.util.Scanner;

interface Animal{
    void legs();
    void sound();
}

class Human implements Animal{
    public void legs(){
        System.out.println("Has 2 legs");
    }
    public void sound(){
        System.out.println("Nature Language");
    }
}

class Tiger implements Animal{
    public void legs(){
        System.out.println("Has 4 legs");
    }
    public void sound(){
        System.out.println("Powerful Roar");
    }
}

class Elephent implements Animal{
    public void legs(){
        System.out.println("Has 4 legs");
    }
    public void sound(){
        System.out.println("Powerful Growls");
    }
}

class Cat implements Animal{
     public void legs(){
        System.out.println("Has 4 legs");
    }
    public void sound(){
        System.out.println("Meeaoon");
    }
}

public class AnimalExample{
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER ANY ANIMAL NAME :");
        String input = sc.nextLine();

    Animal obj;

    switch(input){
    case "cat":
        obj = new Cat();
        break;
    
    case "human":
        obj = new Human();
        break;

    case "tiger":
        obj = new Tiger();
        break;

    case "elephent":
        obj = new Elephent();
        break;

    default: 
        System.out.println("Invalid Animal name");
        return;
        }
    obj.legs();
    obj.sound();
    }
}