package beehive.dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import beehive.bean.Report;
import beehive.util.MyBatisUtil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class ReportDao {
	 String resource = "conf.xml";
     InputStream is = ReportDao.class.getClassLoader().getResourceAsStream(resource);
     SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
     
	public void save(Report report)
	{
		 	SqlSession session = MyBatisUtil.getSqlSession(true);
	        
	        String statement = "beehive.mapper.reportMapper.addReport";//ӳ��sql�ı�ʶ�ַ���
	        //insert
	        int retResult = session.insert(statement,report);
	        //�ֶ��ύ����
	        session.commit();
	        //ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
	        session.close();
	        //System.out.println(retResult);
	}
	
	public List<Report> getLatestReport(String phone, int n)
	{
	 		SqlSession session = MyBatisUtil.getSqlSession(true);
        
	 		String statement = "beehive.mapper.reportMapper.getLatestReport";//ӳ��sql�ı�ʶ�ַ���
	 		//insert
	 		Map<String, Object> param = new HashMap<String,Object>();
	 		param.put("phone", phone);
	 		param.put("number", n);
	 		List<Report> reportList = session.selectList(statement,param);
	 		//�ֶ��ύ����
	 		session.commit();
	 		//ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
	 		session.close();
	 		//System.out.println(retResult);
			return reportList;
	}
	
	public List<Report> getTimedReport(String phone, String startTime, String endTime)
	{
	 		SqlSession session = MyBatisUtil.getSqlSession(true);
        
	 		String statement = "beehive.mapper.reportMapper.getTimedReport";//ӳ��sql�ı�ʶ�ַ���
	 		//insert
	 		Map<String, String> param = new HashMap<String, String>();
	 		param.put("phone", phone);
	 		param.put("startTime", startTime);
	 		param.put("endTime", endTime);
	 		List<Report> reportList = session.selectList(statement,param);
	 		//�ֶ��ύ����
	 		session.commit();
	 		//ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
	 		session.close();
	 		//System.out.println(retResult);
			return reportList;
	}
	
	public List<Report> getAll(String phone)
	{
 		SqlSession session = MyBatisUtil.getSqlSession(true);
        
 		String statement = "beehive.mapper.reportMapper.getAll";//ӳ��sql�ı�ʶ�ַ���
 		//insert
     
 		List<Report> reportList = session.selectList(statement,phone);
 		//�ֶ��ύ����
 		session.commit();
 		//ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
 		session.close();
 		//System.out.println(retResult);
		return reportList;
	}
	
	public Report getNewReport(String phone){
		SqlSession session = MyBatisUtil.getSqlSession(true);
 		String statement = "beehive.mapper.reportMapper.getNewReport";//ӳ��sql�ı�ʶ�ַ���
 		Report report = session.selectOne(phone);
 		//�ֶ��ύ����
 		session.commit();
 		//ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
 		session.close();
 		//System.out.println(retResult);
		return report;
	}
	 
}