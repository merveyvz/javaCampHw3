public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(new String[] {"Java"});

        student1.setFirstName("Merve");
        student1.setLastName("Yavuz");
        student1.setEmail("aaaaa@gmail.com");
        student1.setPassword("1234sdf");
        student1.setUserID(12345);

        Instructor instructor1 = new Instructor(new String[]{"Java", "c#"});

        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demiroğ");
        instructor1.setEmail("ssssss@gmail.com");
        instructor1.setPassword("dsfdsfdsfsd");
        instructor1.setUserID(98745);

        UserManager userManager = new UserManager();

        userManager.signIn(student1);
        userManager.signIn(instructor1);

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.addHomework(instructor1);

        StudentManager studentManager = new StudentManager();

        studentManager.doHomework(student1);







    }
}
