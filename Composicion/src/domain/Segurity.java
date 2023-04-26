package domain;

public class Segurity {

	private String Username;
	private String Password;
	private int i;
	
	


	public Segurity() {}


	public Segurity(String username, String password,int i) {
		super();
		Username = username;
		Password = password;
		this.i=i;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}
 

	public void setPassword(String password) {
		Password = password;
	}
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}
	
	public String ToString () {
		
		return this.Username+"-"+this.Password+"-"+this.i;
		
	}
	public String ToStringSecond() {
		
		return "\nUsuario Activo: "+this.Username+"\nContraseña: "+this.Password+"\nCodigo: "+this.i;
		
	}
	
	
}
