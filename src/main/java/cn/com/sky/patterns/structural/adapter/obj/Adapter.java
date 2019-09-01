package cn.com.sky.patterns.structural.adapter.obj;

public class Adapter implements Job {

    Person person;

    public Adapter(Person person) {
        this.person = person;
    }

    @Override
    public void speakEnglish() {
        person.speakEnglish();
    }

    @Override
    public void speakJapanese() {
        person.speakJapanese();
    }

    // new add
    @Override
    public void speakFrench() {
        System.out.println("I can speak French!");
    }

}
