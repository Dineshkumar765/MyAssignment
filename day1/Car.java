package week1.day1;

public class Car {
	
	public void applyBreak() {
		System.out.println("applyBreak");
	}	
	public void applyGear() {
		System.out.println("applyGear");
	}
	public void applyAccelerate() {
		System.out.println("applyAccelerate");
	}
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void SwitchOnHeadLight(){
		System.out.println("SwitchOnHeadLight");
	}
	public void OpenSunRoof(){
	    System.out.println("OpenSunRoof");	
	}
	public void SwitchOnIndicator(){
		System.out.println("SwitchOnIndicator");
	}
	public void WearSearBelt(){
		System.out.println("WeaSearBelt");
	}
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.applyAccelerate();
		myCar.switchOnAc();
		myCar.WearSearBelt();
		myCar.OpenSunRoof();
		myCar.SwitchOnHeadLight();
		myCar.SwitchOnIndicator();
	}

}
