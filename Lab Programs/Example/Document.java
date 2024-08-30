class Vehicle {
    public final void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    // This would cause a compilation error
    // public void run() { } // Error: Cannot override the final method from Vehicle
}
