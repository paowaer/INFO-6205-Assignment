package Bag;
import java.util.*;

public class Bag<T> {
    private Queue<T> que; // a queue to store the elements in the bag
    private Map<T, Integer> map; // key: item, value: the number of occurrences of the item in the bag
    private int size; // the number of elements in the bag

    // constructor
    public Bag() {
        que = new LinkedList<>();
        map = new HashMap<>();
    }

    // add an item to the bag
    public void add(T item) {
        que.offer(item);
        size++;
        map.put(item, map.getOrDefault(item, 0) + 1);
    }

    // remove all items from the bag
    public void clear() {
        que.clear();
        map.clear();
        size = 0;
    }

    // check if the bag contains the item
    public boolean contains(T item) {
        return map.containsKey(item);
    }

    // return a random item from the bag
    public T grab() {
        if (que.isEmpty()) {
            return null;
        }
        int randNum = new Random().nextInt(size);  // Generate a random number between 0 and size - 1, to ensure that each element has an equal probability of being selected
        List<T> tempList = new ArrayList<>(que);   // convert the queue to ArrayList
        return tempList.get(randNum);              
    }

    // check if the bag is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // remove the first occurrence of the item from the bag
    public boolean remove(T item) {
        if (!map.containsKey(item)) {
            return false;
        }
        size--;

        // remove the first occurrence of item in the queue
        while (!que.isEmpty()) {
            T temp = que.poll();
            if (temp.equals(item)) {
                break;
            }
            que.offer(temp);
        }

        // remove the item from the map
        if (map.get(item) == 1) {
            map.remove(item);
        } else {
            map.put(item, map.get(item) - 1);
        }
        return true;
    }

    // the size of the bag
    public int size() {
        return size;
    }

    // convert the bag to an ArrayList
    public List<T> toArray() {
        return new ArrayList<>(que);
    }

    // convert the bag to a string
    public String toString() {
        return que.toString();
    }

}