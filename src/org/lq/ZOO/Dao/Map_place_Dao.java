package org.lq.ZOO.Dao;
/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��13������11:19:53
*/

import org.lq.ZOO.entity.Map_place;

public interface Map_place_Dao {

	//ͨ��Id��ѯ��ͼ��Ϣ
		Map_place getMap_palceByID(int id);
		
	//�޸ĵ�ͼ��Ϣ
		int update_place(int id,String path);
		
		
}
