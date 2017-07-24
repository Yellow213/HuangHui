package com.lnsf.text;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.lnsf.model.Customer;
import com.lnsf.model.Order;

/**
* @author �ƻ� 
* @version ����ʱ�䣺2017��7��24�� ����9:30:12
* @introduction   �����࣬����JPA
*/
public class TestJPA {
   
	
	@Test
	public void testEmployee() {
		
	}
	
	@Test
	public void test() {
		 try{
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpa") ;
		//-------------------------------2017��7��24������------------
	//	 Map<String,String> persistenceMap=new HashMap<String,String>();
	//	 persistenceMap.put("hibernate.show_sql", "false");
		 //entityManager�������ַ�����1��ֱ�Ӵ�persistence.xml�ļ��ж�ȡ����
		 //2.��map�����ɣ����԰����ַ������һ��ʹ��
		 
		//------------------------����෴�ǻ���ô����-----------
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 entityTransaction.begin();//��������
		 Customer custormer=new Customer();
		 custormer.setCname("����");
		// custormer.setcNo(1001);  //�Զ�����
		 custormer.setBirethday(new Date());
		 
		// Customer custormer2=new Customer();
		// custormer2.setCname("��ΰ��");
		// custormer.setcNo(1002);  //�Զ�����
		// custormer2.setBirethday(new Date());
		 
		// Order order=new Order();
		// order.setCreateTime(new Date());
		// order.setMoney(1000);
//		 entityManager.persist(order); 
		 //�־û���Ĳ���
		 entityManager.persist(custormer);
	//	 entityManager.persist(custormer2);
	
		 //�ύ����
		 entityTransaction.commit();
		 entityManager.close();
		 entityManagerFactory.close();
		 }
		 catch(Exception e){
			 e.printStackTrace();
			
		 }
	
	}
}