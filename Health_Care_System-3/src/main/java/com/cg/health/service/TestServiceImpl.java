package com.cg.health.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.health.dao.TestDao;
import com.cg.health.entity.Test;
/************************************************************************************************************************
 * @author         Nishi Yadav
 * Description     It is a ServiceImpl that implements the methods of adding new tests, delete tests and updating tests 
 *                 from Service Interface
 *                 
 *                   
 * Version         1.0
 * Created Date    07-MAY-2020                  
 ************************************************************************************************************************/

@Transactional
@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private TestDao testDao;
	/************************************************************************************************************************
	 * Method        addTest
	 * Description   To implement the method to add the test 
	 *                
	 *                 
	 *                   
	 * Created By    Nishi Yadav
	 * Created Date  07-MAY-2020                  
	 ************************************************************************************************************************/

	@Override
	public Test addTest(Test test) {
		// TODO Auto-generated method stub
		return testDao.save(test);
	}
	/************************************************************************************************************************
	 * Method        showallTest
	 * Description   To implement the method to show all the tests 
	 *                
	 *                 
	 *                   
	 * Created By    Nishi Yadav
	 * Created Date  07-MAY-2020                  
	 ************************************************************************************************************************/
	@Override
	public List<Test> showalltest() {
		// TODO Auto-generated method stub
		return this.testDao.findAll();
	}
	/************************************************************************************************************************
	 * Method        deletetest
	 * Description   To implement the method to delete the test 
	 *                
	 *                 
	 *                   
	 * Created By    Nishi Yadav
	 * Created Date  07-MAY-2020                  
	 ************************************************************************************************************************/
	@Override
	public void deletetest(int testId) {
		testDao.deleteById(testId);
	}


}
