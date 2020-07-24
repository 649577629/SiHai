package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TUseOperateLogPO;
import java.util.List;

/** 表_用户操作记录表 Mapper */
@Repository
public interface TUseOperateLogMapper {

	/**
	 *  新增 表_用户操作记录表
	 * 
	 * @param po 表_用户操作记录表 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TUseOperateLogPO po
	);

	/**
	 *  修改 表_用户操作记录表
	 * 
	 * @param po 表_用户操作记录表 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TUseOperateLogPO po
	);

	/**
	 * 根据主键删除 表_用户操作记录表
	 * 
	 * @param keyID 表_用户操作记录表 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_用户操作记录表
	 * 
	 * @param keyID 表_用户操作记录表 需查询主键
	 * @return 表_用户操作记录表 对象
	 */
	TUseOperateLogPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_用户操作记录表
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_用户操作记录表 对象集合
	 */
	List<TUseOperateLogPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
