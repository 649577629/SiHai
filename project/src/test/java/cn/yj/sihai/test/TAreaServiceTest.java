package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TAreaBO;
import cn.yj.sihai.service.TAreaService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_区域 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TAreaServiceTest {

	/** 表_区域 Service */
	@Resource
	private TAreaService tAreaService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_区域
	 */
	@Test
	public void insert() {
		try {
			TAreaBO bo = TAreaBO.builder()
					.keyID("test")
					.areaNameCN("test")
					.areaNameEN("test")
					.upLevelID("test")
					.areaLevel(0)
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tAreaService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_区域
	 */
	@Test
	public void update() {
		try {
			TAreaBO bo = TAreaBO.builder()
					.keyID("test")
					.areaNameCN("test")
					.areaNameEN("test")
					.upLevelID("test")
					.areaLevel(0)
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tAreaService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_区域
	 */
	@Test
	public void deleteById() {
		try {
			tAreaService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_区域
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tAreaService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_区域 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tAreaService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
