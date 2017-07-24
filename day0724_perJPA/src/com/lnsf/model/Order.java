package com.lnsf.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
* @author 黄卉 
* @version 创建时间：2017年7月24日 下午1:49:30
* @introduction 订单表
*/
//@Entity
//@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Basic
	@Column(length=8,precision=2)//长度，精度
	private float money;
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", money=" + money + ", createTime=" + createTime + "]";
	}
	
}
