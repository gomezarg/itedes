public abstract class Animal {
    private String name;
    private Integer age;
    private Double weight;

    public Animal(String name, Double weight) {
        this.name = name;
        this.weight = weight;
        age = 0;
    }

    public void setName(String name) {
        if(name.length() <= 0)
            System.out.println("Nombre no valido");
        else
            this.name = name;
    }

    public String getName() { 
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public void eat(Double food) {
        weight += food;
    }

    public void poop(Double shit) {
        weight -= shit;
    }

    public Integer getAge() {
        return age;
    }

    public void getOlder() {
        age++;
    }

    public abstract void talk();
}
