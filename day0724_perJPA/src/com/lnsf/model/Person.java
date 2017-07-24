package com.lnsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
* @author �ƻ� 
* @version ����ʱ�䣺2017��7��24�� ����11:29:24
* @introduction
*/
@Entity
public class Person {

	@TableGenerator(
			name="Id_generator",
			table="Id_generator",
			allocationSize=2,//��д�Ļ�Ĭ����oracle���������ӣ�sequence��50���ڿɿ�����Ծ��1 2 4 8���ɱ����ӡ���һ����ר�ŷ������ġ�
			//�������������������ģ��ؼ������ƣ�ֵ
			initialValue=1,//������������
			pkColumnName="PK_Name",
			pkColumnValue="person_id",//����һ�������԰����������ŵ�����������
			valueColumnName="pk_value"
			)
	
	//û�й��ɣ����еı�ֱ�����ɡ�
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Id_generator")//û��ʲô���ӵģ������е�jpa id ���ɲ���
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
