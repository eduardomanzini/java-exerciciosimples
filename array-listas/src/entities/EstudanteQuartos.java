package entities;

public class EstudanteQuartos {

	private String Name;
	private String email;
	
	public EstudanteQuartos(String name, String email) {	
		this.Name = name;
		this.email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		return "Name= " + Name + ", email= " + email;
	}
	
	
	
	
	
	
}
