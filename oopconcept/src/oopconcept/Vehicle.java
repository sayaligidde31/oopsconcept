package oopconcept;

public class Vehicle {
	int speed = 40;
}

class Bike extends Vehicle {
	int speed = 100;

	void display() {
		System.out.println(speed);// it will display Bike class speed...
		System.out.println(super.speed);// it will display Bike class speed...

	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.display();

		// TODO Auto-generated method stub

	}

}
