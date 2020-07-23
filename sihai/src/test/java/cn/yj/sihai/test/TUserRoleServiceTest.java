package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TUserRoleBO;
import cn.yj.sihai.service.TUserRoleService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_用户角色关系 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TUserRoleServiceTest {

	/** 表_用户角色关系 Service */
	@Resource
	private TUserRoleService tUserRoleService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_用户角色关系
	 */
	@Test
	public void insert() {
		try {
			TUserRoleBO bo = TUserRoleBO.builder()
					.keyID("test")
					.userID("test")
					.roleID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUserRoleService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_用户角色关系
	 */
	@Test
	public void update() {
		try {
			TUserRoleBO bo = TUserRoleBO.builder()
					.keyID("test")
					.userID("test")
					.roleID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUserRoleService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_用户角色关系
	 */
	@Test
	public void deleteById() {
		try {
			tUserRoleService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_用户角色关系
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tUserRoleService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_用户角色关系 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tUserRoleService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
