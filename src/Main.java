import student.Student;
import carrer.nonSubject.*;
import Data.*;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        Student user = Student.getInstance();
        System.out.println(user.getTrack());
        //counseling_history h = new counseling_history();
        //h.scan_nonSubjectActivity();
        //System.out.println(h.getCounseling_number());


        //field_practice b = new field_practice();

        //graduation_requirement c = graduation_requirement.getInstance();
        //System.out.println(c.getCounseling());

        //System.out.println(b.getField_credit());


        nonSubjectActivity n = new nonSubjectActivity();

        //Data_nonSubject d = Data_nonSubject.getInstance();
        data_curriculum p = data_curriculum.getInstance();

        System.out.println(Arrays.toString(p.getCurriculum_classification()));
        System.out.println(p.getMajorbase_credit());
        System.out.println(p.getMajor_credit());






    }

}




