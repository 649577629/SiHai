package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TModulePO;

/** 表_模块分类 Mapper */
@Repository
public interface TModuleMapper {

	/**
	 *  新增 表_模块分类
	 * 
	 * @param po 表_模块分类 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TModulePO po
	);

	/**
	 *  修改 表_模块分类
	 * 
	 * @param po 表_模块分类 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TModulePO po
	);

	/**
	 * 根据主键删除 表_模块分类
	 * 
	 * @param keyID 表_模块分类 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_模块分类
	 * 
	 * @param keyID 表_模块分类 需查询主键
	 * @return 表_模块分类 对象
	 */
	TModulePO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_模块分类
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_模块分类 对象集合
	 */
	List<TModulePO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
