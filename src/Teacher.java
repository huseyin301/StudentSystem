public class Teacher {

    String name;
    String phone;
    String branch;

    Teacher(String name, String phone, String branch) {

        this.name = name;
        this.phone = phone;
        this.branch = branch;

    }

    void teacherInformation() {

        System.out.println("Name : " + this.name);
        System.out.println("Phone number  : " + this.phone);
        System.out.println("Branch : " + this.branch);
        System.out.println("---------------------------------------");


    }

}
