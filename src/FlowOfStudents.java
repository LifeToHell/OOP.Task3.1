import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FlowOfStudents implements Iterator<StudentGroup> {

    private List<StudentGroup> flowOfStudentsList;
    private int counter;


    public FlowOfStudents(List<StudentGroup> list) {
        this.flowOfStudentsList = list;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < flowOfStudentsList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return flowOfStudentsList.get(counter++);
    }

    @Override
    public void remove() {
        flowOfStudentsList.remove(counter - 1);
    }

    public Iterator<StudentGroup> iterator() {
        return this;
    }
}
