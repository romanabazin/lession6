public class Dog extends Animal{
    int canRunDog = 500;
    int canSwimDog = 10;
    int length;

    public void run(String name, int run) {
        this.length = run;
        if (length > canRunDog) System.out.printf("Столько бегать для %sа слишком много.\n", name);
        else {
            System.out.println(name + " пробежал " + length + " м.");
        }
    }
    public void swim(String name, int swim) {
        this.length = swim;
        if (length > canSwimDog) System.out.printf("Столько плавать для %sа слишком много.\n", name);
        else {
            System.out.println(name + " проплыл " + length + " м.");
        }
    }

}
