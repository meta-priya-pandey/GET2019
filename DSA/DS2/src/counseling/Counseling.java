package counseling;

import java.io.File;
import java.util.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.IOException;

import jxl.write.*;
import jxl.CellType;

public class Counseling {
	ArrayList<Program> programList = new ArrayList<>();
	ArrayList<AllocatedStudent> allocated = new ArrayList<>();
	QueueList queue = new QueueList();

	/**
	 * Add program and its capacity to the list
	 */
	public void addProgram() {

		final String EXCEL_FILE_LOCATION = "C:\\File\\Program.xls";
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
			Sheet sheet = workbook.getSheet(0);
			String programName = null;
			int capacity = 0;

			for (int i = 0; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell = sheet.getCell(j, i);
					CellType type = cell.getType();
					if (type == CellType.LABEL) {
						programName = cell.getContents();
					} else if (type == CellType.NUMBER) {
						capacity = Integer.parseInt(cell.getContents());
					}
				}
				Program p = new Program(programName, capacity);
				programList.add(p);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	/**
	 * Add Student and their preference to the queue
	 */
	public void addStudent() {

		final String EXCEL_FILE_LOCATION = "C:\\File\\Students.xls";
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
			Sheet sheet = workbook.getSheet(0);
			String studentName;
			Student student;
			String[] preference;
			System.out.println(sheet.getRows());
			for (int i = 0; i < sheet.getRows(); i++) {
				preference = new String[5];
				Cell name = sheet.getCell(0, i);
				studentName = name.getContents();
				System.out.println(studentName);
				for (int j = 1; j < sheet.getColumns(); j++) {

					Cell cell = sheet.getCell(j, i);
					CellType type = cell.getType();
					if (type == CellType.LABEL) {
						preference[j - 1] = cell.getContents();
					}
				}
				student = new Student(studentName, preference);

				queue.enQueue(student);
			}

		} catch (Exception e) {
			e.getMessage();
		}
	}

	/**
	 * Allocate the specific program to the student
	 * @throws IOException
	 */
	public boolean allocate() throws IOException {
		boolean isAlloted = false;
		int count = 0;
		
		while (!queue.isEmpty()) {
			System.out.println(count);
			count++;
			Student student =  queue.deQueue();
			isAlloted = false;
			
			for (int i = 0; i < student.getPreference().length; i++) {
				
				for (int j = 0; j < programList.size(); j++) {
						if ((student.getPreference()[i].equals(programList.get(j).getName()) && programList.get(j).getCapacity() > 0)) {
						allocated.add(new AllocatedStudent(student.getName(),student.getPreference()[i]));
						programList.get(j).setCapacity(programList.get(j).getCapacity() - 1);
						isAlloted = true;
						break;
					}
				}
				if (isAlloted) {
					break;
				}
			}
		}
		if(count==0)
			return false;
		
		return true;
	}

	/**
	 * Create new sheet and write in their student name and allocate program
	 * @throws IOException
	 */
	void writeBook() throws IOException {

		WritableWorkbook workbook = Workbook.createWorkbook(new File(
				"C:\\File\\AllocatedStudents.xls"));

		try {

			WritableSheet wSheet = workbook.createSheet("sheet1", 0);

			for (int i = 0; i < allocated.size(); i++) {
				String name = allocated.get(i).getStudentName();
				Label labTemp1 = new Label(0, i, name);
				wSheet.addCell(labTemp1);
				String program = this.allocated.get(i).getProgramName();

				Label labTemp2 = new Label(1, i, program);
				wSheet.addCell(labTemp2);
			}
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}