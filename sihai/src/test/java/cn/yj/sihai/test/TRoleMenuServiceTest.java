package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TRoleMenuBO;
import cn.yj.sihai.service.TRoleMenuService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_角色菜单关系 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TRoleMenuServiceTest {

	/** 表_角色菜单关系 Service */
	@Resource
	private TRoleMenuService tRoleMenuService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_角色菜单关系
	 */
	@Test
	public void insert() {
		try {
			TRoleMenuBO bo = TRoleMenuBO.builder()
					.keyID("test")
					.roleID("test")
					.menuID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tRoleMenuService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_角色菜单关系
	 */
	@Test
	public void update() {
		try {
			TRoleMenuBO bo = TRoleMenuBO.builder()
					.keyID("test")
					.roleID("test")
					.menuID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tRoleMenuService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_角色菜单关系
	 */
	@Test
	public void deleteById() {
		try {
			tRoleMenuService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_角色菜单关系
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tRoleMenuService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_角色菜单关系 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tRoleMenuService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
