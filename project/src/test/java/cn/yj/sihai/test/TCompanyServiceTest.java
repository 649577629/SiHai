package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TCompanyBO;
import cn.yj.sihai.service.TCompanyService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_管理员 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TCompanyServiceTest {

	/** 表_管理员 Service */
	@Resource
	private TCompanyService tCompanyService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_管理员
	 */
	@Test
	public void insert() {
		try {
			TCompanyBO bo = TCompanyBO.builder()
					.keyID("test")
					.companyName("test")
					.socialCode("test")
					.taxpayerID("test")
					.organizationCode("test")
					.registCode("test")
					.webUrl("test")
					.address("test")
					.legalPerson("test")
					.mobile("test")
					.email("test")
					.account("test")
					.loginPasswordMD5("test")
					.remark("test")
					.areaID("test")
					.approve(0)
					.setTime(new Date())
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tCompanyService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_管理员
	 */
	@Test
	public void update() {
		try {
			TCompanyBO bo = TCompanyBO.builder()
					.keyID("test")
					.companyName("test")
					.socialCode("test")
					.taxpayerID("test")
					.organizationCode("test")
					.registCode("test")
					.webUrl("test")
					.address("test")
					.legalPerson("test")
					.mobile("test")
					.email("test")
					.account("test")
					.loginPasswordMD5("test")
					.remark("test")
					.areaID("test")
					.approve(0)
					.setTime(new Date())
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tCompanyService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_管理员
	 */
	@Test
	public void deleteById() {
		try {
			tCompanyService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_管理员
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tCompanyService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_管理员 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tCompanyService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
