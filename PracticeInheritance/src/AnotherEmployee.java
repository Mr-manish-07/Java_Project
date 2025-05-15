public class AnotherEmployee extends Person{
	private int empoloyeId;
	String jobTitle;
	public int getEmpoloyeId(){
		return empoloyeId;
	}
	public void setEmpoloyeId(int empoloyeId){
		this.empoloyeId = empoloyeId;
	}
	
	public AnotherEmployee(String jobTitle,String firstName,String secondName){
		super(firstName,secondName);
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String getLastName () {
		return "Job title is "+jobTitle+" and last name is "+super.getLastName ();
		
	}
}
