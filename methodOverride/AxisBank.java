package methodOverride;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("AxisBank class deposit");
	}
	
	public static void main(String[] args) {
		AxisBank depositoverride = new AxisBank();
				depositoverride.deposit();
	}
	

}
