package bank.controller;



import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import bank.dao.StudentDao;
import bank.dto.Student;
@WebServlet("/save")
public class StudentMain extends HttpServlet {
	public void service(ServletRequest req, ServletResponse res) {
		String name=req.getParameter("name");
		Student student=new Student();
		student.setName(name);
		System.out.println(name);
		StudentDao studentDao=new StudentDao();
		studentDao.saveStudent(student);
		
	}

		
	}


