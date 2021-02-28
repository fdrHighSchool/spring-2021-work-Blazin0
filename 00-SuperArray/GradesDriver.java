public class GradesDriver{
  public static void main(String[] args){
    Grades exams = new Grades(0);
    Grades homework = new Grades(0);
    Grades participation = new Grades(0);
    Grades projects = new Grades(0);
    int sum = 0;
    exams.gadd(97);
    exams.gadd(89);
    homework.gadd(99);
    homework.gadd(85);
    homework.gadd(83);
    participation.gadd(95);
    projects.gadd(89);
    sum += exams.average() + homework.average() + participation.average() + project.average();
    system.out.println(sum/4);
  }
}
