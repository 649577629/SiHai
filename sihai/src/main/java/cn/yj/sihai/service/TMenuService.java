package cn.yj.sihai.service;

import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.dto.ResultMessage;
import cn.yj.bean.bo.TMenuBO;
import cn.yj.sihai.mapper.TMenuMapper;
import dispose.TextDispose;
import encrypt.UUIDUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/** 表_菜单 Service */
@Service
public class TMenuService {

	/** 表_菜单 Repository */
	@Resource
	private TMenuMapper tMenuMapper;

	//------------------------------------------------------------------------------------------------------------------基础方法

	/**
	 * 新增 表_菜单
	 * 
	 * @param bo 表_菜单 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage insert(
			TMenuBO bo
	) throws BusinessException {
		try {
			// TODO 需添加步骤赋值新增ID
			int result = tMenuMapper.insert(bo.toPO());
			if (result > 0) {
				return new ResultMessage("新增成功！");
			} else {
				return new ResultMessage(1, "新增失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("新增 表_菜单 错误", e);
		}
	}

	/**
	 * 修改 表_菜单
	 * 
	 * @param bo 表_菜单 BO
	 * @return code=200 成功 | code=1 失败
	 */
	public ResultMessage update(
			TMenuBO bo
	) throws BusinessException {
		try {
			int result = tMenuMapper.update(bo.toPO());
			if (result > 0) {
				return new ResultMessage("修改成功！");
			} else {
				return new ResultMessage(1, "修改失败！");
			}
		} catch (Exception e) {
			throw new BusinessException("修改 表_菜单 错误", e);
		}
	}

	/**
	 * 根据主键删除 表_菜单
	 * 
	 * @param keyID 表_菜单 需删除主键
	 * @return 受影响行数
	 */
	public int deleteById(
			String keyID
	) throws BusinessException {
		try {
			return tMenuMapper.deleteById(keyID);
		} catch (Exception e) {
			throw new BusinessException("根据主键删除 表_菜单 错误", e);
		}
	}

	/**
	 * 根据主键查询 表_菜单 对象
	 * 
	 * @param keyID 表_菜单 需查询主键
	 * @return 表_菜单 对象
	 */
	public TMenuBO getByID(
			String keyID
	) throws BusinessException {
		try {
			return TMenuBO.toBO(tMenuMapper.getByID(keyID));
		} catch (Exception e) {
			throw new BusinessException("根据主键查询 表_菜单 错误", e);
		}
	}

	/**
	 * 分页查询 表_菜单 集合
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_菜单 集合
	 */
	public List<TMenuBO> queryBy(
			int currentPage,
			int eachPageNumber
	) throws BusinessException {
		try {
			return TMenuBO.toBO(tMenuMapper.queryBy(currentPage - 1, eachPageNumber));
		} catch (Exception e) {
			throw new BusinessException("分页查询 表_菜单 集合 错误", e);
		}
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
