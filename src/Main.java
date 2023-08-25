import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Object> backingArray = new ArrayQueue<>();

        backingArray.enqueue(1);
        backingArray.enqueue(2);
        backingArray.enqueue(3);
        System.out.println("Dequeued element: " + backingArray.dequeue());
        backingArray.enqueue(4);
        backingArray.enqueue(5);

        for (Object num: backingArray.getBackingArray()){
            System.out.println(num);
        }
        System.out.println("Size: " + backingArray.size());

    }


}