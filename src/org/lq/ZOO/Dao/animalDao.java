package org.lq.ZOO.Dao;
/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��12������10:58:41
*/

import java.util.List;

import org.lq.ZOO.entity.Animal;



public interface animalDao {

	//��ѯȫ��
	List<Animal> findAll();
	Animal getAnimalById(int id);
	List<Animal> getAnimalByName(String name);
	List<Animal> getAnimalBySubjectAndCondition(int variety,int condition);
	
	//���������ѯ
	List<Animal> getAnimalBysubject(int subject);
	
	//���ݿ�Ŀ��ѯ
//	List<Animal> getAnimalByVariety(int variety);
	
	//����״̬��ѯ
	List<Animal> getAnimalByCondition(int condition);
	
	//�޸�
	int updateAnimal(Animal animal);
	
	//���
	int addAnimal(Animal animal);
	
}
