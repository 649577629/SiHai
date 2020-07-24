package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TParameterPO;
import java.util.List;

/** 表_参数 Mapper */
@Repository
public interface TParameterMapper {

	/**
	 *  新增 表_参数
	 * 
	 * @param po 表_参数 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TParameterPO po
	);

	/**
	 *  修改 表_参数
	 * 
	 * @param po 表_参数 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TParameterPO po
	);

	/**
	 * 根据主键删除 表_参数
	 * 
	 * @param keyID 表_参数 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_参数
	 * 
	 * @param keyID 表_参数 需查询主键
	 * @return 表_参数 对象
	 */
	TParameterPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_参数
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_参数 对象集合
	 */
	List<TParameterPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
