public class quee2 {
    public static void main(String[] args) {
        tugasque1 a = new tugasque1(3);
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        a.print();
        a.dequeue();
        a.print();
        a.dequeue();
        a.print();
        a.dequeue();
        a.print();

    }
}
