package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Staff;

/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��13������11:25:11
*/
public interface StaffService {
	//��ѯȫ��
		List<Staff> findAll();
		
		//����id��ѯ
		Staff getStaffByID(int id);
		
		//��������ƴ��ģ����ѯ
		List<Staff> getStaffByValue(String value);
		
		//������ְ״̬��ѯ
		List<Staff> getStaffByCondition(int condition);
		
		//���
		boolean addStaff(Staff staff);
		
		//�޸�
		boolean updateStaff(Staff staff);
		//��������
		boolean updateStaffByIdCard(Staff staff);
}
