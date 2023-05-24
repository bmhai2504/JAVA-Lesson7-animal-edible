package animal;

import Ihowtoeat.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "animal.Chicken: cluck-cluck!";
    }
    @Override
    public String howtoEat(){
        return "could be fried";
    }
}
