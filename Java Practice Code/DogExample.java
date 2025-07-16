class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getName(){
        return name;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public void display(){

        System.out.println("Name :" + name);
        System.out.println("Breed :" + breed);
    }
}

public class DogExample{
    public static void main(String arg[]){
        Dog d1 = new Dog("DOG 1", "DOG1");
        Dog d2 = new Dog("DOG 2", "GOG2");
        
        d1.setName("NEW DOG 1");
        d1.setName("NEW DOG 1.1");

        d2.setName("NEW DOG 2");
        d2.setName("NEW DOG 2.2");

        System.out.println("DOGGY");
        d1.display();

        System.out.println("GOGGY");
        d2.display();

    }
}