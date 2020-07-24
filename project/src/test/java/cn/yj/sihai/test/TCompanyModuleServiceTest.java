package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TCompanyModuleBO;
import cn.yj.sihai.service.TCompanyModuleService;
import cn.yj.sihai.ProjectApplication;
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
@SpringBootTest(classes = ProjectApplication.class)
public class TCompanyModuleServiceTest {

	/** 表_角色菜单关系 Service */
	@Resource
	private TCompanyModuleService tCompanyModuleService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_角色菜单关系
	 */
	@Test
	public void insert() {
		try {
			TCompanyModuleBO bo = TCompanyModuleBO.builder()
					.keyID("test")
					.compnayID("test")
					.moduleID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tCompanyModuleService.insert(bo));
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
			TCompanyModuleBO bo = TCompanyModuleBO.builder()
					.keyID("test")
					.compnayID("test")
					.moduleID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tCompanyModuleService.update(bo));
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
			tCompanyModuleService.deleteById("test");
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
			System.out.println(tCompanyModuleService.getByID("test"));
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
			System.out.println(tCompanyModuleService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
