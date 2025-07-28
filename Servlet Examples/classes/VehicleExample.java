import java.util.Scanner;

interface Vehicle{
    void wheels();
    void fuelType();
}

class Car implements Vehicle{
    public void wheels(){
        System.out.println("Car has 4 wheels");
    }

    public void fuelType(){
        System.out.println("Car use petrol and Diesel");
    }
}

class Bike implements Vehicle{
    public void wheels(){
        System.out.println("Bike has 2 wheels");
    }

    public void fuelType(){
        System.out.println("Bike use petrol");
    }
}

class Truck implements Vehicle{
    public void wheels(){
        System.out.println("Truck has 4 or 8 wheels");
    }

    public void fuelType(){
        System.out.println("Truck use Diesel");
    }
}

public class VehicleExample{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter Vehicle Type Car, Bike, Truck : ");
        String input = sc.nextLine();

        Vehicle obj;

        switch(input){
            case "car":
                obj = new Car();
                break;

            case "bike":
                obj = new Bike();
                break;

            case "truck":
                obj = new Truck();
                break;
            
            default:
                System.out.println("Invalid Vehicle Type");
                return;
        }

        obj.wheels();
        obj.fuelType();
    }
}