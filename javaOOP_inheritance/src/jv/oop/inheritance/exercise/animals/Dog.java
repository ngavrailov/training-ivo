package jv.oop.inheritance.exercise.animals;

public class Dog extends Animal {

	public Dog(String name, int age, String gender) {
		super(name, age, gender);
	}

	@Override
	protected String produceSound() {
		return Constants.DOG_SOUND;
	}
}
