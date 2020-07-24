package cn.yj.sihai.restcontroller;

import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.dto.ResultMessage;
import cn.yj.bean.dto.TCompanyDTO;
import cn.yj.sihai.service.TCompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/** 表_管理员 RestController */
@Api(tags = "表_管理员 RestController")
@RestController
@RequestMapping(value = "/Company", produces = MediaType.APPLICATION_JSON_VALUE)
public class TCompanyRestController {

	/** 表_管理员 Service */
	@Resource
	private TCompanyService tCompanyService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_管理员
	 * 
	 * @param dto 表_管理员 DTO
	 * @return code=200 成功 | code=1 失败
	 */
	@ApiOperation(value = "新增 表_管理员", notes = "入参 TCompanyDTO 表_管理员 对象 进行新增则无需传入主键")
	@PostMapping(value = "/insert")
	public ResultMessage insert(
			@ApiParam(value = "表_管理员 DTO", required = true) TCompanyDTO dto
	) throws BusinessException {
		return tCompanyService.insert(dto.toBO());
	}

	/**
	 * 修改 表_管理员
	 * 
	 * @param dto 表_管理员 DTO
	 * @return code=200 成功 | code=1 失败
	 */
	@ApiOperation(value = "修改 表_管理员", notes = "入参 TCompanyDTO 表_管理员 对象 进行修改则传入对应主键 )")
	@PostMapping(value = "/update")
	public ResultMessage update(
			@ApiParam(value = "表_管理员 DTO", required = true) TCompanyDTO dto
	) throws BusinessException {
		return tCompanyService.update(dto.toBO());
	}

	/**
	 * 根据主键删除 表_管理员
	 * 
	 * @param keyID 表_管理员 需删除主键
	 * @return code=200 成功 | code=500 失败
	 */
	@ApiOperation(value = "根据主键删除 表_管理员 对象", notes = "入参 keyID 需删除主键值 进行删除操作")
	@DeleteMapping(value = "/deleteById/{keyID}")
	public ResultMessage deleteById(
			@ApiParam(value = "主键值", required = true) @PathVariable("keyID") String keyID
	) throws BusinessException {
		tCompanyService.deleteById(keyID);
		return new ResultMessage("删除成功!");
	}

	/**
	 * 根据主键查询 表_管理员
	 * 
	 * @param keyID 表_管理员 需查询主键
	 * @return 表_管理员 对象
	 */
	@ApiOperation(value = "根据主键查询 表_管理员 对象", notes = "入参 keyID 需查询主键 进行查询操作")
	@GetMapping(value = "/getByID/{keyID}")
	public ResultMessage getByID(
			@ApiParam(value = "主键值", required = true) @PathVariable("keyID") String keyID
	) throws BusinessException {
		return new ResultMessage(TCompanyDTO.toDTO(tCompanyService.getByID(keyID)));
	}

	/**
	 * 分页查询 表_管理员 集合 
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_管理员 集合
	 */
	@ApiOperation(value = "分页查询 表_管理员 集合 ", notes = "入参 currentPage 当前页 | eachPageNumber 每页条数 进行分页查询操作")
	@GetMapping(value = "/queryBy/{currentPage}/{eachPageNumber}")
	public ResultMessage queryBy(
			@ApiParam(value = "当前页", required = true, example = "0") @PathVariable("currentPage") int currentPage,
			@ApiParam(value = "每页条数", required = true, example = "10") @PathVariable("eachPageNumber") int eachPageNumber
	) throws BusinessException {
		return new ResultMessage(tCompanyService.queryBy(currentPage, eachPageNumber));
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
