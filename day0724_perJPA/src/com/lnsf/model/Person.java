package com.lnsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
* @author 黄卉 
* @version 创建时间：2017年7月24日 上午11:29:24
* @introduction
*/
@Entity
public class Person {

	@TableGenerator(
			name="Id_generator",
			table="Id_generator",
			allocationSize=2,//不写的话默认是oracle的序列增加，sequence，50，在可控制跳跃、1 2 4 8，成倍增加。用一个表专门放主键的。
			//这个表就是用来放主键的，关键字名称，值
			initialValue=1,//主键自增规则
			pkColumnName="PK_Name",
			pkColumnValue="person_id",//创建一个表，可以把所有主键放到这里来计算
			valueColumnName="pk_value"
			)
	
	//没有规律，所有的表直接生成。
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Id_generator")//没有什么复杂的，不是有点jpa id 生成策略
	@Id
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
