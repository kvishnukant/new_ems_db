package com.sample.mvc.serviceTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.sample.mvc.dao.EmployeeDAO;
import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.service.EmployeeServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	@Mock
	private EmployeeDAO employeeDao;
	
	
	@InjectMocks
	private EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
	
	
	
	 @Before
	    public void setup() {
	 
	        // Process mock annotations
	        MockitoAnnotations.initMocks(this); 
	 }
	 
	 
	 
	@Test
	public void testGetEmployeeById() {
		EmployeeCommand emp = new EmployeeCommand();
   	 emp.setCode(105);
      emp.setName("vikas");
      emp.setCity("pune");
		employeeDao.getEmployeebyId(10);
		Mockito.verify(employeeDao).getEmployeebyId(anyInt());
	}

}
