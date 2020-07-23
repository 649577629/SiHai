package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TMenuPO;

/** 表_菜单 Mapper */
@Repository
public interface TMenuMapper {

	/**
	 *  新增 表_菜单
	 * 
	 * @param po 表_菜单 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TMenuPO po
	);

	/**
	 *  修改 表_菜单
	 * 
	 * @param po 表_菜单 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TMenuPO po
	);

	/**
	 * 根据主键删除 表_菜单
	 * 
	 * @param keyID 表_菜单 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_菜单
	 * 
	 * @param keyID 表_菜单 需查询主键
	 * @return 表_菜单 对象
	 */
	TMenuPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_菜单
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_菜单 对象集合
	 */
	List<TMenuPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
