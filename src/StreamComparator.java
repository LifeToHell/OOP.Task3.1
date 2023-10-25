import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {




    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        int resuitOfComparning = o1.getQuantityStudents().compareTo(o2.getQuantityStudents());
        if (resuitOfComparning == 0){
            return o1.getQuantityStudents().compareTo(o2.getQuantityStudents());
            }

        return resuitOfComparning;
    }
}
