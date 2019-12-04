package org.lq.ZOO.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import lombok.extern.log4j.Log4j;

@Log4j
public class PropsUtil {
	
//	Logger log = Logger.getLogger(PropsUtil.class);
	
	public static Properties loadProps(String fileName) {
		Properties props = null;
		InputStream is = null;
//		is = Thread.currentThread().getContextClassLoader()
//		PropsUtil.class.getResourceAsStream(name)
		
		try {
			props = new Properties();
			is = PropsUtil.class.getClassLoader().getResourceAsStream(fileName);
			if(is==null) {
//				throw new FileNotFoundException(fileName+" file not found!");
				throw new FileNotFoundException(fileName+" �ļ��Ҳ�����·������!");
			}
			props.load(is);
		} catch (IOException e) {
//			log.error("load properties file failure", e);
			log.error("properties�����ļ�����ʧ��", e);
		}finally {
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					log.error("���������ļ�,�ر�������ʧ�ܣ�", e);
				}
			}
		}
		return props;
	}
	
	/**
	 * ��ȡString���͵�ֵ
	 * @param props	�����ļ�
	 * @param key	
	 * @param defaultValue Ĭ��ֵ
	 * @return
	 */
	public static String getString(Properties props,String key,String defaultValue) {
		String value = defaultValue;
		if(props.containsKey(key)) {
			value = props.getProperty(key);
		}
		return value; 
	}
	
	public static String getString(Properties props,String key){
		return getString(props, key, "");
	}
	
	
	public static int getInt(Properties props,String key,int defaultValue) {
		int value = defaultValue;
		if(props.containsKey(key)) {
			value = CastUtil.castInt(props.getProperty(key));
		}
		return value;
	}
	
	public static int getInt(Properties props,String key) {
		return getInt(props, key, 0);
	}

}
