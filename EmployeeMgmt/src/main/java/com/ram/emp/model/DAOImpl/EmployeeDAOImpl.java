package com.ram.emp.model.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ram.emp.model.Interface.EmployeeDAO;
import com.ram.emp.model.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	
	
	private Transaction t;
	private Session session;

	public EmployeeDAOImpl() {
		
			  session = new Configuration()
					.configure()
					.addAnnotatedClass(Employee.class)
					.buildSessionFactory()
					.openSession();
	}

	@Override
	public void insertEmployee(Employee e) {
		
					t = session.beginTransaction();
					session.persist(e);
					t.commit();
					System.out.println("inserted sucessfully");
	}

}
