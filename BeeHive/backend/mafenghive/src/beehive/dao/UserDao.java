package beehive.dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import beehive.bean.User;
import beehive.util.MyBatisUtil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class UserDao {
	 String resource = "conf.xml";
     InputStream is = UserDao.class.getClassLoader().getResourceAsStream(resource);
     SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
     
	 public boolean has(String phone){
		 SqlSession session = sessionFactory.openSession();
	     String statement = "beehive.mapper.userMapper.getUser";
	     User user = session.selectOne(statement, phone);
	     session.commit();
	     session.close();
	     if(user == null)
	    	 return false;
	     else
	    	 return true;	     
	 }
	 
	 public void save(User user){
	        SqlSession session = MyBatisUtil.getSqlSession(true);
	        /**
	         * ӳ��sql�ı�ʶ�ַ�����
	         * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
	         * addUser��insert��ǩ��id����ֵ��ͨ��insert��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
	         */
	        String statement = "beehive.mapper.userMapper.addUser";//ӳ��sql�ı�ʶ�ַ���
	        //ִ�в������
	        int retResult = session.insert(statement,user);
	        //�ֶ��ύ����
	        session.commit();
	        //ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
	        session.close();
	        System.out.println(retResult);
	 }
	 
	 public User getUser(String phone){
		 SqlSession session = sessionFactory.openSession();
		 String statement = "beehive.mapper.userMapper.getUser";
	     User user = session.selectOne(statement, phone);
	     session.commit();
	     session.close();
	     return user;  
	 }
	 
}
