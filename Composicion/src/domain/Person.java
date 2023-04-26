package domain;

public class Person {

	private String name;
	private String id;
	private int Age;
	private String gender;
	private Location LoC;
	private Segurity Seg;
	
	public Person() {}

	public Person(String name, String id, int age, String gender, Location loc,Segurity seg) {
		super();
		this.name = name;
		this.id = id;
		this.Age = age;
		this.gender = gender;
		this.LoC=loc;
		this.Seg=seg;
	}

	public Location getLoC() {
		return LoC;
	}

	public void setLoC(Location loC) {
		LoC = loC;
	}

	public Segurity getSeg() {
		return Seg;
	}

	public void setSeg(Segurity seg) {
		Seg = seg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	} 
	
	public String ToString() {
		
		return this.name+"-"+this.id+"-"+this.Age+"-"+this.gender+"-"+this.LoC.ToString()+"-"+this.Seg.ToString();
		
	}
	
public String ToStringSecond() {
		
		return "Nombre: "+this.name+"\nCedula: "+this.id+"\nEdad: "+this.Age+"\nGenero: "+this.gender+this.LoC.ToStringSecond()+this.Seg.ToStringSecond();
		
	}
	
	
}
