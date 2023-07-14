package StudentMVC.Model;

/**
 * A class representing a student.
 */
public class Student extends Person implements Comparable<Student> {

    private int id;

    /**
     * Constructs a new Student object with the specified name, age, and ID.
     *
     * @param name The name of the student.
     * @param age  The age of the student.
     * @param id   The ID of the student.
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }


    /**
     * Gets the ID of the student.
     *
     * @return The ID of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the student.
     *
     * @param id The ID of the student.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns a string representation of the student.
     *
     * @return A string representation of the student.
     */
    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    /**
     * Compares this student to another student based on their age and ID.
     *
     * @param o The student to compare to.
     * @return A negative integer if this student is less than the other student,
     *         zero if they are equal, or a positive integer if this student is greater than the other student.
     */
    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
            return 1;
        else
            return -1;
    }
}
