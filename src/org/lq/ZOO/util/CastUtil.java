package org.lq.ZOO.util;

import lombok.extern.java.Log;

/**
 * ����ת��������
 * @author ����
 * @PROJECT SuperCRM
 * @ʱ�� 2019��5��25��-����3:54:49
 *
 */
public class CastUtil {

	/**
	 * תΪString���ͣ��ṩĬ��ֵ��
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String castString(Object obj,String defaultValue) {
		return obj!=null ? String.valueOf(obj) : defaultValue;
	}
	/**
	 * תΪString����
	 * @param obj
	 * @return
	 */
	public static String castString(Object obj) {
		return CastUtil.castString(obj, "");
	}
	/**
	 * תΪdouble����(�ṩĬ��ֵ)
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static double castDouble(Object obj,double defaultValue) {
		double doubleValue = defaultValue;

		if(obj!=null) {
			String strValue = castString(obj);
			if(!strValue.trim().isEmpty()) {
				try {
					doubleValue = Double.parseDouble(strValue);
				} catch (NumberFormatException e) {
					//					e.printStackTrace();
					doubleValue = defaultValue;
				}
			}
		}
		return doubleValue;
	}
	/**
	 * תΪdouble����
	 * @param obj
	 * @return
	 */
	public static double castDouble(Object obj) {
		return CastUtil.castDouble(obj, 0);
	}
	
	public static int castInt(Object obj,int defaultValue) {

		int intValue = defaultValue;

		if(obj!=null) {
			String strValue = castString(obj);
			if(strValue.indexOf(".")!=-1) {
				strValue = strValue.substring(0,strValue.indexOf("."));
			}
			if(!strValue.trim().isEmpty()) {
				try {
					intValue = Integer.parseInt(strValue);
				} catch (NumberFormatException e) {
					intValue = defaultValue;
				}
			}
		}

		return intValue;
	}
	/**
	 * ת����int����
	 * @param obj
	 * @return
	 */
	public static int castInt(Object obj) {
		return CastUtil.castInt(obj, 0);
	}
	

}
