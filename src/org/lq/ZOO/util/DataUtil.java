package org.lq.ZOO.util;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {

	public static int getAgeByBirth(Date birthday) throws Exception {
		int age = 0;
		Calendar calendar = Calendar.getInstance();
		if (calendar.before(birthday)) {
			throw new IllegalAccessException("��������ȷ�ĳ�������..");
		}
		
		int yearNow = calendar.get(Calendar.YEAR);
		int monthNow = calendar.get(Calendar.MONTH);
		int dayNow = calendar.get(Calendar.DAY_OF_MONTH);
		
		
		calendar.setTime(birthday);
		
		int yearBirthday = calendar.get(Calendar.YEAR);
		int monthBirthday = calendar.get(Calendar.MONTH);
		int dayOfBirthday = calendar.get(Calendar.DAY_OF_MONTH);
		
		age = yearNow-yearBirthday;//����������
		if (monthNow <= monthBirthday) {
			if (monthNow == monthBirthday) {
				if (dayNow < dayOfBirthday) {
					age--;//��ǰ����������֮ǰ,�����һ
				}
			}
		}
		
		return age;
		
	}
}
