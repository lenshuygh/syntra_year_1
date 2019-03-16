package year1.javafoundations.solutions.chapter20.exercise5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by JonathanSyntra on 26/03/2017.
 */
public class BurgerApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> burgerOrderQueue = new LinkedList<>();
        BurgerOrder burgerOrder1 = new BurgerOrder("Bicky burger", 1);
        BurgerOrder burgerOrder2 = new BurgerOrder("Bicky burger Royal", 2);
        BurgerOrder burgerOrder3 = new BurgerOrder("Chicken burger", 3);
        BurgerOrder burgerOrder4 = new BurgerOrder("Fish burger", 4);

        burgerOrderQueue.offer(burgerOrder1);
        burgerOrderQueue.offer(burgerOrder2);
        burgerOrderQueue.offer(burgerOrder3);
        burgerOrderQueue.offer(burgerOrder4);

        // Handling Queue
        BurgerOrder peek = burgerOrderQueue.peek();
        while(peek != null){
            System.out.println("About to handle " + peek);
            BurgerOrder poll = burgerOrderQueue.poll();
            System.out.println("Handling " + poll);
            peek = burgerOrderQueue.peek();
        }

        burgerOrderQueue.stream().forEach(System.out::println);
    }
}
