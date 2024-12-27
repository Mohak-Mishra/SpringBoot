package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component("dotNet")
public class dotNetCourseMaterial implements Serializable ,ICourseMaterial{
    @Value("${content.dotNet}")
    private String content;
    @Value("${price.dotNet}")
    private double price;
    @Override
    public String courseContent() {

        return content;
    }
    @Override
    public Double price() {
        return price;
    }
}
