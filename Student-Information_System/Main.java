public class Main {
    public static void main(String[] args) {

        Course math = new Course("Maths", "MAT101", "MAT");
        Course physic = new Course("Physical", "PHY101", "PHY");
        Course chemical = new Course("Chemical", "CHM101", "CHM");

        Teacher t1 = new Teacher("John Devil", "90550000000", "MAT");
        Teacher t2 = new Teacher("David Samuel", "90550000001", "PHY");
        Teacher t3 = new Teacher("Jennifer Low", "90550000002", "CHM");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemical.addTeacher(t3);

        Student s1 = new Student("Loris Han", 4, "140144015", math, physic, chemical);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkOralNote(60, 40, 60);
        s1.isPass();

        Student s2 = new Student("Mike Sever", 4, "2211133", math, physic, chemical);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkOralNote(100, 70, 60);
        s2.isPass();

        Student s3 = new Student("Jessica Diesel", 4, "221121312", math, physic, chemical);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkOralNote(70, 40, 60);
        s3.isPass();
    }
}