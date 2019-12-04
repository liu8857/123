package org.lq.ZOO.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.lq.ZOO.communal.AnimalStatusType;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;


/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��11������10:05:00
*/
//����
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Animal {
	private int ANIMAIL_EXIST = 1;
	private int ANIMAL_DIE = 2;
	int id;
	//��Ŀ
	int subject;
	
	//�ǳ�
	String name;
	//�Ա�
	String gender;
	//��������
	Date birthday;
	//����
	int age;
	//״̬
	int condition;
	//ͼƬ
	InputStream icon;
	//��԰ʱ��
	Date joinDate;
	//��ע
	String comment;
	//����״̬
	AnimalStatusType animalStatus;
	
//	public StatusType getStatusType() {
//		switch (status) {
//		case 1:
//			statusType = StatusType.STATUS_TYPE_ONJOB;
//			break;
//		case 2:
//			statusType = StatusType.STATUS_TYPE_LEAVE;
//			break;
//		case 3:
//			statusType = StatusType.STATUS_TYPE_FALSE;
//			break;
//		default:
//			break;
//		}
//		return statusType;
//	}
	public AnimalStatusType getAnimalStatus() {
		switch(condition) {
		case 1:
			animalStatus = AnimalStatusType.ANIMAIL_EXIST;
			break;
		case 2:
			animalStatus = AnimalStatusType.ANIMAL_DIE;
			break;
			
		}
		return animalStatus;
	}
	
	
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
}












