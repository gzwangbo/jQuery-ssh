package com.wb.test;

import com.opensymphony.xwork2.ActionSupport;


public class TestAction extends ActionSupport{
  private TestService testService;
  public String add(){
	  testService.save();
	  return SUCCESS;
  }
public TestService getTestService() {
	return testService;
}
public void setTestService(TestService testService) {
	this.testService = testService;
}
  
	
}
