public class Homework {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        animal.run("Чебурашка", 500);
        animal.swim("Кеша", 500);
        dog1.run("Бобик", 200);
        cat1.swim("Барсик", 2);
        dog1.run("Бобик", 100);
        dog1.swim("Шарик", 10);
        cat1.run("Мурзик", 300);
        

    }
}
