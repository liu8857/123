/**
 * 
 */
package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.Breeder;

/**
 * @author ������ ����
 *@data 2019��7��4��
*@project_nameZOO
 */
public interface BreederService {

	List<Breeder> findAll();
	List<Breeder> getanimalById(int id);

	boolean addBreeder(Breeder breeder);
}
