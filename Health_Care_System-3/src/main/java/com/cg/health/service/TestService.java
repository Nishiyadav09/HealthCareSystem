package com.cg.health.service;

import java.util.List;
/************************************************************************************************************************
 * @author         Nishi Yadav
 * Description     It is a Service interface that provides the methods for adding new tests, delete tests and updating tests 
 *                 and further implemented by service implementation.
 *                 
 *                   
 * Version         1.0
 * Created Date    07-MAY-2020                  
 ************************************************************************************************************************/

import com.cg.health.entity.Test;

public interface TestService {
	Test addTest(Test tests);

	List<Test> showalltest();
	
	void deletetest(int id);
}
