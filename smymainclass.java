package mymanclass;
import model.*;
import dao.EmployeeDao;
import dao.StudentWork;

import java.util.*;
public class MyMainClass {

	StudentWork sw;
	public MyMainClass() {
		sw=new StudentWork();
	}
	public void Addemp() {
		StudentWork e=new StudentWork();
		int cnt=sw.AddStudentWork(e);
		if(cnt>0)
		{
			System.out.println("student Added Successfully");
		}
		else
		{
			System.out.println("Error!!!!");
		}
		
	}
	public void DisplayAll() {
		List<StudentWork>lst=sw.GetAllStudentWork();
		for(StudentWork e:lst) {
			System.out.println(e.GetAllStudentWork());
		}
	}
	public static void main(String[] args) {


		MyMainClass m=new MyMainClass();
		m.Addemp();
		m.DisplayAll();
	}

}
