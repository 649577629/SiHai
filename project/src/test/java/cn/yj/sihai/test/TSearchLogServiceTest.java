package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TSearchLogBO;
import cn.yj.sihai.service.TSearchLogService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_搜索记录表 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TSearchLogServiceTest {

	/** 表_搜索记录表 Service */
	@Resource
	private TSearchLogService tSearchLogService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_搜索记录表
	 */
	@Test
	public void insert() {
		try {
			TSearchLogBO bo = TSearchLogBO.builder()
					.keyID("test")
					.userID("test")
					.content("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tSearchLogService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_搜索记录表
	 */
	@Test
	public void update() {
		try {
			TSearchLogBO bo = TSearchLogBO.builder()
					.keyID("test")
					.userID("test")
					.content("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tSearchLogService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_搜索记录表
	 */
	@Test
	public void deleteById() {
		try {
			tSearchLogService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_搜索记录表
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tSearchLogService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_搜索记录表 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tSearchLogService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
