package com.marticus.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marticus.model.User;
import com.marticus.utility.HibernateUtil;
import java.util.List;



@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		System.out.println("Home Page Requested, locale = " + locale);
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//		String formattedDate = dateFormat.format(date);
//
//		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		
		System.out.println("User Page Requested");
		
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userId", user.getId());
		model.addAttribute("userEmail",user.getUserEmail());
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.shutdown();

		return "user";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@Validated User user, Model model) {
		
		System.out.println("Search Page Requested");
		return "search";
	}
	
	@RequestMapping(value = "/getSearchResults", method = RequestMethod.POST)
	public String getUser(@Validated User user, Model model) {
		
		System.out.println("getSearchResult  Page Requested");
		
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		System.out.println("sessionFactory inside getSearchResults "+session);
		session.beginTransaction();
		 User user1 = (User) session.load(User.class, new Integer(user.getId()));
		 model.addAttribute("userName", user1.getUserName());
			model.addAttribute("userId", user1.getId());
			model.addAttribute("userEmail",user1.getUserEmail());
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.shutdown();
		 
		return "getSearchResults";
	}
	
	@RequestMapping(value = "/getUsersList", method = RequestMethod.GET)
	public String getUserList(@Validated User user, Model model) {
		
		System.out.println("getUserList  Page Requested");
		
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		session.beginTransaction();
		List Users =session.createQuery("From User").list();
		ArrayList <User> uList = new ArrayList<User>();
		for (Iterator iterator2 = Users.iterator(); iterator2.hasNext();){
            User u = (User) iterator2.next(); 
            uList.add(u);
            System.out.println("User: " + u.getId()); 
         }
		model.addAttribute("uList",uList );
<<<<<<< HEAD
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.shutdown();
		 
		return "userList";
=======
//		List<EmployeeVO> empList=employeeManager.getAllEmployees();
//		model.addAttribute("employees",empList );
//		<c:forEach items="${uList}" var="user">
//		<td>${user.name}</td>
//
//		
//		/c:forEach>

		
//		model.addAttribute("userName", user.getUserName());
//		model.addAttribute("userAge", user.getUserAge());
		return "displist";
>>>>>>> 77ea3eb1f3f91749d80a4052cd20b40d2567cc01
	}
	
	@RequestMapping(value = "/updateList/{id}", method = RequestMethod.POST)
	public String updateScreen(@PathVariable("id")String id, Model model) {
		
		System.out.println("getSearchResult  Page Requested");
		
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setId(Integer.parseInt(id));
		session.load(user,new Integer(user.getId()));
		 model.addAttribute("userName", user.getUserName());
			model.addAttribute("userId", user.getId());
			model.addAttribute("userEmail",user.getUserEmail());
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.shutdown();
		 
		return "updateList";
	}
	
	
	//used to update and return to userList 
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id")String id, Model model) {
		
		System.out.println("getSearchResult  Page Requested");
		
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		System.out.println("Inside Print "+id);
		User user=new User();
		user.setId(Integer.parseInt(id));
		session.load(user,id);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.shutdown();
		 
		return "forward:/getUsersList";
		
	}
	
	
	
	
	
	
	
}
