package com.raji.curd.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raji.curd.model.Student;


@Repository
public interface CurdStudentRepository extends MongoRepository<Student, String>{


	 public Student findByStudentName(String studentName);

	 public Student findByPercentage(Integer percentage);
	 
		public Student findByPercentageGreaterThanEqual(Integer percentage);
	public Student findByPercentageLessThan(Integer percentage);

}