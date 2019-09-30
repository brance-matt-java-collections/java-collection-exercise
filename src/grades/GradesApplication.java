package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

//        System.out.println(students.get("BranceA").getGradeAverage());

        Boolean loop = true;

        do {
        System.out.println("Welcome!\n\n");
        System.out.println("Here are the GitHub usernames of our students: \n");
        for (String student : students.keySet() ){
            System.out.print("|" + student + "| ");
        }
        System.out.println("\n");
        System.out.println("What student do you want to creep on?");
        String userinput = input.nextLine();

        for (String student : students.keySet()){
            if(student.equalsIgnoreCase(userinput)){
                Student selStudent = students.get(userinput);
                System.out.format("Name %s - GitHub Username: %s\nCurrent Average: %.2f\n",selStudent.getName(), student, selStudent.getGradeAverage() );
            }
        }
            System.out.println("Would you like to keep going?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") ){
            System.out.println("Cool! Lets do it!");
        }else {
            loop = false;
        }
        }while (loop);




    }

}
