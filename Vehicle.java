import java.util.Scanner;

public class Vehicle{
    String brand;
    String model;
    int year;

    public Vehicle(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails(){
        System.out.print("Brand: " +brand);
        System.out.println("Model: " +model);
        System.out.println("Year: " +year);
    }
}

class Car extends Vehicle{
    String fuelType;

    public Car(String brand,String model,int year,String fuelType){
        super(brand,model,year);
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fuel Type: " +fuelType);
    }
}

class Showroom{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car details");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();

        Car car = new Car(brand,model,year,fuelType);
        car.displayDetails();

        scanner.close();
    }
}