package com.cg.health.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
/*****************************************************************************************************
 * @author        Nishi Yadav
 * Description    It is a Entity calss that 
 *                specifies that the class  is mapped to a database
 *                table with suitable columns.
 * Version        1.0
 * Created Date   06-MAY-2020 
 *
 ****************************************************************************************************/
@Entity
@Table(name = "Test_table")
public class Test {
	@Id
	@Column(name = "test_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testId;

	@Column(name = "testName")
	private String testName;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public Test(int testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
		
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tests [testId=" + testId + ", testName=" + testName + "]";
	}
}
