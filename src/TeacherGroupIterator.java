import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher>{
    private int counter;
    private final List<Teacher> teachers;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teachers = teacherGroup.getTeachers();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teachers.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            throw new RuntimeException("Teachers");
        }

        return teachers.get(counter++);
    }
}