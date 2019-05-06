package andreworihilldatastructuresalgorithms2;

    public class Classroom { private Student[] seat;

    public Classroom(Student firstStudent) {
        this.seat = new Student[1];
        this.seat[0] = firstStudent;
    }
    public void print() {
        for (Student Student: this.seat) {
            System.out.println(Student.getName());
        }
    }
    public void insert(Student Student, int position) {
        // Adding a book to an empty Bookshelf.
        if (this.seat.length == 0 && position == 0) {
            this.seat = new Student [1];
            this.seat[0] = Student;
            return;
        }
        // Must insert book in a valid array position.
        if (position < 0 || position > this.seat.length) {
            return;
        }
        Student[] newClassroom = new Student [this.seat.length + 1];
        for (int i=0; i<this.seat.length+1; i++) {
            if (i < position) {
                newClassroom[i] = this.seat[i];
            }
            else if (i > position) {
                newClassroom[i] = this.seat[i-1];
            }
            else {
                newClassroom[i] = Student;
            }
        }
        this.seat = newClassroom;
    }
    
    
}