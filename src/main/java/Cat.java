public class Cat extends Animal{

    int canRunCat = 200;
    int length;

    public void run(String name, int run) {
        this.length = run;
        if (length > canRunCat) System.out.printf("Столько бегать для %sа слишком много.\n", name);
        else {
            System.out.println(name + " пробежал " + length + " м.");
        }
    }
    public void swim(String name, int swim) {
        System.out.printf("%s не умеет плавать.\n", name);
    }
}
