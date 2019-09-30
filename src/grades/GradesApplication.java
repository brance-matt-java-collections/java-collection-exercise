package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        students.put("BranceA", new Student("Brance"));
        students.put("Mattlopez4011", new Student("Matt"));
        students.put("KevinArnall", new Student("Kevin"));
        students.put("davidandstephens", new Student("David"));

        students.get("BranceA").addGrade(90);
        students.get("BranceA").addGrade(82);
        students.get("BranceA").addGrade(95);

        students.get("Mattlopez4011").addGrade(75);
        students.get("Mattlopez4011").addGrade(85);
        students.get("Mattlopez4011").addGrade(100);

        students.get("KevinArnall").addGrade(8);
        students.get("KevinArnall").addGrade(24);
        students.get("KevinArnall").addGrade(50);

        students.get("davidandstephens").addGrade(5);
        students.get("davidandstephens").addGrade(36);
        students.get("davidandstephens").addGrade(91);

        System.out.println(students.get("BranceA").getGradeAverage());

    }

}
