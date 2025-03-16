// Inheritance

class Animals {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animals {

    void sound() {
        System.out.println("Cat querrels");
    }
}

public class main {

    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}
