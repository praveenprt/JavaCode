class Car {
    
    String brand;
    String color;
    int speed;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }

    
    public void start() {
        System.out.println(brand + " car has started.");
    }

    public void stop() {
        speed = 0;
        System.out.println(brand + " car has stopped.");
    }

    public void accelerate(int acc) {
        speed = speed + acc;
        System.out.println(brand + " is accelerating. Current speed: " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
      
        Car car1 = new Car("Audi", "Red");
        Car car2 = new Car("BMW", "Blue");

     
        car1.start();
        car1.accelerate(20);
        car1.stop();

        System.out.println();       
        car2.start();
        car2.accelerate(40);
        car2.stop();
    }
}
