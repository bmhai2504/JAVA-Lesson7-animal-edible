import Ihowtoeat.Edible;
import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;
import jdk.jfr.Frequency;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit element : fruits){
            System.out.println(element.howtoEat());
        }
    }
}