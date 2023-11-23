public class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk(){
        System.out.println("Sedang berjalan");
    }

    public void eat() {
        System.out.println("Sedang makan");
    }
}
