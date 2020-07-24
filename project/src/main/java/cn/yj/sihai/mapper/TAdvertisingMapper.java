package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TAdvertisingPO;
import java.util.List;

/** 表_广告 Mapper */
@Repository
public interface TAdvertisingMapper {

	/**
	 *  新增 表_广告
	 * 
	 * @param po 表_广告 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TAdvertisingPO po
	);

	/**
	 *  修改 表_广告
	 * 
	 * @param po 表_广告 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TAdvertisingPO po
	);

	/**
	 * 根据主键删除 表_广告
	 * 
	 * @param keyID 表_广告 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_广告
	 * 
	 * @param keyID 表_广告 需查询主键
	 * @return 表_广告 对象
	 */
	TAdvertisingPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_广告
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_广告 对象集合
	 */
	List<TAdvertisingPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
