package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component("java")
public class JavaCourseMaterial implements Serializable ,ICourseMaterial{
    @Value("${content.java}")
    private String content;
    @Value("${price.java}")
    private Double price;
    @Override
    public String courseContent() {
        return content;
    }

    @Override
    public Double price() {
        return price;
    }
}
