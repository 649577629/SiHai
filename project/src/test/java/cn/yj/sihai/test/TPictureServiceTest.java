package cn.yj.sihai.test;

import cn.yj.sihai.ProjectApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TPictureBO;
import cn.yj.sihai.service.TPictureService;
import cn.yj.sihai.ProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_图片 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class TPictureServiceTest {

	/** 表_图片 Service */
	@Resource
	private TPictureService tPictureService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_图片
	 */
	@Test
	public void insert() {
		try {
			TPictureBO bo = TPictureBO.builder()
					.keyID("test")
					.pictureClassId("test")
					.relationID("test")
					.pictureName("test")
					.showName("test")
					.pictureUrl("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tPictureService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_图片
	 */
	@Test
	public void update() {
		try {
			TPictureBO bo = TPictureBO.builder()
					.keyID("test")
					.pictureClassId("test")
					.relationID("test")
					.pictureName("test")
					.showName("test")
					.pictureUrl("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tPictureService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_图片
	 */
	@Test
	public void deleteById() {
		try {
			tPictureService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_图片
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tPictureService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_图片 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tPictureService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
