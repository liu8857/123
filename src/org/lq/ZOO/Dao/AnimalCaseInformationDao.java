/**
 * 
 */
package org.lq.ZOO.Dao;

import java.util.List;

import org.lq.ZOO.entity.BingLi;

/**
 * @author ������ ����
 *@data 2019��7��3��
*@project_nameZOO
 */
public interface AnimalCaseInformationDao {
	
//	BingLi getId(int id);
	List<BingLi> findAll();
	List<BingLi> getId(int id);
    int addBingliInformation(BingLi bingLi);

}
