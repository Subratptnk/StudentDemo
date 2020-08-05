package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	
	  @RequestMapping("/")
	  public String details()
	  {
		  
		  return "submit";
		  
	  }
	  

	@RequestMapping("/save")
	public String studentDetail(Student student)
	{
		repo.save(student);
		return "submit";
	}
	
	@RequestMapping("/getdetails")
	public String showDetails()
	{
		return "view";
	}
	
	
	
	
	
//	// Me----> Server
	@GetMapping("submit")
	public String student()
	{
		return "submit";
	}


	/*
	 * 										SERVLET PART
	 *
	 * 	************************************************************************************************
	//Server---->Me
	@PostMapping("/details")
	public String view(@RequestParam("sid") int sid,
			@RequestParam("sname") String sname, 
			@RequestParam("email") String email , ModelMap modelMap  ) 
	{
		modelMap.put("sid", sid);
		modelMap.put("sname", sname);
		modelMap.put("email", email);
		
		return "view";  
		
	}
	*********************************************************************************************************
	*/
	
	
	//*********************************************************************************************************
										   //	MVC
	
	//*********************************************************************************************************
	/*
	//to retrive
	  @PostMapping("/getdetails")
	  public ModelAndView viewDetails(@RequestParam int  sid) 
	  { 
		  ModelAndView mv =new ModelAndView("retrive");
		  Student stud = repo.findById(sid).orElse(null);
		  mv.addObject(stud);
		  return mv; 
	  }
	*/
	//*******************************************************************************************************

	  
	  
	  //****************************************************************************************

	  @RequestMapping("/student")
	  @ResponseBody
	  public List<Student> getStudent()
	  {
		  return repo.findAll();
	  }
	  
	  @RequestMapping("/student/{sid}")
	  @ResponseBody
	  public Optional<Student> getStudentbyId(@PathVariable("sid") int sid)
	  {
		return repo.findById(sid);
		
		  
	  }
	  
		@PostMapping("/students")
		public Student getCustomer3(@RequestBody Student stud)
		{
			repo.save(stud);
			return stud;
		}
		
	
	  
	  
	  
	  
	  
	  

}
