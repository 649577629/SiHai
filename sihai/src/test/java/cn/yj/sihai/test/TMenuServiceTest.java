package cn.yj.sihai.test;

import cn.yj.sihai.SihaiApplication;
import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.bo.TMenuBO;
import cn.yj.sihai.service.TMenuService;
import cn.yj.sihai.SihaiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 表_菜单 Service 单元测试类 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SihaiApplication.class)
public class TMenuServiceTest {

	/** 表_菜单 Service */
	@Resource
	private TMenuService tMenuService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_菜单
	 */
	@Test
	public void insert() {
		try {
			TMenuBO bo = TMenuBO.builder()
					.keyID("test")
					.menuName("test")
					.menuUrl("test")
					.menuSign("test")
					.parentID("test")
					.isTurn(0)
					.menuOrder(0)
					.remark("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tMenuService.insert(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改 表_菜单
	 */
	@Test
	public void update() {
		try {
			TMenuBO bo = TMenuBO.builder()
					.keyID("test")
					.menuName("test")
					.menuUrl("test")
					.menuSign("test")
					.parentID("test")
					.isTurn(0)
					.menuOrder(0)
					.remark("test")
					.createTime(new Date())
					.createID("test")
					.updateTime(new Date())
					.updateID("test")
					.state(0)
					.build();
			System.out.println(tMenuService.update(bo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键删除 表_菜单
	 */
	@Test
	public void deleteById() {
		try {
			tMenuService.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据主键查询 表_菜单
	 */
	@Test
	public void getByID() {
		try {
			System.out.println(tMenuService.getByID("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询 表_菜单 分页对象 
	 */
	@Test
	public void queryBy() {
		try {
			System.out.println(tMenuService.queryBy(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
