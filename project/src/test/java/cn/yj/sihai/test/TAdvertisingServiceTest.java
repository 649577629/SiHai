package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TAdvertisingBO;
import cn.yj.sihai.service.TAdvertisingService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_广告 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TAdvertisingServiceTest {

	/** 表_广告 Service */
	@Resource
	private TAdvertisingService tAdvertisingService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_广告
	 */
	@Test
	public void insert() {
		try {
			TAdvertisingBO bo = TAdvertisingBO.builder()
					.keyID("test")
					.companyID("test")
					.adContent("test")
					.setTime(new Date())
					.downTime(new Date())
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tAdvertisingService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_广告
	 */
	@Test
	public void update() {
		try {
			TAdvertisingBO bo = TAdvertisingBO.builder()
					.keyID("test")
					.companyID("test")
					.adContent("test")
					.setTime(new Date())
					.downTime(new Date())
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tAdvertisingService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_广告
	 */
	@Test
	public void deleteById() {
		try {
			tAdvertisingService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_广告
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tAdvertisingService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_广告 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tAdvertisingService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
