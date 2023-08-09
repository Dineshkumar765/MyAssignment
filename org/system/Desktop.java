package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktop Size");
	}
	public static void main(String[] args) {
		Desktop get=new Desktop();
		get.computerModel();
		get.desktopSize();
		}


}
