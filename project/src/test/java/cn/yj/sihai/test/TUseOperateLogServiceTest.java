package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TUseOperateLogBO;
import cn.yj.sihai.service.TUseOperateLogService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_用户操作记录表 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TUseOperateLogServiceTest {

	/** 表_用户操作记录表 Service */
	@Resource
	private TUseOperateLogService tUseOperateLogService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_用户操作记录表
	 */
	@Test
	public void insert() {
		try {
			TUseOperateLogBO bo = TUseOperateLogBO.builder()
					.keyID("test")
					.userID("test")
					.logAction("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUseOperateLogService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_用户操作记录表
	 */
	@Test
	public void update() {
		try {
			TUseOperateLogBO bo = TUseOperateLogBO.builder()
					.keyID("test")
					.userID("test")
					.logAction("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tUseOperateLogService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_用户操作记录表
	 */
	@Test
	public void deleteById() {
		try {
			tUseOperateLogService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_用户操作记录表
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tUseOperateLogService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_用户操作记录表 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tUseOperateLogService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
