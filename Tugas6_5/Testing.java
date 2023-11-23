public class Testing {
    public static void main(String[] args) {
        Fish ikan = new Fish("iwak");
        Cat kucing1 = new Cat("Fluffy");
        Animal laba = new Spider();
        Pet p = new Cat("Whiskers");
        Pet S = new Fish("Peyek");
        // Animal a = new Animal();

        ikan.walk();
        ikan.eat();
        ikan.play();
        System.out.println("---------");
        kucing1.play();
        kucing1.walk();
        kucing1.eat();
        System.out.println("---------");
        laba.walk();
        laba.eat();
        System.out.println("---------");
        ((Pet) p).play();
        // ((Pet) p).walk();
        // ((Pet) p).eat();
        System.out.println("---------");
        ((Pet) S).play();
        // ((Pet) S).walk();
        // ((Pet) S).eat();
    }
}