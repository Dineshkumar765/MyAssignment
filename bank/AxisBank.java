package bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Axis deposit");
	}
	public static void main(String[] args) {
		AxisBank get=new AxisBank();
		get.deposit();
		get.saving();
		get.fixed();
	}

}
