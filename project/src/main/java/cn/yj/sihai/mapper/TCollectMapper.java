package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TCollectPO;
import java.util.List;

/** 表_收藏 Mapper */
@Repository
public interface TCollectMapper {

	/**
	 *  新增 表_收藏
	 * 
	 * @param po 表_收藏 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TCollectPO po
	);

	/**
	 *  修改 表_收藏
	 * 
	 * @param po 表_收藏 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TCollectPO po
	);

	/**
	 * 根据主键删除 表_收藏
	 * 
	 * @param keyID 表_收藏 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_收藏
	 * 
	 * @param keyID 表_收藏 需查询主键
	 * @return 表_收藏 对象
	 */
	TCollectPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_收藏
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_收藏 对象集合
	 */
	List<TCollectPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
