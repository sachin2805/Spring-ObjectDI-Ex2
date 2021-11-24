package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try{
			ApplicationContext c= 
					new ClassPathXmlApplicationContext("InnerBean.xml");
			Employee emp=(Employee) c.getBean("e1");
			emp.display();
			Employee emp1=(Employee) c.getBean("e2");
			emp1.display();
			Employee emp2=(Employee) c.getBean("e3");
			emp2.display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

/*OUTPUT :
Name : Meenakshi
Designation : Design Operator
Joining Date : 26/6/2021
Salary : 65600.0
Name : Nayna
Designation : Softwear Engg
Joining Date : 28/7/2021
Salary : 70550.0
Name : Akash Shingade
Designation : CS Operator
Joining Date : 26/6/2021
Salary : 60000.0
*/