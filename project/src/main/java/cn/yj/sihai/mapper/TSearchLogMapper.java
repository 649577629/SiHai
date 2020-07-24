package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TSearchLogPO;
import java.util.List;

/** 表_搜索记录表 Mapper */
@Repository
public interface TSearchLogMapper {

	/**
	 *  新增 表_搜索记录表
	 * 
	 * @param po 表_搜索记录表 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TSearchLogPO po
	);

	/**
	 *  修改 表_搜索记录表
	 * 
	 * @param po 表_搜索记录表 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TSearchLogPO po
	);

	/**
	 * 根据主键删除 表_搜索记录表
	 * 
	 * @param keyID 表_搜索记录表 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_搜索记录表
	 * 
	 * @param keyID 表_搜索记录表 需查询主键
	 * @return 表_搜索记录表 对象
	 */
	TSearchLogPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_搜索记录表
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_搜索记录表 对象集合
	 */
	List<TSearchLogPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
