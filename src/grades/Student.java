package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(int grade : grades){
            total += Double.valueOf(grade);
        }
        return (total / grades.size());

    }

    public static void main(String[] args) {
        Student testStudent = new Student("Jimbob");

        testStudent.addGrade(60);
        testStudent.addGrade(55);
        System.out.println(testStudent.getGradeAverage());
    }

}