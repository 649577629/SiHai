package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TCompanyPO;
import java.util.List;

/** 表_管理员 Mapper */
@Repository
public interface TCompanyMapper {

	/**
	 *  新增 表_管理员
	 * 
	 * @param po 表_管理员 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TCompanyPO po
	);

	/**
	 *  修改 表_管理员
	 * 
	 * @param po 表_管理员 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TCompanyPO po
	);

	/**
	 * 根据主键删除 表_管理员
	 * 
	 * @param keyID 表_管理员 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_管理员
	 * 
	 * @param keyID 表_管理员 需查询主键
	 * @return 表_管理员 对象
	 */
	TCompanyPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_管理员
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_管理员 对象集合
	 */
	List<TCompanyPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
