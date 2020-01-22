package com.hcl.student;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hcl.util.HibernateUtil;
public class Main {
public static void main(String[] args) {
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction transaction = null;
try {
transaction = session.beginTransaction();
Set<Phone> phoneNumbers = new HashSet<Phone>();
phoneNumbers.add(new Phone("house","9000238228"));
phoneNumbers.add(new Phone("mobile","9951999956"));
Student student = new Student("jogi", phoneNumbers);
session.save(student);
transaction.commit();
} catch (HibernateException e) {
transaction.rollback();
e.printStackTrace();
} finally {
session.close();
}
}
}