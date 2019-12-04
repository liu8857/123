package org.lq.ZOO.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.swing.ImageIcon;

import org.lq.ZOO.entity.Animal.AnimalBuilder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
*@author ����
*@���� ������
*@version����ʱ��    2019��6��13������11:17:26
*/
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Map_place {
	int id;
	//԰��ͼƬ
	InputStream icon;
	//԰������
	String name;
	//԰�ֽ���
	String introduction;
	
	public byte[] getIconBytes() {
		byte[] bytes = null;
		try {
			bytes = new byte[icon.available()];
			icon.read(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}
	
	
}
