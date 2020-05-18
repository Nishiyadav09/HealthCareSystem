package com.cg.health.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.health.entity.Test;
import com.cg.health.exception.TestsException;
import com.cg.health.service.TestService;
/************************************************************************************************************************
 * @author         Nishi Yadav
 * Description     It is a Test Controller which implements getmapping, postmapping and deletemapping for retrieve, add or
 *                 delete tests from database
 *                 
 *                 
 *                   
 * Version         1.0
 * Created Date    07-MAY-2020                  
 ************************************************************************************************************************/
@RestController
public class TestController {
	@Autowired
	private TestService testService;
	/************************************************************************************************************************
	 * Method        getAlltest
	 * Description   To view all the tests inserted in the database
	 *                
	 *                 
	 *                   
	 * Created By    Nishi Yadav
	 * Created Date  09-MAY-2020                  
	 ************************************************************************************************************************/
	@GetMapping("/tests")
	public ResponseEntity<List<Test>> getAllTest(){
		return ResponseEntity.ok().body(testService.showalltest());
	}
	/************************************************************************************************************************
	 * Method        addTest
	 * Description   To add the test in the database
	 *                
	 *                 
	 *                   
	 * Created By    Nishi Yadav
	 * Created Date  09-MAY-2020                  
	 ************************************************************************************************************************/
	@PostMapping("/addtest")
	public ResponseEntity<String> addTest(@Valid @RequestBody Test tests, BindingResult bindingResult) throws TestsException
			 {
		String err = "";
		if (bindingResult.hasErrors()) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new TestsException(err);
		}
		try {
			testService.addTest(tests);
			return new ResponseEntity<String>("Test added successfully", HttpStatus.OK);

		} catch (Exception ex) {
			throw new TestsException("Test ID already exists");
		}
	}
	
	
	
	  //@DeleteMapping("/tests/{testId}") 
	  //public void deletetest(@PathVariable int testId) {
		 // testService.deletetest(testId);
	  //}
	  
	/************************************************************************************************************************
	 * Method        deletetest
	 * Description   To delete the test from the database
	 *                
	 *                 
	 *                   
	 * Created By    Nishi Yadav
	 * Created Date  09-MAY-2020                  
	 ************************************************************************************************************************/
	  @DeleteMapping("/tests/{testId}")
	  public ResponseEntity<String>deletetest(@PathVariable int testId) throws TestsException{
		  try {
			  testService.deletetest(testId);
			  return new ResponseEntity<String>("Test deleted",HttpStatus.OK);
		  }
		  catch(Exception ex) {
			  throw new TestsException("Id is not exists");
		  }
	  }
	  
	 
	
	
	
}
