package org.lq.ZOO.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.lq.ZOO.Dao.LoginDao;
import org.lq.ZOO.Dao.StaffDao;
import org.lq.ZOO.entity.Staff;

public class LoginDaoImpl implements LoginDao{
	private StaffDao staffDao = new StaffDaoImpl(); 
	List<Staff> list = staffDao.findAll();
	@Override
	public int isLoginUser(String value,String pwd) {
		int flag = 0;
		
		for (Staff s: list) {
			if (s !=null) {
				if (s.getName().equals(value) && s.getPassword().equals(pwd) && s.getComment().equals("����Ա") ) {
					flag = 1;
				}else if(s.getName().equals(value) && s.getPassword().equals(pwd) && s.getComment().equals("ҽ��")) {
					flag = 2;
				}else {
					flag = 3;
				}
			}
		}
		return flag;
	}

}
