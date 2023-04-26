package domain;

public class date {

	private String day;
	private String Month;
	private String Hours;
	private String regist;
	
	
	public date() {}
	
	public date(String day, String month, String hours, String regist) {
		super();
		this.day = day;
		this.Month = month;
		this.Hours = hours;
		this.regist = regist;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public String getHours() {
		return Hours;
	}

	public void setHours(String hours) {
		Hours = hours;
	}

	public String getRegist() {
		return regist;
	}

	public void setRegist(String regist) {
		this.regist = regist;
	}
	
	public String ToString() {
		
		return "Dia y Hora de Solicitud: "+this.regist+"\nFecha de cita: "+this.day+"//"+this.Month+"//"+this.Hours;
		
	}
	
	
}
