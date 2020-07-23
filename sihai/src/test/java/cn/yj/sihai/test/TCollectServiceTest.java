package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TCollectBO;
import cn.yj.sihai.service.TCollectService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_收藏 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TCollectServiceTest {

	/** 表_收藏 Service */
	@Resource
	private TCollectService tCollectService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_收藏
	 */
	@Test
	public void insert() {
		try {
			TCollectBO bo = TCollectBO.builder()
					.keyID("test")
					.userID("test")
					.companyID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tCollectService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_收藏
	 */
	@Test
	public void update() {
		try {
			TCollectBO bo = TCollectBO.builder()
					.keyID("test")
					.userID("test")
					.companyID("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tCollectService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_收藏
	 */
	@Test
	public void deleteById() {
		try {
			tCollectService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_收藏
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tCollectService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_收藏 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tCollectService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
