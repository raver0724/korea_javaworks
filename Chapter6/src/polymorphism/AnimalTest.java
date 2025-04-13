package polymorphism;

// 다향성 - 객체 타입을 여러형태로 구현하는 것

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}



class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 움직입니다");
	}
}

class Horse extends Animal{
	public void move() {
		System.out.println("말이 네 발로 뜁니다");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 높이 날라다닙니다");
	}
}







public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
//		Animal human = new Human();
//		Animal horse = new Horse();
		
//		human.move();
//		horse.move();
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Horse());
		aTest.moveAnimal(new Eagle());
		
		
	}

}
