package cn.yj.sihai.service;

import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.dto.ResultMessage;
import cn.yj.bean.bo.TRoleBO;
import cn.yj.sihai.mapper.TRoleMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/** 表_角色 Service */
@Service
public class TRoleService {

	/** 表_角色 Repository */
	@Resource
	private TRoleMapper tRoleMapper;

	//------------------------------------------------------------------------------------------------------------------基础方法

	/**
	 * 新增 表_角色
	 * 
	 * @param bo 表_角色 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage insert(
			TRoleBO bo
	) throws BusinessException {
		try {
			// TODO 需添加步骤赋值新增ID
			int result = tRoleMapper.insert(bo.toPO());
			if (result > 0) {
				return new ResultMessage("新增成功！");
			} else {
				return new ResultMessage(1, "新增失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("新增 表_角色 错误", e);
		}
	}

	/**
	 * 修改 表_角色
	 * 
	 * @param bo 表_角色 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage update(
			TRoleBO bo
	) throws BusinessException {
		try {
			int result = tRoleMapper.update(bo.toPO());
			if (result > 0) {
				return new ResultMessage("修改成功！");
			} else {
				return new ResultMessage(1, "修改失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("修改 表_角色 错误", e);
		}
	}

	/**
	 * 根据主键删除 表_角色
	 * 
	 * @param keyID 表_角色 需删除主键
	 * @return 受影响行数
	 */
	public int deleteById(
			String keyID
	) throws BusinessException {
		try {
			return tRoleMapper.deleteById(keyID);
		} catch (Exception e) {
			throw new BusinessException("根据主键删除 表_角色 错误", e);
		}
	}

	/**
	 * 根据主键查询 表_角色 对象
	 * 
	 * @param keyID 表_角色 需查询主键
	 * @return 表_角色 对象
	 */
	public TRoleBO getByID(
			String keyID
	) throws BusinessException {
		try {
			return TRoleBO.toBO(tRoleMapper.getByID(keyID));
		} catch (Exception e) {
			throw new BusinessException("根据主键查询 表_角色 错误", e);
		}
	}

	/**
	 * 分页查询 表_角色 集合
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_角色 集合
	 */
	public List<TRoleBO> queryBy(
			int currentPage,
			int eachPageNumber
	) throws BusinessException {
		try {
			return TRoleBO.toBO(tRoleMapper.queryBy(currentPage - 1, eachPageNumber));
		} catch (Exception e) {
			throw new BusinessException("分页查询 表_角色 集合 错误", e);
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
