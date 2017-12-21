
public class ERTester {

    public static void main(String[] args) {
        LinkedPriorityQueue ER = new LinkedPriorityQueue(3);
        ER.enqueue("Sam", 2);
        ER.enqueue("Bob", 1);
        ER.enqueue("Joe", 0);
        ER.enqueue("Amy", 1);

        System.out.println("Treating patoent " + ER.dequeue());
        System.out.println("Treating patoent " + ER.dequeue());
        System.out.println("Treating patoent " + ER.dequeue());
        System.out.println("Treating patoent " + ER.dequeue());
    }

}
