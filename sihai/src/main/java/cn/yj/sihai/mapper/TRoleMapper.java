package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TRolePO;

/** 表_角色 Mapper */
@Repository
public interface TRoleMapper {

	/**
	 *  新增 表_角色
	 * 
	 * @param po 表_角色 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TRolePO po
	);

	/**
	 *  修改 表_角色
	 * 
	 * @param po 表_角色 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TRolePO po
	);

	/**
	 * 根据主键删除 表_角色
	 * 
	 * @param keyID 表_角色 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_角色
	 * 
	 * @param keyID 表_角色 需查询主键
	 * @return 表_角色 对象
	 */
	TRolePO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_角色
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_角色 对象集合
	 */
	List<TRolePO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
