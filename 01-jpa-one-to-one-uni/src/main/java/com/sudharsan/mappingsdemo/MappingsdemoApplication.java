package com.sudharsan.mappingsdemo;

import com.sudharsan.mappingsdemo.dao.AppDao;
import com.sudharsan.mappingsdemo.entity.Instructor;
import com.sudharsan.mappingsdemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MappingsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingsdemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao){
		return runner -> {
			//createInstructor(appDao);
			//findInstructor(appDao);

			deleteInstructor(appDao);
		};
	}

	private void deleteInstructor(AppDao appDao) {

		int theId=2;

		appDao.deleteInstructorById(theId);
	}

	private void findInstructor(AppDao appDao) {
		int theId=2;

		System.out.println("finding the id :"+theId);
		Instructor tempInstructor=appDao.findById(theId);
		System.out.println(tempInstructor);
		System.out.println("Associated details only:"+tempInstructor.getInstructorDetail());

	}

	private void createInstructor(AppDao appDao) {
/*
		Instructor tempInstructor=new Instructor("Siva","Kumar","SivaKumar@gmail.com");

		InstructorDetail tempinstructorDetail=new InstructorDetail("www.youtube.com/sivakumar codes","basketball");

		tempInstructor.setInstructorDetail(tempinstructorDetail);



		appDao.save(tempInstructor);*/


		Instructor tempInstructor=new Instructor("Madhu","Priya","Madhu@yahoo.com");

		InstructorDetail tempinstructorDetail=new InstructorDetail("www.youtube.com/ML and python","Vlogging");

		tempInstructor.setInstructorDetail(tempinstructorDetail);



		appDao.save(tempInstructor);
	}
	}





