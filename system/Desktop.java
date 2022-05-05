package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("desktop size is 11inc");
	}
	
	public static void main(String[] args) {
		Computer Com = new Computer();
				Com.computerModel();
				Desktop DS = new Desktop();
				DS.desktopSize();
		
	}

}
