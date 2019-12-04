package org.lq.ZOO.entity;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BingLi {
	//�������
	int id;
	//Ա�����
	int staffId;
	//������
	int animalId;
	
	//��ҩ��
	String medicineName;
	//��ҩ��
	String medicineCount;
	//����ʱ��
	Date medicineTime;
	//��ע
	String content;
}
