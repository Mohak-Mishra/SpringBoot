package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    @Qualifier("UI")
    private  ICourseMaterial icm;
    public void preperation(String examName){
        System.out.println("Student is preparing for "+examName);
        String content=icm.courseContent();
        Double price=icm.price();
        System.out.println("preparation is going on :: "+content+" for price : "+price);
    }
}
