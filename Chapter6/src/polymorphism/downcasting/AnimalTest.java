package polymorphism.downcasting;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

public void readBook() {
	System.out.println("사람이 책을 읽습니다.");
}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human animal = new Human();
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.move();
			human.readBook();
			
		}
		
		

	}
	}

