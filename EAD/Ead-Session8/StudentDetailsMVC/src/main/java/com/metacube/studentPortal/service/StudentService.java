package com.metacube.studentPortal.service;

import java.util.List;

import com.metacube.studentPortal.model.Student;

/**
 * @author Priya
 * Interface StudentService provides service methods for student  
 *
 */
public interface StudentService
{
	/**
	 * @return list of all the students
	 */
	public List<Student> getAllStudent();

	/**
	 * @param student
	 * Adds student to the list
	 */
	public void addStudent(Student student);
}