package Bag;

public class Main {
    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<>();
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(5);
        bag.add(6);
        bag.add(7);
        bag.add(8);
        bag.add(9);
        bag.add(10);
        System.out.println(bag);
        System.out.println(bag.size());
        System.out.println(bag.isEmpty());
        System.out.println(bag.contains(5));
        System.out.println(bag.contains(11));
        System.out.println(bag.grab());
        System.out.println(bag.remove(5));
        System.out.println(bag);
        System.out.println(bag.size());
        System.out.println(bag.isEmpty());
        System.out.println(bag.contains(5));
        System.out.println(bag.contains(11));
        System.out.println(bag.grab());
        System.out.println(bag.toArray());
        bag.clear();
        System.out.println(bag);
        System.out.println(bag.size());
        System.out.println(bag.isEmpty());
        System.out.println(bag.contains(5));
        System.out.println(bag.contains(11));
        System.out.println(bag.grab());
        System.out.println(bag.toArray());
    }

}
