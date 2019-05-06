package andreworihilldatastructuresalgorithms2;

public class AndrewOrihillDataStructuresAlgorithms2 {

    public static void main(String[] args) {
        System.out.println("Students and Seats in a Classroom");
        System.out.println("In Order:");
        Classroom seat1 = new Classroom(new Student("Howard"));
        seat1.insert(new Student("Fine"), 1);
        seat1.insert(new Student("Moe"), 2);
        seat1.insert(new Student("Larry"), 3);
        seat1.insert(new Student("Curly"), 4);
        seat1.print();

        System.out.println();
        System.out.println("Reverse Order:");
        Classroom seat2 = new Classroom(new Student("Howard"));
        seat2.insert(new Student("Fine"), 0);
        seat2.insert(new Student("Moe"), 0);
        seat2.insert(new Student("Larry"), 0);
        seat2.insert(new Student("Curly"), 0);
        seat2.print();

        System.out.println();
        System.out.println("Mixed Order:");
        Classroom seat3 = new Classroom(new Student("Howard"));
        seat3.insert(new Student("Fine"), 1);
        seat3.insert(new Student("Moe"), 2);
        seat3.insert(new Student("Larry"), 1);
        seat3.insert(new Student("Curly"), 2);
        seat3.print(); 
    }
}