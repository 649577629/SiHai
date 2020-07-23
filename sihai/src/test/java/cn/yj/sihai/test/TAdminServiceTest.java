package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TAdminBO;
import cn.yj.sihai.service.TAdminService;
import cn.yj.sihai.SihaiApplication;
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
@SpringBootTest(classes = SihaiApplication.class)
public class TAdminServiceTest {

	/** 表_管理员 Service */
	@Resource
	private TAdminService tAdminService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_管理员
	 */
	@Test
	public void insert() {
		try {
			TAdminBO bo = TAdminBO.builder()
					.keyID("test")
					.userNo("test")
					.userName("test")
					.userAge(0)
					.userSex(0)
					.userAddress("test")
					.iDCard("test")
					.mobile("test")
					.email("test")
					.account("test")
					.loginPasswordMD5("test")
					.userType(0)
					.remark("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tAdminService.insert(bo));
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
			TAdminBO bo = TAdminBO.builder()
					.keyID("test")
					.userNo("test")
					.userName("test")
					.userAge(0)
					.userSex(0)
					.userAddress("test")
					.iDCard("test")
					.mobile("test")
					.email("test")
					.account("test")
					.loginPasswordMD5("test")
					.userType(0)
					.remark("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tAdminService.update(bo));
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
			tAdminService.deleteById("test");
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
			System.out.println(tAdminService.getByID("test"));
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
			System.out.println(tAdminService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
