/**
 * 
 */
package org.lq.ZOO.Dao;

import java.util.List;


import org.lq.ZOO.entity.Breeder;

/**
 * @author ������ ����
 *@data 2019��7��4��
*@project_nameZOO
 */
public interface BreederDao {

	List<Breeder> findAll();
	List<Breeder> getanimalById(int id);

	int addBreeder(Breeder breeder);

}
