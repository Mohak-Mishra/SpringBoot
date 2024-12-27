package in.oracle.mohak.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component("UI")
public class UICourseMaterial implements Serializable ,ICourseMaterial{
    @Value("${content.UI}")
    private String content;
    @Value("${price.UI}")
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
