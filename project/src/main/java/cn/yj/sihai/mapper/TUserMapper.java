package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TUserPO;
import java.util.List;

/** 表_用户 Mapper */
@Repository
public interface TUserMapper {

	/**
	 *  新增 表_用户
	 * 
	 * @param po 表_用户 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TUserPO po
	);

	/**
	 *  修改 表_用户
	 * 
	 * @param po 表_用户 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TUserPO po
	);

	/**
	 * 根据主键删除 表_用户
	 * 
	 * @param keyID 表_用户 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_用户
	 * 
	 * @param keyID 表_用户 需查询主键
	 * @return 表_用户 对象
	 */
	TUserPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_用户
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_用户 对象集合
	 */
	List<TUserPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
