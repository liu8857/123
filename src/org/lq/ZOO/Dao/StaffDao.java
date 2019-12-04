package org.lq.ZOO.Dao;

import java.util.List;

import org.lq.ZOO.entity.Staff;



/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��12������11:57:37
*/
public interface StaffDao {

	//��ѯȫ��
	List<Staff> findAll();
	
	//����id��ѯ
	Staff getStaffByID(int id);
	
	//��������ƴ��ģ����ѯ
	List<Staff> getStaffByValue(String value);
	
	//������ְ״̬��ѯ
	List<Staff> getStaffByCondition(int condition);
	
	//���
	int addStaff(Staff staff);
	
	//�޸�
	int updateStaff(Staff staff);
	
	int updateStaffByIdCard(Staff staff);
	
}
