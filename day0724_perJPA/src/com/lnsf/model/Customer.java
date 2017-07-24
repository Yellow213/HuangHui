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
* @author �ƻ� 
* @version ����ʱ�䣺2017��7��24�� ����9:26:12
* @introduction  jpa,ע�ⷽʽ
*/
@Entity
@Table(name="customer")//Ҳ�����Լ������֣�ע���Լ��ı���
public class Customer {

	
	@TableGenerator(
			name="Id_generator",
			table="Id_generator",
			allocationSize=2,//��д�Ļ�Ĭ����oracle���������ӣ�sequence��50���ڿɿ�����Ծ��1 2 4 8���ɱ����ӡ���һ����ר�ŷ������ġ�
			//�������������������ģ��ؼ������ƣ�ֵ
			initialValue=1,//������������
			pkColumnName="PK_Name",
			pkColumnValue="customer_id",//����һ�������԰����������ŵ�����������
			valueColumnName="pk_value"
			)
	
	//��j2ee��ʵ��
//	@GeneratedValue(strategy=GenerationType.AUTO)
	//�Զ���������//GenerationType.Sequence,����û�й��ɵ�
	
	@GeneratedValue(strategy=GenerationType.TABLE,generator="Id_generator")//û��ʲô���ӵģ������е�jpa id ���ɲ���
	@Id//�����������κ�ʵ������������һ��������Ҳ������getter����֮ǰ��
	private Integer cNo;
	@Column(length=30)
    private String cname;
	@Temporal(TemporalType.DATE)
    private Date birethday;
	@Column(length=11)
    private String phone;
    private String mem;//��ע
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
