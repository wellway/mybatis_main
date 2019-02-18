package com.yalongz.commons;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 获取SqlSessionFactory 管理session
 * 
 * @author qiqi
 *
 */
public class MyBatisUtil {

	private static SqlSessionFactory	ssf;
	static {
		String resource = "configuration.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			ssf = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取SqlSessionFactory
	 * 
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory() {

		return ssf;
	}

	/**
	 * 关闭Session
	 * 
	 * @param session
	 */
	public static void closeSession(SqlSession session) {

		if (null != session) {
			session.close();
		}
	}

}
