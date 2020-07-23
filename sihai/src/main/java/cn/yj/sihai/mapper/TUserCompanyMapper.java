package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TUserCompanyPO;

/** 表_用户公司关系 Mapper */
@Repository
public interface TUserCompanyMapper {

	/**
	 *  新增 表_用户公司关系
	 * 
	 * @param po 表_用户公司关系 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TUserCompanyPO po
	);

	/**
	 *  修改 表_用户公司关系
	 * 
	 * @param po 表_用户公司关系 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TUserCompanyPO po
	);

	/**
	 * 根据主键删除 表_用户公司关系
	 * 
	 * @param keyID 表_用户公司关系 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_用户公司关系
	 * 
	 * @param keyID 表_用户公司关系 需查询主键
	 * @return 表_用户公司关系 对象
	 */
	TUserCompanyPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_用户公司关系
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_用户公司关系 对象集合
	 */
	List<TUserCompanyPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
