package ua.edu.ucu.apps.task1;

public abstract class Section {

    private int denomination;
    private Section next;

    public Section(int denomination) {
        this.denomination = denomination;
    }

    public void setNext(Section next) {
        this.next = next;
    }

    private boolean hasNext() {
        return next != null;
    }

    public void process(int amount) {
        //1000
        int left = amount % denomination;
        if (left != 0) {
            if (hasNext()) {
                next.process(left);
            }
        } 
        
        System.out.println(
            "Denomination: " + denomination + " Quantity: " + amount / denomination);
    }

}
