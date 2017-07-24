package com.lnsf.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
* @author 黄卉 
* @version 创建时间：2017年7月24日 上午9:26:12
* @introduction  jpa,注解方式
*/
@Entity
@Table(name="customer")//也可以自己改名字，注解自己的表明
public class Customer {

	
	@TableGenerator(
			name="Id_generator",
			table="Id_generator",
			allocationSize=2,//不写的话默认是oracle的序列增加，sequence，50，在可控制跳跃、1 2 4 8，成倍增加。用一个表专门放主键的。
			//这个表就是用来放主键的，关键字名称，值
			initialValue=1,//主键自增规则
			pkColumnName="PK_Name",
			pkColumnValue="customer_id",//创建一个表，可以把所有主键放到这里来计算
			valueColumnName="pk_value"
			)
	
	//由j2ee来实现
//	@GeneratedValue(strategy=GenerationType.AUTO)
	//自动生成主键//GenerationType.Sequence,生成没有规律的
	
	@GeneratedValue(strategy=GenerationType.TABLE,generator="Id_generator")//没有什么复杂的，不是有点jpa id 生成策略
	@Id//声明主键，任何实体类对象必须有一个主键，也可以是getter方法之前。
	private Integer cNo;
	@Column(length=30)
    private String cname;
	@Temporal(TemporalType.DATE)
    private Date birethday;
	@Column(length=11)
    private String phone;
    private String mem;//备注
	public Integer getcNo() {
		return cNo;
	}
	public void setcNo(Integer cNo) {
		this.cNo = cNo;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getBirethday() {
		return birethday;
	}
	public void setBirethday(Date birethday) {
		this.birethday = birethday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMem() {
		return mem;
	}
	public void setMem(String mem) {
		this.mem = mem;
	}
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", cname=" + cname + ", birethday=" + birethday + ", phone=" + phone + ", mem="
				+ mem + "]";
	}
    
}
