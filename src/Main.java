import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup("a","www","a");
        StudentGroup studentGroup2 = new StudentGroup("b","bbbb","b");
        StudentGroup studentGroup3 = new StudentGroup("c","aaa","c");
        List<StudentGroup> list = new ArrayList<>();
        list.add(studentGroup1);
        list.add(studentGroup2);
        list.add(studentGroup3);
        FlowOfStudents flowOfStudents = new FlowOfStudents(list);
        studentGroupIterator(flowOfStudents);
        list.sort(new StreamComparator());
        System.out.println(list);



    }
    public static void studentGroupIterator(FlowOfStudents flowOfStudents){
        Iterator<StudentGroup> groupIterator = flowOfStudents.iterator();
        while ((groupIterator.hasNext())){
            System.out.println(groupIterator.next());
        }

    }


}