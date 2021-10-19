package com.raji.curd.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raji.curd.model.Student;
import com.raji.curd.repository.CurdStudentRepository;
@Service
public class CrudService {

	@Autowired
	private CurdStudentRepository curdStudentRepository;
	
	public Student SaveStudent(Student stu)
	{
		try
		{
		  curdStudentRepository.save(stu);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stu;
	}
	public void DeleteStudent(Student stu)
	{
		
		try
		{
		  curdStudentRepository.delete(stu);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	public Student fetchStudentName(String studentName)
	{
		Student stuobj=null;
		try
		{
			
			stuobj= curdStudentRepository.findByStudentName(studentName);
			if(stuobj==null)
			{
				stuobj=new Student();
				stuobj.setMessage("student Name is not Found"+studentName);
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stuobj;
	}
	public Student fetchPercentage(Integer percentage)
	{
		Student percentobj=null;
		try
		{
			
			percentobj= curdStudentRepository.findByPercentage(percentage);
			if(percentobj==null)
			{
				percentobj=new Student();
				percentobj.setMessage("student Name is not Found"+percentage);
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return percentobj;
	}
	public Student fetchPercentageLessThan(Integer percentage)
	{
		Student percentobj=null;
		try
		{
			
			percentobj= ((CurdStudentRepository) curdStudentRepository).findByPercentageLessThan(percentage);
			if(percentobj==null)
			{
				percentobj=new Student();
				percentobj.setMessage("student Name is not Found"+percentage);
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return percentobj;
	}
	public Student fetchPercentageGreaterThanEqual(Integer percentage)
	{
		Student percentobj=null;
		try
		{
			
			percentobj= ((CurdStudentRepository) curdStudentRepository).findByPercentageGreaterThanEqual(percentage);
			if(percentobj==null)
			{
				percentobj=new Student();
				percentobj.setMessage("student Name is not Found"+percentage);
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return percentobj;
	}



	

}