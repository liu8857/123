/**
 * 
 */
package org.lq.ZOO.communal;

/**
 * @author ������ ����
 *@data 2019��6��13��
*@project_nameZOO
 */
public enum PositionType {

	ZOOKEEPER_TYPE_ID(1,"����԰԰��"),
	
	SECURITYSTAFF_TYPE_ID(2,"����");
	
	
	private int value;
	private String title;
	
	/**
	 * 
	 */
	private PositionType(int value,String title) {
		this.value = value;
		this.title = title;
	}
}
