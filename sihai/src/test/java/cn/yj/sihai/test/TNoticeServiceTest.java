package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TNoticeBO;
import cn.yj.sihai.service.TNoticeService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_公告 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TNoticeServiceTest {

	/** 表_公告 Service */
	@Resource
	private TNoticeService tNoticeService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_公告
	 */
	@Test
	public void insert() {
		try {
			TNoticeBO bo = TNoticeBO.builder()
					.keyID("test")
					.noticeIntroduction("test")
					.noticeDetails("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tNoticeService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_公告
	 */
	@Test
	public void update() {
		try {
			TNoticeBO bo = TNoticeBO.builder()
					.keyID("test")
					.noticeIntroduction("test")
					.noticeDetails("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tNoticeService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_公告
	 */
	@Test
	public void deleteById() {
		try {
			tNoticeService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_公告
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tNoticeService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_公告 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tNoticeService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
