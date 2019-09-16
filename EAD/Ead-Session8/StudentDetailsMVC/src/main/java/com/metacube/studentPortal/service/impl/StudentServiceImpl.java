package com.metacube.studentPortal.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metacube.studentPortal.dao.InsertAndFetchStudents;
import com.metacube.studentPortal.model.Student;
import com.metacube.studentPortal.service.StudentService;

/**
 * @author Priya
 * StudentServiceImpl is an implementation class for StudentService interface
 *
 */
@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	InsertAndFetchStudents iafs;

	/**
	 *@return List of all the students in the database 
	 */
	@Override
	public List<Student> getAllStudent()
	{
		List<Student> studentsList = iafs.fetchAll();
		return studentsList;
	}

	/**
	 * AddStudent adds student to the database list and print current student details in the logger
	 */
	@Override
	public void addStudent(Student student)
	{
		try
		{
			if (student.getFirstName() != null && student.getLastName() != null && student.getFatherName() != null
					&& student.getEmail() != null && student.getClassName() != null && student.getAge() != null)
			{

				Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
				log.info(student.getFirstName());
				log.info(student.getLastName());
				log.info(student.getFatherName());
				log.info(student.getEmail());
				log.info(student.getClassName());
				log.info(student.getAge());
				iafs.insert(student);
			}
			else
			{
				throw new NullPointerException("Null student details are not accepted");
			}
		}
		catch (NullPointerException e)
		{
			e.getMessage();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}