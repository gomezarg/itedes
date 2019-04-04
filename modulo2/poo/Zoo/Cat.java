public class Cat extends Animal {

    private String hairLength;

    public Cat(String name,Double weight, String hairLength) {
        super(name, weight);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    public void talk() {
        System.out.println("miau miau!");
    }
}
