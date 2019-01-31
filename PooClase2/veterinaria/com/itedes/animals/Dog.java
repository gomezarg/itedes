public class Dog {
	private String name;
	private String race;
	private String color;
	private Integer age;
	private Double weight;
	private String size;

	public Dog(String name, String race, String color, Double weight, String size){
		this.name = name;
		this.race = race;
		this.color = color;
		this.weight = weight;
		this.size = size;
		age = 0;
	}

	public void setName(String name){
		if(name.length() <= 0)
			System.out.println("Nombre no valido");
		else
			this.name =  name;
	}
	public String getName(){
		return name;
	}
	public String getRace(){
		return race;

	}
	public String getColor(){
		return color;

	}
	public Double getWeight(){
		return weight;
	}
	public Integer getAge(){
		return age;
	}
	public String getSize(){
		return size;
	}
	public void eat(Double food) {
		weight += food;
	}
	public void poop(Double shit) {
		weight -= shit;
	}

	public void getOlder(){
		age++;
	}
	public void bark(){
		System.out.println("guau guau");
	}
}