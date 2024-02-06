public class StudentMaker {
  
  public static void main(String[] args) {
    Address address = new Address("Causeway Bay", "Tung Lo Wan Road", 180);
    Student student = new Student("Belinda", "Yu", 17, 12, address);
    student.setFirstName("Bella");
    System.out.println(student.getAge());
    int age = student.getAge();
    System.out.println(student);
    }
  }

