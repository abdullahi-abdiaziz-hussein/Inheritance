import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter title");
//        String title = input.nextLine();
//        System.out.println("Enter description");
//        String description = input.nextLine();
//
//        Note note1 = new Note(title,description);
////        note1.setTitle("visit mom");
////        note1.setDescription("go home");
//        System.out.println(note1.getTitle());
//        System.out.println(note1.getDescription());

        Student student = new Student("Ali",23,true);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.isHasLaptop());
        student.eat();

        Human human = new Human("Sumayo",18);
        System.out.println(human.getName());
        System.out.println(human.getAge());



    }
}
