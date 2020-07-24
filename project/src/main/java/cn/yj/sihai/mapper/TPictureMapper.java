package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TPicturePO;
import java.util.List;

/** 表_图片 Mapper */
@Repository
public interface TPictureMapper {

	/**
	 *  新增 表_图片
	 * 
	 * @param po 表_图片 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TPicturePO po
	);

	/**
	 *  修改 表_图片
	 * 
	 * @param po 表_图片 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TPicturePO po
	);

	/**
	 * 根据主键删除 表_图片
	 * 
	 * @param keyID 表_图片 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_图片
	 * 
	 * @param keyID 表_图片 需查询主键
	 * @return 表_图片 对象
	 */
	TPicturePO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_图片
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_图片 对象集合
	 */
	List<TPicturePO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
