public class Start {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Alp", "26821631", "Mth");
        Teacher t2 = new Teacher("cem", "36541314", "Bt");
        Teacher t3 = new Teacher("Muharrem", "36243", "Psc");

        Course maths = new Course("Maths", "312", "Mth");
        maths.addTeacher(t1);

        Course computer = new Course("InformationTec", "879", "Bt");
        computer.addTeacher(t2);


        Course physical = new Course("Physical", "535", "Psc");
        physical.addTeacher(t3);

        Student s1 = new Student("Ahmet", "42", "9E", maths, computer, physical);
        s1.addBulkExamNote(100, 100, 95);
        s1.isStudentPass();

        Student s2 = new Student("Mete", "3133", "9E", maths, computer, physical);
        s2.addBulkExamNote(15, 55, 20);
        s2.isStudentPass();

    }
}
