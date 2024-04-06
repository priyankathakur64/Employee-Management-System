package com.EmployeeManagementSystemAPI.EmployeeManagementSystem;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	SessionFactory sf;

	@RequestMapping("show")
	public String show() {
		return "crud";
	}
	
	//Create a Employee
	@PostMapping("save")
	public String save(Employee employee){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(employee);
		t.commit();
		s.close();
		return "crud";
	}
	
	//Update existing Employee
	@RequestMapping("viewupdate")
	public String showUpdate() {
		return "crud";
	}

	@RequestMapping("update")
	public String update(Employee employee){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(employee);
		t.commit();
		s.close();
		return "crud";
	}
	//Delete a Employee
	@RequestMapping("viewdelete")
	public String showDelete() {
		return "crud";
	}
	
	@RequestMapping("delete")
	public String delete(Employee employee){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee e =s.get(Employee.class, employee.getEid());
		s.delete(e);
		t.commit();
		s.close();
		return "crud";
	}
	
	//Get all Employees.
	@RequestMapping("read")
	public ModelAndView showselect() {
		Session s = sf.openSession();
		Query query = s.createQuery("from Employee");
		List<Employee> list = query.list();
		System.out.println(list);
		ModelAndView model = new ModelAndView();
		model.setViewName("crud");
		model.addObject("list", list);
		return model;
	}
	/*
	//Create a Employee
	@PostMapping("/Employees/create")
	public String create(@RequestBody Employee employee){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(employee);
		t.commit();
		s.close();
		return "New Employee created Successfully"+employee;
	}	
	//Get all Employees.
	@GetMapping("showAllEmployee")
	public String getAllEmployee(){
		Session s = sf.openSession();
		Query query = s.createQuery("from Employee");
		List<Employee> list = query.list();
		s.close();
		return "List of all Employee"+list;
	}
	//Get Employee by ID.
	@GetMapping("getEmployee/{eid}")
	public String getEmployee(@PathVariable int eid){
		Session s = sf.openSession();
		Employee e =s.get(Employee.class, eid);
		s.close();
		return "Specific Employee "+e;
	}
	//Update existing Employee
	@PutMapping("Employee")
	public String update(@RequestBody Employee employee){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(employee);
		t.commit();
		s.close();
		return "Updated "+employee;
	}
	//Delete a Employee
	@DeleteMapping("Employee/{eid}")
	public String delete(@PathVariable int eid){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee e =s.get(Employee.class, eid);
		s.delete(e);
		t.commit();
		s.close();
		return "Delete Successfully "+eid;
	}
	<%
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem", "root",
			"root");
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5)
				+ "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(6)
				+ "</td><td>" + rs.getDouble(7) + "</td></tr>");
			}
		} catch (Exception e) {
			out.println(e);
		}
		%>
	 */
}
