package Assignment_8_Problem1;

public class Test {
    public static void main(String[] args) {
        PersonList list = new PersonList();
        list.add(new Person("Oblego", "Alexander", 23));
        list.add(new Person("Doe", "John", 28));
        list.add(new Person("Johnson", "Emma", 28));
        list.insert(new Person("White", "Oliver", 40), 2);
        list.insert(new Person("Green", "Sophia", 22), 3);
        System.out.println("Find Doe: " + list.find("Oblego"));
        System.out.println("At index 3: " + list.get(3));
    }
}