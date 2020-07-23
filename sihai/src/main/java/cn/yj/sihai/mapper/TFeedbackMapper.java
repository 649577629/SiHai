package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TFeedbackPO;

/** 表_反馈信息表 Mapper */
@Repository
public interface TFeedbackMapper {

	/**
	 *  新增 表_反馈信息表
	 * 
	 * @param po 表_反馈信息表 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TFeedbackPO po
	);

	/**
	 *  修改 表_反馈信息表
	 * 
	 * @param po 表_反馈信息表 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TFeedbackPO po
	);

	/**
	 * 根据主键删除 表_反馈信息表
	 * 
	 * @param keyID 表_反馈信息表 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_反馈信息表
	 * 
	 * @param keyID 表_反馈信息表 需查询主键
	 * @return 表_反馈信息表 对象
	 */
	TFeedbackPO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_反馈信息表
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_反馈信息表 对象集合
	 */
	List<TFeedbackPO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
