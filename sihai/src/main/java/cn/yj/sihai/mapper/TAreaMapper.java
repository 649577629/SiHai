package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TAreaPO;

/** 表_区域 Mapper */
@Repository
public interface TAreaMapper {

	/**
	 *  新增 表_区域
	 * 
	 * @param po 表_区域 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TAreaPO po
	);

	/**
	 *  修改 表_区域
	 * 
	 * @param po 表_区域 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TAreaPO po
	);

	/**
	 * 根据主键删除 表_区域
	 * 
	 * @param keyID 表_区域 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_区域
	 * 
	 * @param keyID 表_区域 需查询主键
	 * @return 表_区域 对象
	 */
	TAreaPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_区域
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_区域 对象集合
	 */
	List<TAreaPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
