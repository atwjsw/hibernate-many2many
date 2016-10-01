package com.imooc.hibernate.junit;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.imooc.hibernate.entity.Employee;
import com.imooc.hibernate.entity.Project;
import com.imooc.hibernate.util.HibernateUtil;

/*
 * 多对多关系（项目《--》员工）
 * 管理关系的维护交由Project方管理，在Employee配置文件中设置inverse=“true”
 * 注意关联的方向是单向的，反向是查找不到的。
 * 保存Project是同时自动保存Employee，在Project中设置cascade="all"
 */
public class Many2ManyTest {

	@Test
	public void testSave() {
		
		Project project1 = new Project(1001, "项目一");
		Project project2 = new Project(1002, "项目二");
		
		Employee employee1 = new Employee(1, "慕女神");
		Employee employee2 = new Employee(2, "小慕慕");
		
		project1.getEmployees().add(employee1);
		project1.getEmployees().add(employee2);
		//项目2只有慕女神参加
		project2.getEmployees().add(employee1);

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(project1);
		session.save(project2);		
		tx.commit();
		HibernateUtil.closeSession(session);		
	};	
}
