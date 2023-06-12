import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        /*
        Модифицировать учительский класс и связанные с ним, добавив типизацию
        (Добавить iterator + comparator + teacherGroup)
         */

        Teacher teacher0 = new Teacher(0, "Ivan", "Petrov", "Petrovich", LocalDate.now());
        Teacher teacher1 = new Teacher(1, "Petr", "Ivanov", "Ivanovich", LocalDate.now());
        Teacher teacher2 = new Teacher(2, "Genadiy", "Sidorov", "Gennadievich", LocalDate.now());
        Teacher teacher3 = new Teacher(3, "Pavel", "Tretyakov", "Pavlovich", LocalDate.now());
        Teacher teacher4 = new Teacher(4, "Maria", "Kosova", "Ivanovna", LocalDate.now());
        Teacher teacher5 = new Teacher(5, "Svetlana", "Pervaya", "Stepanovna", LocalDate.now());

        List<User> teachers = new ArrayList<>() {
            {
                add(teacher0);
                add(teacher1);
                add(teacher2);
                add(teacher3);
                add(teacher4);
                add(teacher5);

            }
        };
        System.out.println("Initial list of teachers");
        System.out.println(teachers);
        teachers.sort(new UserComparator<>());
        System.out.println("\n");
        System.out.println("Sorted list of teachers");
        System.out.println(teachers);

        System.out.println("\n");
        System.out.println("Simple iterator");

        Iterator<User> teacherIterator = teachers.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next().toString());
        }

        System.out.println("\n");
        System.out.println("Iterator with class TeacherGroupIterator and smaller group");
        TeacherGroup teacherRoom = new TeacherGroup(null);
        List<Teacher> teachers1 = new ArrayList<>() {
            {
                add(teacher0);
                add(teacher2);
                add(teacher3);
                add(teacher5);

            }
        };
        teacherRoom.setTeachers(teachers1);
        System.out.println(teacherRoom);

        TeacherGroupIterator teacherIterator1 = new TeacherGroupIterator(teacherRoom);
        while (teacherIterator1.hasNext()) {
            System.out.println(teacherIterator1.next().toString());
        }


        System.out.println("\n");
        System.out.println("Iterator with class UserGroupIterator using <T>");
        UserGroup teacherRoom2 = new UserGroup(null);
        teacherRoom2.setUsers(teachers);

        UserGroupIterator<Teacher> teacherIterator2 = new UserGroupIterator(teacherRoom2);
        while (teacherIterator2.hasNext()) {
            System.out.println(teacherIterator2.next().toString());
        }



    }
}