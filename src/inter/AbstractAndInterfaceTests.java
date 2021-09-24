package inter;
import inter.fruit.Apple;
import inter.fruit.Fruit;
import inter.fruit.Orange;
import inter.animal.Animal;
import inter.animal.Chicken;
import inter.animal.Tiger;
import inter.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args){
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
