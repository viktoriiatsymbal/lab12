package ua.edu.ucu.apps.task1;

public class ATM {

    Section first;

    public ATM() {
        this.first = new Section_500();

        Section_200 section_200 = new Section_200();
        first.setNext(section_200);
    }

    public void getMoney(int amount) {
        first.process(1000);
    }
}
