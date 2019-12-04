package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Animal;

/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��13������11:23:44
*/
public interface animalService {
	//��ѯȫ��
		List<Animal> findAll();
		
		Animal getAnimalById(int id);
		List<Animal> getAnimalByName(String name);
		List<Animal> getAnimalBySubjectAndCondition(int subject,int condition);
		
		//���������ѯ
		List<Animal> getAnimalBysubject(int subject);
		
		//���ݿ�Ŀ��ѯ
//		List<Animal> getAnimalByVariety(int variety);
		
		//����״̬��ѯ
		List<Animal> getAnimalByCondition(int condition);
		
		//�޸�
		boolean updateAnimal(Animal animal);
		
		//���
		boolean addAnimal(Animal animal);
}
