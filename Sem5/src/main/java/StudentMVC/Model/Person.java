package StudentMVC.Model;

/**
 * An abstract class representing a person.
 */
public abstract class Person {
    private String name;
    private int age;

    /**
     * Constructs a new Person object with the specified name and age.
     *
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return A string representation of the person.
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
