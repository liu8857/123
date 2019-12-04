package org.lq.ZOO.entity;

import java.util.Date;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * @author���
 * @2019��6��28��
 * @Message_Board.java
 * @ZOO
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Message_Board {

	int id;
	//��ϵ��ʽ
	String contact;
	//��������
	String textContent;
	//����ʱ��
	Date messageTime;
}
