package bai_23.thuc_hanh.trien_khai_observer;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}
