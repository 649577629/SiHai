package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TFeedbackBO;
import cn.yj.sihai.service.TFeedbackService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_反馈信息表 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TFeedbackServiceTest {

	/** 表_反馈信息表 Service */
	@Resource
	private TFeedbackService tFeedbackService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_反馈信息表
	 */
	@Test
	public void insert() {
		try {
			TFeedbackBO bo = TFeedbackBO.builder()
					.keyID("test")
					.userID("test")
					.remark("test")
					.pictureUrl("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tFeedbackService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_反馈信息表
	 */
	@Test
	public void update() {
		try {
			TFeedbackBO bo = TFeedbackBO.builder()
					.keyID("test")
					.userID("test")
					.remark("test")
					.pictureUrl("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tFeedbackService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_反馈信息表
	 */
	@Test
	public void deleteById() {
		try {
			tFeedbackService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_反馈信息表
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tFeedbackService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_反馈信息表 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tFeedbackService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
