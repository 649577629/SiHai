package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TPictureClassPO;

/** 表_图片分类 Mapper */
@Repository
public interface TPictureClassMapper {

	/**
	 *  新增 表_图片分类
	 * 
	 * @param po 表_图片分类 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TPictureClassPO po
	);

	/**
	 *  修改 表_图片分类
	 * 
	 * @param po 表_图片分类 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TPictureClassPO po
	);

	/**
	 * 根据主键删除 表_图片分类
	 * 
	 * @param keyID 表_图片分类 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_图片分类
	 * 
	 * @param keyID 表_图片分类 需查询主键
	 * @return 表_图片分类 对象
	 */
	TPictureClassPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_图片分类
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_图片分类 对象集合
	 */
	List<TPictureClassPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
