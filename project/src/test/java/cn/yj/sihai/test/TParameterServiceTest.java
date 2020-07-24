package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TParameterBO;
import cn.yj.sihai.service.TParameterService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_参数 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TParameterServiceTest {

	/** 表_参数 Service */
	@Resource
	private TParameterService tParameterService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_参数
	 */
	@Test
	public void insert() {
		try {
			TParameterBO bo = TParameterBO.builder()
					.keyID("test")
					.parameterCode("test")
					.parameterName("test")
					.parameterValue("test")
					.parameterExplain("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tParameterService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_参数
	 */
	@Test
	public void update() {
		try {
			TParameterBO bo = TParameterBO.builder()
					.keyID("test")
					.parameterCode("test")
					.parameterName("test")
					.parameterValue("test")
					.parameterExplain("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tParameterService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_参数
	 */
	@Test
	public void deleteById() {
		try {
			tParameterService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_参数
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tParameterService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_参数 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tParameterService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
