/**
 * 
 */
package org.lq.ZOO.service;

import java.util.List;

import org.lq.ZOO.entity.BingLi;

/**
 * @author ������ ����
 *@data 2019��7��3��
*@project_nameZOO
 */
public interface AnimalCaseInformationService {
	
	
	List<BingLi> findAll();
	List<BingLi> getId(int id);
	  int addBingliInformation(BingLi bingLi);
}
