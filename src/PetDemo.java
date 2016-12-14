import java.util.ArrayList;
import java.util.Scanner;

public class PetDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name, breed, rabies;
        int age;
        double weight;

        while(dogs.size() < 5) {
            System.out.print("Enter Dog Name or \"quit\" to quit : ");
            name = input.nextLine();
            if(name.equals("quit")) break;
            System.out.print("Enter " +  name  +"'s age: ");
            age = input.nextInt();
            input.nextLine();
            System.out.print("Enter " +  name  +"'s breed: ");
            breed = input.nextLine();
            System.out.print("Enter " +  name  +"'s weight: ");
            weight = input.nextDouble();
            input.nextLine();
            System.out.print("Does " + name + " have its rabies shot?(Y/N): ");
            rabies = input.nextLine();

            dogs.add(new Dog(name, age, weight, breed, rabies.equalsIgnoreCase("y")));
        }
        for (Dog dog: dogs
             ) {
            if (dog.getAge() >= 2&& dog.hasRabiesShot() == false)System.out.println(dog.getName() + " " + dog.getBreed());
        }
    }
}
