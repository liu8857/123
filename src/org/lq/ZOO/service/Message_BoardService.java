package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Message_Board;

/**
 * @author Administrator
 *
 */
public interface Message_BoardService {
	//�鿴ȫ�����԰�
		List<Message_Board> findAll();
		//�������
		boolean addMessage(Message_Board message_Board);
}
