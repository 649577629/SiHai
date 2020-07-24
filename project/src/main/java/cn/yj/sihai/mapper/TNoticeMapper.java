package cn.yj.sihai.mapper;

import org.springframework.stereotype.Repository;
import cn.yj.bean.po.TNoticePO;
import java.util.List;

/** 表_公告 Mapper */
@Repository
public interface TNoticeMapper {

	/**
	 *  新增 表_公告
	 * 
	 * @param po 表_公告 PO
	 * @return >0 成功 | =0 失败
	 */
	int insert(
			TNoticePO po
	);

	/**
	 *  修改 表_公告
	 * 
	 * @param po 表_公告 PO
	 * @return >0 成功 | =0 失败
	 */
	int update(
			TNoticePO po
	);

	/**
	 * 根据主键删除 表_公告
	 * 
	 * @param keyID 表_公告 需删除主键
	 * @return >0 成功 | =0 失败
	 */
	int deleteById(
			String keyID
	);

	/**
	 * 根据主键查询 表_公告
	 * 
	 * @param keyID 表_公告 需查询主键
	 * @return 表_公告 对象
	 */
	TNoticePO getByID(
			String keyID
	);

	/**
	 * 查询全部 表_公告
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_公告 对象集合
	 */
	List<TNoticePO> queryBy(
			int currentPage,
			int eachPageNumber
	);

}
