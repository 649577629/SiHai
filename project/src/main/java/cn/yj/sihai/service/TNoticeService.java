package cn.yj.sihai.service;

import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.dto.ResultMessage;
import cn.yj.bean.bo.TNoticeBO;
import cn.yj.sihai.mapper.TNoticeMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/** 表_公告 Service */
@Service
public class TNoticeService {

	/** 表_公告 Repository */
	@Resource
	private TNoticeMapper tNoticeMapper;

	//------------------------------------------------------------------------------------------------------------------基础方法

	/**
	 * 新增 表_公告
	 * 
	 * @param bo 表_公告 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage insert(
			TNoticeBO bo
	) throws BusinessException {
		try {
			// TODO 需添加步骤赋值新增ID
			int result = tNoticeMapper.insert(bo.toPO());
			if (result > 0) {
				return new ResultMessage("新增成功！");
			} else {
				return new ResultMessage(1, "新增失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("新增 表_公告 错误", e);
		}
	}

	/**
	 * 修改 表_公告
	 * 
	 * @param bo 表_公告 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage update(
			TNoticeBO bo
	) throws BusinessException {
		try {
			int result = tNoticeMapper.update(bo.toPO());
			if (result > 0) {
				return new ResultMessage("修改成功！");
			} else {
				return new ResultMessage(1, "修改失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("修改 表_公告 错误", e);
		}
	}

	/**
	 * 根据主键删除 表_公告
	 * 
	 * @param keyID 表_公告 需删除主键
	 * @return 受影响行数
	 */
	public int deleteById(
			String keyID
	) throws BusinessException {
		try {
			return tNoticeMapper.deleteById(keyID);
		} catch (Exception e) {
			throw new BusinessException("根据主键删除 表_公告 错误", e);
		}
	}

	/**
	 * 根据主键查询 表_公告 对象
	 * 
	 * @param keyID 表_公告 需查询主键
	 * @return 表_公告 对象
	 */
	public TNoticeBO getByID(
			String keyID
	) throws BusinessException {
		try {
			return TNoticeBO.toBO(tNoticeMapper.getByID(keyID));
		} catch (Exception e) {
			throw new BusinessException("根据主键查询 表_公告 错误", e);
		}
	}

	/**
	 * 分页查询 表_公告 集合
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_公告 集合
	 */
	public List<TNoticeBO> queryBy(
			int currentPage,
			int eachPageNumber
	) throws BusinessException {
		try {
			return TNoticeBO.toBO(tNoticeMapper.queryBy(currentPage - 1, eachPageNumber));
		} catch (Exception e) {
			throw new BusinessException("分页查询 表_公告 集合 错误", e);
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
