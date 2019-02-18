package com.yalongz.mybatis_main;

import org.apache.ibatis.session.SqlSession;

import com.yalongz.commons.MyBatisUtil;
import com.yalongz.entity.Record;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Record record = new Record("jinrongjie", "20190218");
		Record record_cls = session.selectOne("selectRecodr", record);
		MyBatisUtil.closeSession(session);
		System.out.println(record_cls.getDate());
	}
}
