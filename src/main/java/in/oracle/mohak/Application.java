package in.oracle.mohak;

import in.oracle.mohak.bean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Application.class, args);
		Student student=context.getBean(Student.class);
		student.preperation("UI/UX");
	}

}
