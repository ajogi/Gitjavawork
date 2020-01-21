
import org.hibernate.HibernateException;
import org.hibernate.Session;
 
public class EmployeeDAO {
    
    
    public Employee get(Integer empId){
        
        Session session =null;
        Employee employee=null;
        
        try{
            session = HibernateUtil.getsession();
            employee = (Employee)session.get(Employee.class, empId);
            
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            HibernateUtil.closeSession(session);
        }
                
        return employee;
    }
    
    
    public void insert(Employee employee){
        
        Session session =null;
        
        try {
            
            session= HibernateUtil.getsession();
            session.getTransaction().begin();
            session.save(employee);
            session.getTransaction().commit();
            
        }catch (HibernateException e){
            e.printStackTrace();
        }
        finally{
            HibernateUtil.closeSession(session);
        }
    }
    
    
  public void update(Employee employee){
        
        Session session =null;
        
        try {            
            session= HibernateUtil.getsession();
            session.getTransaction().begin();
            session.update(employee);
            session.getTransaction().commit();
            
        }catch (HibernateException e){
            e.printStackTrace();
        }
        finally{
            HibernateUtil.closeSession(session);
        }
    }
  
  
  public void delete(Integer empId){
        
        Session session =null;
        
        try {
            
            session= HibernateUtil.getsession();
            session.getTransaction().begin();
            Employee emp = (Employee)session.get(Employee.class, empId);
            session.delete(emp);
            session.getTransaction().commit();
            
        }catch (HibernateException e){
            e.printStackTrace();
        }
        finally{
            HibernateUtil.closeSession(session);
        }
    }
}