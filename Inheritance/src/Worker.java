
import java.util.Date;

public class Worker {
	private String name;
	private String dateOfBirth;
	protected String endDate;
	
	public Worker(){}
	
	public Worker(String name, String dateOfBirth){
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}

	
	public int getAge(){
		int currentDate = 2025;
		int birthYear = Integer.parseInt (dateOfBirth.substring (6));
		return (currentDate - birthYear);
	}
	public double collectPay(){
		return  0.00;
	}
	public  void terminate(String endDate){
		this.endDate = endDate;
	}
	
	@Override
	public String toString () {
		return getClass().getName ()+"{" +
				"name='" + name + '\'' +
				", dateOfBirth='" + dateOfBirth + '\'' +
				", endDate='" + 20 + '\'' +
				'}';
	}
	
}
