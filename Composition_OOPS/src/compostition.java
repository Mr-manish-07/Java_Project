public class compostition {
}
class product{
	private String brand;
	private String model;
	public product(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	
	@Override
	public String toString () {
		return "product{" +
				"brand='" + brand + '\'' +
				", model='" + model + '\'' +
				'}';
	}
}
class personalCom extends product{
	public monitor m1;
	public motherBorad mb;
	
	public personalCom (String brand, String model, monitor m1, motherBorad mb) {
		super (brand, model);
		this.m1 = m1;
		this.mb = mb;
	}
	public monitor getMonitor(){
		return  m1;
	}
	public motherBorad getMb(){
		return mb;
	}
	
	@Override
	public String toString () {
		return "personalCom{ \n" +
				"--> m1=" + m1 + " <--\n"+
				"--> mb=" + mb +" <-- \n"+
				"--> } " + super.toString () + " <--";
	}
}
class monitor extends product{
	private int length ;
	private  int breadth;
	
	public monitor (String brand, String model, int length, int breadth) {
		super (brand, model);
		this.length = length;
		this.breadth = breadth;
	}
	void setup(){
		System.out.println ("Display resulation is "+ length*breadth );
	}
	
	@Override
	public String toString () {
		return "monitor{" +
				"length=" + length +
				", breadth=" + breadth +
				"} " + " --> "+ super.toString ();
	}
}
class motherBorad extends product{
	private String bios;
	private String ram;
	private String ssd;
	
	public motherBorad (String brand, String model, String ram, String ssd, String bios) {
		super (brand, model);
		this.ram = ram;
		this.ssd = ssd;
		this.bios = bios;
	}
	void getDetails(){
		System.out.println ("The ram specification of the pc is " + ram +" the bios is " + bios);
	}
	
	@Override
	public String toString () {
		return "motherBorad{" +
				"bios='" + bios + '\'' +
				", ssd='" + ssd + '\'' +
				", ram='" + ram + '\'' +
				"} " + super.toString ();
	}
}