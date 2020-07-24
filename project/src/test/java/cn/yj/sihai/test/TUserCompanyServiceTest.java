package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TUserCompanyBO;
import cn.yj.sihai.service.TUserCompanyService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_用户公司关系 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TUserCompanyServiceTest {

	/** 表_用户公司关系 Service */
	@Resource
	private TUserCompanyService tUserCompanyService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_用户公司关系
	 */
	@Test
	public void insert() {
		try {
			TUserCompanyBO bo = TUserCompanyBO.builder()
					.keyID("test")
					.userID("test")
					.companyID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUserCompanyService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_用户公司关系
	 */
	@Test
	public void update() {
		try {
			TUserCompanyBO bo = TUserCompanyBO.builder()
					.keyID("test")
					.userID("test")
					.companyID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUserCompanyService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_用户公司关系
	 */
	@Test
	public void deleteById() {
		try {
			tUserCompanyService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_用户公司关系
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tUserCompanyService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_用户公司关系 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tUserCompanyService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
