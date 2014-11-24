package com.wb.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wb.bean.Person;
import com.wb.service.PersonService;

public class PersonAction extends ActionSupport {

	private PersonService personService;
	//private Person person;
	private String page;//页数
	private String rows;//记录数
   



	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public String getRows() {
		return rows;
	}


	public void setRows(String rows) {
		this.rows = rows;
	}


	public PersonService getPersonService() {
		return personService;
	}


	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}


	/*public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public Person getModel() {
		// TODO Auto-generated method stub
		return person;
	}
	public String add(){
		personService.save(person);
		return "add";
	}
	public String save(){
		
		return "save";
	}*/
	
	 public String getAll() throws Exception {
	        LOG.info("查询出所有学生信息");     
	         
	        List list = personService.getList(page, rows);
	        this.toBeJson(list,personService.getTotal());
	 
	        return null;
	    }
	     
	    //转化为Json格式
	       public void toBeJson(List list,int total) throws Exception{
	            HttpServletResponse response = ServletActionContext.getResponse();
	            HttpServletRequest request = ServletActionContext.getRequest();
	             
	            JSONObject jobj = new JSONObject();//new一个JSON
	            jobj.accumulate("total",total );//total代表一共有多少数据
	            jobj.accumulate("rows", list);//row是代表显示的页的数据
	 
	            response.setCharacterEncoding("utf-8");//指定为utf-8
	            response.getWriter().write(jobj.toString());//转化为JSOn格式
	             
	            LOG.info(jobj.toString());
	       }
}
