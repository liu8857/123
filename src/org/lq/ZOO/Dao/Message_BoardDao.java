package org.lq.ZOO.Dao;
/**
 * @author���
 * @2019��6��28��
 * @Message_BoardDao.java
 * @ZOO
 */
/**
 * @author ���
 * 2019��6��28��
 */

import java.util.List;

import org.lq.ZOO.entity.Message_Board;

public interface Message_BoardDao {

	//����ȫ������
	List<Message_Board> findAll();
	//�������
	int addMessage(Message_Board message_Board);
	
}
