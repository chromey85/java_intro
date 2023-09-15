abstract class Car {
    public abstract void drive(); // You can define a method without any {} but then you have to assign @abstract'
    // to the specific method AND class, this is for when you want to create a
    // method that would have something in the {} in the extended class

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

class UpdatedWagonR extends WagonR { // A normal class is called a CONCRETE CLASS

    public void fly() {
        System.out.println("Flying...");
    }

}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("Driving...");
    }

    // public void fly() {
    // System.out.println("Flying...");
    // }
}

public class Abstract {
    public static void main(String a[]) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}