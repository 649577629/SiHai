package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TUserBO;
import cn.yj.sihai.service.TUserService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_用户 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TUserServiceTest {

	/** 表_用户 Service */
	@Resource
	private TUserService tUserService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_用户
	 */
	@Test
	public void insert() {
		try {
			TUserBO bo = TUserBO.builder()
					.keyID("test")
					.userNo("test")
					.userName("test")
					.userAge(0)
					.userSex(0)
					.iDCard("test")
					.userAddress("test")
					.mobile("test")
					.email("test")
					.headPortraitUrl("test")
					.account("test")
					.loginPasswordMD5("test")
					.remark("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUserService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_用户
	 */
	@Test
	public void update() {
		try {
			TUserBO bo = TUserBO.builder()
					.keyID("test")
					.userNo("test")
					.userName("test")
					.userAge(0)
					.userSex(0)
					.iDCard("test")
					.userAddress("test")
					.mobile("test")
					.email("test")
					.headPortraitUrl("test")
					.account("test")
					.loginPasswordMD5("test")
					.remark("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUserService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_用户
	 */
	@Test
	public void deleteById() {
		try {
			tUserService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_用户
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tUserService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_用户 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tUserService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
