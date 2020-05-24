package com.cg.health.exception;
/*****************************************************************************************************
 * @author        Nishi Yadav
 * Description    It is a TestException which handles the exception 
 *                which occurs in test in the database. 
 *               
 *                
 * Version        1.0
 * Created Date   12-MAY-2020 
 *
 ****************************************************************************************************/
public class TestsException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	/************************************************************************************************************************
	 * Method        TestException
	 * Description   It is the custom exception which displays the particular message
	 *                 
	 *                 
	 *                   
	 * Created By     Nishi Yadav
	 * Created Date   12-MAY-2020                  
	 ************************************************************************************************************************/
	public TestsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
