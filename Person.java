package pack;

//Define the Person class
class Person {
 // Attributes (fields)
 String name;
 int age;
 String gender;

 // Constructor to initialize attributes
 public Person(String name, int age, String gender) {
     this.name = name;
     this.age = age;
     this.gender = gender;
 }

 // Method to display person details
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Gender: " + gender);
     System.out.println();
 }
}

//Main class to test the Person class
public class PersonDemo {
 public static void main(String[] args) {
     // Creating objects using constructor
     Person person1 = new Person("Alice", 25, "Female");
     Person person2 = new Person("Bob", 30, "Male");

     // Display information of each person
     System.out.println("Person 1 Details:");
     person1.displayInfo();

     System.out.println("Person 2 Details:");
     person2.displayInfo();
 }
}
