package OOP.Inheritance;

class Animals {
    void eat() {
        System.out.println("Animal is eating...");
    }
}
class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring...");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.roar();
        System.out.println();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}