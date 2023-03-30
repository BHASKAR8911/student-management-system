package net.studentmanagementsystem;

import net.studentmanagementsystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		

		  Student student1 = new Student("Jatin", "Sharma", "jatin@gmail.com");
		  studentRepository.save(student1);

		  Student student2 = new Student("Naveen", "Rawat", "Naveen@gmail.com");
		  studentRepository.save(student2);

		  Student student3 = new Student("Kapil", "Yadav", "Kapil@gmail.com");
		  studentRepository.save(student3);

		  Student student4 = new Student("Piyush", "Sharma", "Piyush@gmail.com");
		  studentRepository.save(student4);
		  Student student5 = new Student("Dinesh", "Garg", "Dinesh@gmail.com");
		  studentRepository.save(student5);


		
	}

}
