public class Main {
	public static void main (String[] args) {
		monitor monitor = new monitor ("asus","Gtr 1564x",15,18);
		motherBorad motherborad = new motherBorad ("nvdiea 152r", "0099","8","556","boot");
		personalCom p1 = new personalCom ("Ishu's zenbook","Notebook 785ySeries", monitor,motherborad);	
		p1.getMonitor ().setup ();
		Object obj1 = p1.toString ();
		System.out.println (p1.mb);
		System.out.println (obj1);
		
		
	}
}

