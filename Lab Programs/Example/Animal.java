package pramod;

public class Animal {
	String name;


    public final void makeSound() {
        System.out.println(name + " is making a sound");
    }
}

class Dog extends Animal{
	
    // Bellow Code will give Error: Cannot override the final method from Animal
	// public void makeSound() {
    //     System.out.println(name + " is making a sound");
    // }
	
}
