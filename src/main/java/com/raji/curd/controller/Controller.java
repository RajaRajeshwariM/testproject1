package com.raji.curd.controller;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raji.curd.model.Student;
import com.raji.curd.service.CrudService;

import ch.qos.logback.classic.Logger;

@RestController
public class Controller {

    public final org.slf4j.Logger logger=LoggerFactory.getLogger(getClass());

	@Autowired
	private CrudService curdService;

	@RequestMapping(value = "/savestudent", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student stu)

	{
		try {
			curdService.SaveStudent(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stu;
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public Student updateStudent(@RequestBody Student stu)

	{
		try {
			curdService.SaveStudent(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stu;
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
	public Student deleteStudent(@RequestBody Student stu)

	{
		try {
			curdService.DeleteStudent(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stu;
	}
	/*
	 * @RequestMapping(value="/student") private static List<Student> student =new
	 * ArrayList<Student>();
	 * 
	 * @GetMapping public List<Student> getMarks(){ return student; }
	 * Collections.sort(List, (s1, s2) -> { return s2.name.compareTo(s1.name); }
	 */

    @RequestMapping(value="/fetchstudent",method=RequestMethod.POST)
	public Student findByStudentName(@RequestParam String studentName)
	{	
		Student stuobj=null;
		try
		{
			
			stuobj= curdService.fetchStudentName(studentName);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stuobj;
	}

    @RequestMapping(value="/fetchpercentage",method=RequestMethod.POST)
		public Student findByPercentage(@RequestParam Integer percentage)
		{	
			Student percentageobj=null;
			try
			{
				
				percentageobj= curdService.fetchPercentage(percentage);
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return percentageobj;
	}
    @RequestMapping(value="/fetchpercentageless",method=RequestMethod.POST)
	public Student findByPercentageLessThan(@RequestParam Integer percentage)
	{	
		Student percentageobj=null;
		try
		{
			
			percentageobj= curdService.fetchPercentageLessThan(percentage);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return percentageobj;
}

    @RequestMapping(value="/fetchpercentagegreat",method=RequestMethod.POST)
    public Student findByPercentageGreaterThanEqual(@RequestParam Integer percentage)
	{	
		Student percentageobj=null;
		try
		{
			
			percentageobj= curdService.fetchPercentageGreaterThanEqual(percentage);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return percentageobj;
}
}