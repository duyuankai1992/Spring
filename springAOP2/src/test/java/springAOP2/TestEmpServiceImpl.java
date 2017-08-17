package springAOP2;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yztc.aop.demo4.EmpService;


public class TestEmpServiceImpl {
	
	private ApplicationContext ctx;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void delete(){
		EmpService empService = ctx.getBean("empService",EmpService.class);
		empService.delete();
	}

}
