package org.lq.ZOO.entity;

import java.io.InputStream;
import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {
	int id;
	//����
	String name;
	//ƴ��
	String pinyin;
	//����
	String age;
	//�Ա�
	String gender;
	//��Ƭ
	InputStream icon;
	//�绰
	String phone;
	//״̬
	int condition;
	//��ְʱ��
	Date entryDate;
	//��ע
	String comment;
}
