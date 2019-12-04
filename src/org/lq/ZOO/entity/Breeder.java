package org.lq.ZOO.entity;



import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Breeder {
	int id;
	String name;
	//���������
	int animalId;
	//ιʳ��
	String breederCount;
	//ιʳ��
	String breederName;
	//ιʳʱ��
	Date breederTime;
	//��ע
	String content;
}
