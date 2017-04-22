package cn.com.sky.patterns.structural.adapter.obj;

public class Adapter implements Job {

	Person person;

	public Adapter(Person person) {
		this.person = person;
	}

	public void speakEnglish() {
		person.speakEnglish();
	}

	public void speakJapanese() {
		person.speakJapanese();
	}

	// new add
	public void speakFrench() {
		System.out.println("I can speak French!");
	}

}
