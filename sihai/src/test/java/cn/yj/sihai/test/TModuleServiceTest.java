package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TModuleBO;
import cn.yj.sihai.service.TModuleService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_模块分类 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TModuleServiceTest {

	/** 表_模块分类 Service */
	@Resource
	private TModuleService tModuleService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_模块分类
	 */
	@Test
	public void insert() {
		try {
			TModuleBO bo = TModuleBO.builder()
					.keyID("test")
					.moduleName("test")
					.moduleOrder(0)
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tModuleService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_模块分类
	 */
	@Test
	public void update() {
		try {
			TModuleBO bo = TModuleBO.builder()
					.keyID("test")
					.moduleName("test")
					.moduleOrder(0)
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tModuleService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_模块分类
	 */
	@Test
	public void deleteById() {
		try {
			tModuleService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_模块分类
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tModuleService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_模块分类 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tModuleService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
