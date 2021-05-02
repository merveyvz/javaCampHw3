public class StudentManager extends UserManager{
    public void doHomework(Student student){
        System.out.println( student.getFirstName() + " " + student.getLastName() + " ödev tamamlandı");
    }
}
