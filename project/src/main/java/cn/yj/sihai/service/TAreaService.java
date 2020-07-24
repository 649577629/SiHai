package cn.yj.sihai.service;

import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.dto.ResultMessage;
import cn.yj.bean.bo.TAreaBO;
import cn.yj.sihai.mapper.TAreaMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/** 表_区域 Service */
@Service
public class TAreaService {

	/** 表_区域 Repository */
	@Resource
	private TAreaMapper tAreaMapper;

	//------------------------------------------------------------------------------------------------------------------基础方法

	/**
	 * 新增 表_区域
	 * 
	 * @param bo 表_区域 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage insert(
			TAreaBO bo
	) throws BusinessException {
		try {
			// TODO 需添加步骤赋值新增ID
			int result = tAreaMapper.insert(bo.toPO());
			if (result > 0) {
				return new ResultMessage("新增成功！");
			} else {
				return new ResultMessage(1, "新增失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("新增 表_区域 错误", e);
		}
	}

	/**
	 * 修改 表_区域
	 * 
	 * @param bo 表_区域 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage update(
			TAreaBO bo
	) throws BusinessException {
		try {
			int result = tAreaMapper.update(bo.toPO());
			if (result > 0) {
				return new ResultMessage("修改成功！");
			} else {
				return new ResultMessage(1, "修改失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("修改 表_区域 错误", e);
		}
	}

	/**
	 * 根据主键删除 表_区域
	 * 
	 * @param keyID 表_区域 需删除主键
	 * @return 受影响行数
	 */
	public int deleteById(
			String keyID
	) throws BusinessException {
		try {
			return tAreaMapper.deleteById(keyID);
		} catch (Exception e) {
			throw new BusinessException("根据主键删除 表_区域 错误", e);
		}
	}

	/**
	 * 根据主键查询 表_区域 对象
	 * 
	 * @param keyID 表_区域 需查询主键
	 * @return 表_区域 对象
	 */
	public TAreaBO getByID(
			String keyID
	) throws BusinessException {
		try {
			return TAreaBO.toBO(tAreaMapper.getByID(keyID));
		} catch (Exception e) {
			throw new BusinessException("根据主键查询 表_区域 错误", e);
		}
	}

	/**
	 * 分页查询 表_区域 集合
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_区域 集合
	 */
	public List<TAreaBO> queryBy(
			int currentPage,
			int eachPageNumber
	) throws BusinessException {
		try {
			return TAreaBO.toBO(tAreaMapper.queryBy(currentPage - 1, eachPageNumber));
		} catch (Exception e) {
			throw new BusinessException("分页查询 表_区域 集合 错误", e);
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
