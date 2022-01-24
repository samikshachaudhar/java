package dao;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentWork {
connection con;
Statement st;
ResultSet rs;
public StudentWork() {
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		con=(connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	}
	catch(Exception ex) {
		System.out.println("Exception=>"+ex.getMessage());
	}
}

public int AddStudentWork(StudentWork e) {
	
	int cnt=0;
	try
	{
		st=con.createStatement();
		cnt=st.executeUpdate("insert into StudentWork(studentNo,studentName,DateOfBirth,DateofJoining) values("+e.getStudentNo()+",'"+e.getstudentName()+"','"+e.getDateofBirth()+"','"+e.getDateofjoining()+")");

	}
	catch(Exception ex) {
		System.out.println("Exception=>"+ex.getMessage());
	}
	return cnt;
}

private String getStudentNo() {
	// TODO Auto-generated method stub
	return null;
}

public int UpdateEmployee(StudentWork e) {
	
	int cnt=0;
	try {
		st=con.createStatement();
			cnt=st.executeUpdate("update employees set employeeName='"+e.getEmployeeName()+"', emailAddress='"+e.getEmailAddress()+"', password='"+e.getPassword()+"', mobileNumber='"+e.getMobileNumber()+"', designation='"+e.getDesignation()+"', salary="+e.getSalary()+" where employeeId="+e.getEmployeeId());

	}
	catch(Exception ex) {
		System.out.println("Exception=>"+ex.getMessage());
	}
	return cnt;
}
public int DeleteEmployee(int id) {
	
	int cnt=0;
	try {
		st=con.createStatement();
			cnt=st.executeUpdate("delete from employees  where employeeId="+id);

	}
	catch(Exception ex) {
		System.out.println("Exception=>"+ex.getMessage());
	}
	return cnt;
}


public List<StudentWork>GetAllStudentWork(){
	List<StudentWork>lst=new ArrayList<>();
	try {
		st=con.createStatement();
		rs=st.executeQuery("select * from StudentWork");
		while(rs.next()) {
			int No=rs.getInt("studentNo");
			String name=rs.getString("studentName");
			Date DOB=rs.getDate("DateofBirth");
			Date DOJ=rs.getDate("Dateofjoining");
			StudentWork s=new StudentWork(No, name, DOB,DOJ);
			lst.add(s);
		}
	}
	catch(Exception ex) {
		System.out.println("Exception=>"+ex.getMessage());
	}
	return lst;
	
}

public  StudentWork GetStudentByNo(int No){
	StudentWork Dao =null;
	Object sw1;
	try {
		st=con.createStatement();
		rs=st.executeQuery("select * from StudentWork where StudentNo="+No);
		if(rs.next()) {

			int No=rs.getInt("studentNo");
			String name=rs.getString("studentName");
			Date DOB=rs.getDate("DateofBirth");
			Date DOJ=rs.getDate("Dateofjoining");
			sw1=new Dao(No, name, DOB,DOJ);
			 
		}
	}
	catch(Exception ex) {
		System.out.println("Exception=>"+ex.getMessage());
	}
	return sw1;
	
}
}
