import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import oracle.net.aso.s;

@Controller
@Repository
@Transactional

public class EmpController {


	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping("/date")
	String dateTest(@ModelAttribute EmployeeVO vo) {

		System.out.println("id is"+vo.getDoj());
		System.out.println(vo.getEmpId());


		return "FindEmp";

	}


	@RequestMapping("/viewAll")
	String login(Model m) {

		Query q=sessionFactory.openSession().createQuery("from EmployeeVO");//where empId=:Idno and mobile=:mob");

		List<EmployeeVO> evol= (List<EmployeeVO>) q.list();
		System.out.println(evol.size());
		m.addAttribute("key", evol);
		return "DispAll";

	}
	@RequestMapping("/login")
	String login(@RequestParam("empID") int id,@RequestParam("mobile") long mobile,Model m) {

		Query q=sessionFactory.openSession().createQuery("from EmployeeVO where empId=:Idno and mobile=:mob");
		q.setParameter("Idno", id);
		q.setParameter("mob", mobile);
		EmployeeVO evo= (EmployeeVO) q.uniqueResult();



		if(evo==null) {
			m.addAttribute("key", "Please enter valid empId or mobile ");
			return "Login";
		}
		else{
			m.addAttribute("key", evo);
			return "Home";

		}


	}






	@RequestMapping("/find")
	String search(@RequestParam("empID") int id, Model m) {


		EmployeeVO evo=	(EmployeeVO) sessionFactory.openSession().get(EmployeeVO.class,id);
		if(evo==null) {
			m.addAttribute("key", "Please enter valid id");
			return "FindEmp";
		}
		else{
			m.addAttribute("key", evo);
			return "Disp";

		}
	}

	@Transactional
	@RequestMapping("/delete")
	String delete(@RequestParam("empID") int id, Model m) {
		Session session=sessionFactory.openSession();
		Transaction transactional=session.beginTransaction();

		EmployeeVO evo=	(EmployeeVO) session.get(EmployeeVO.class,id);
		if(evo==null) {
			m.addAttribute("key", "Please enter valid id");
			return "Delete";
		}
		else{
			evo.setEmpId(id);
			session.delete(evo);
			transactional.commit();
			m.addAttribute("deleteKey", id+"Deleted");
			return "Home";

		}

	}

	@RequestMapping(value="/SignUp",method = RequestMethod.POST)

	ModelAndView register(@ModelAttribute EmployeeVO emp) {
		   
	        Session session = sessionFactory.openSession();  
	        Transaction t = session.beginTransaction(); 
		int no=(int)sessionFactory.openSession().save(emp);

t.commit();

		return new ModelAndView("Login");//
	}

}
