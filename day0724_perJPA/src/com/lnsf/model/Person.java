package com.lnsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 黄卉 
* @version 创建时间：2017年7月24日 上午11:29:24
* @introduction
*/
//@Entity
public class Person {
	//没有规律，所有的表直接生成。
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Id_generator")//没有什么复杂的，不是有点jpa id 生成策略
	//@Id
	private Integer personNo;
	private String personName;
	public Integer getPersonNo() {
		return personNo;
	}
	public void setPersonNo(Integer personNo) {
		this.personNo = personNo;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personNo=" + personNo + ", personName=" + personName + "]";
	}
	
}
