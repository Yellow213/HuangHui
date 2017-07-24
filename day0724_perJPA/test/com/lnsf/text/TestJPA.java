package com.lnsf.text;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.lnsf.model.Customer;
import com.lnsf.model.Order;
import com.lnsf.model.Person;

/**
* @author 黄卉 
* @version 创建时间：2017年7月24日 上午9:30:12
* @introduction   测试类，测试JPA
*/
public class TestJPA {
   
	
	@Test
	public void testCustomer() {
		//1.数据库存在，项目少的话可以用的上jpa项目
		try{
			 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpa") ;
			//-------------------------------2017年7月24日下午------------
		//	 Map<String,String> persistenceMap=new HashMap<String,String>();
		//	 persistenceMap.put("hibernate.show_sql", "false");
			 //entityManager产生二种方法：1，直接从persistence.xml文件中读取过来
			 //2.把map中生成，可以把两种方法结合一起使用	 
			//------------------------如果相反是会怎么样？-----------
			 EntityManager entityManager=entityManagerFactory.createEntityManager();
			 EntityTransaction entityTransaction=entityManager.getTransaction();
			 entityTransaction.begin();//开启事务
			 Customer custormer=new Customer();
			 custormer.setCname("lisi");
			// custormer.setcNo(1001);  //自动创建
			 custormer.setBirethday(new Date());
			 
			 //添加order表
			 Order order=new Order();
			 order.setCreateTime(new Date());
			 order.setMoney(1000);
			 
			 Person person=new Person();
			 person.setPersonName("personzhangsan");
			 
			
			 //持久化层的操作
			 entityManager.persist(custormer);
			 entityManager.persist(order); 
			 entityManager.persist(person);	 
			 
			 //提交事务
			 entityTransaction.commit();
			 entityManager.close();
			 entityManagerFactory.close();
			 }
			 catch(Exception e){
				 e.printStackTrace();
			 }
	}
	
	@Test
	public void test() {
		 try{
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpa") ;
		//-------------------------------2017年7月24日下午------------
	//	 Map<String,String> persistenceMap=new HashMap<String,String>();
	//	 persistenceMap.put("hibernate.show_sql", "false");
		 //entityManager产生二种方法：1，直接从persistence.xml文件中读取过来
		 //2.把map中生成，可以把两种方法结合一起使用
		 
		//------------------------如果相反是会怎么样？-----------
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 entityTransaction.begin();//开启事务
		 Customer custormer=new Customer();
		 custormer.setCname("李四1");
		// custormer.setcNo(1001);  //自动创建
		 custormer.setBirethday(new Date());
		 
		Customer custormer2=new Customer();
		 custormer2.setCname("劳伟玲");
		// custormer.setcNo(1002);  //自动创建
		 custormer2.setBirethday(new Date());
		 
		 //添加order表
		 Order order=new Order();
		 order.setCreateTime(new Date());
		 order.setMoney(1000);
		 entityManager.persist(order); 
		 //持久化层的操作
		 entityManager.persist(custormer);
		 entityManager.persist(custormer2);
	
		 //提交事务
		 entityTransaction.commit();
		 entityManager.close();
		 entityManagerFactory.close();
		 }
		 catch(Exception e){
			 e.printStackTrace();
			
		 }
	
	}
}
