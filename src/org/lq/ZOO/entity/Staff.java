package org.lq.ZOO.entity;
/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��12������10:54:22
*/

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.lq.ZOO.communal.StaffConditionType;
import org.lq.ZOO.communal.StaffProfessionType;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Staff {
	int id;
	//����
	String name;
	//ƴ��
	String pinyin;
	//����
	Date birthday;
	//����
	int age;
	//�Ա�
	String gender;
	//��Ƭ
	InputStream icon;
	//�绰
	String phone;
	//����
	String password;
	//ְλ
	int professtion;
	//״̬
	int condition;
	//���֤��
	String idCard;
	//��ְʱ��
	Date entryDate;
	//��ע
	String comment;
	//ְλö��
	StaffProfessionType staffProfession;
	//״̬ö��
	StaffConditionType staffCondition;
	
	public byte[] getIconBytes() {
		byte[] bytes = null;
		try {
			bytes = new byte[icon.available()];
			icon.read(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}
	
	public StaffProfessionType getStaffProfession() {
		switch(professtion) {
		case 1:
			staffProfession = StaffProfessionType.STAFF_DOCTOR;
			break;
		case 2:
			staffProfession = StaffProfessionType.STAFF_FEED;
			break;
		}
		return staffProfession;
	}
	
	public StaffConditionType getStaffCondition() {
		switch (condition) {
		case 1:
			staffCondition = StaffConditionType.STAFF_AT;
			break;
		case 2:
			staffCondition = StaffConditionType.STAFF_LEAVE;
			break;
		}
		return staffCondition;
	}
	
	
	
	
	
	
	
	
	
	
	
}
