class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4); 
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.printf("%s sedang bermain\n", name);
    }

    // public void walk() {
    //      System.out.printf("%s sedang berjalan\n", name);
    // }

    public void eat() {
         System.out.printf("%s sedang makan\n", name);
    }
}