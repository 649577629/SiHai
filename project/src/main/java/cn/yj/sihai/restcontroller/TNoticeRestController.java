package cn.yj.sihai.restcontroller;

import cn.yj.bean.bo.BusinessException;
import cn.yj.bean.dto.ResultMessage;
import cn.yj.bean.dto.TNoticeDTO;
import cn.yj.sihai.service.TNoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/** 表_公告 RestController */
@Api(tags = "表_公告 RestController")
@RestController
@RequestMapping(value = "/Notice", produces = MediaType.APPLICATION_JSON_VALUE)
public class TNoticeRestController {

	/** 表_公告 Service */
	@Resource
	private TNoticeService tNoticeService;

	//------------------------------------------------------------------------------------------------------------------基础方法
	/**
	 * 新增 表_公告
	 * 
	 * @param dto 表_公告 DTO
	 * @return code=200 成功 | code=1 失败
	 */
	@ApiOperation(value = "新增 表_公告", notes = "入参 TNoticeDTO 表_公告 对象 进行新增则无需传入主键")
	@PostMapping(value = "/insert")
	public ResultMessage insert(
			@ApiParam(value = "表_公告 DTO", required = true) TNoticeDTO dto
	) throws BusinessException {
		return tNoticeService.insert(dto.toBO());
	}

	/**
	 * 修改 表_公告
	 * 
	 * @param dto 表_公告 DTO
	 * @return code=200 成功 | code=1 失败
	 */
	@ApiOperation(value = "修改 表_公告", notes = "入参 TNoticeDTO 表_公告 对象 进行修改则传入对应主键 )")
	@PostMapping(value = "/update")
	public ResultMessage update(
			@ApiParam(value = "表_公告 DTO", required = true) TNoticeDTO dto
	) throws BusinessException {
		return tNoticeService.update(dto.toBO());
	}

	/**
	 * 根据主键删除 表_公告
	 * 
	 * @param keyID 表_公告 需删除主键
	 * @return code=200 成功 | code=500 失败
	 */
	@ApiOperation(value = "根据主键删除 表_公告 对象", notes = "入参 keyID 需删除主键值 进行删除操作")
	@DeleteMapping(value = "/deleteById/{keyID}")
	public ResultMessage deleteById(
			@ApiParam(value = "主键值", required = true) @PathVariable("keyID") String keyID
	) throws BusinessException {
		tNoticeService.deleteById(keyID);
		return new ResultMessage("删除成功!");
	}

	/**
	 * 根据主键查询 表_公告
	 * 
	 * @param keyID 表_公告 需查询主键
	 * @return 表_公告 对象
	 */
	@ApiOperation(value = "根据主键查询 表_公告 对象", notes = "入参 keyID 需查询主键 进行查询操作")
	@GetMapping(value = "/getByID/{keyID}")
	public ResultMessage getByID(
			@ApiParam(value = "主键值", required = true) @PathVariable("keyID") String keyID
	) throws BusinessException {
		return new ResultMessage(TNoticeDTO.toDTO(tNoticeService.getByID(keyID)));
	}

	/**
	 * 分页查询 表_公告 集合 
	 * 
	 * @param currentPage 当前页数
	 * @param eachPageNumber 每页条数
	 * @return 表_公告 集合
	 */
	@ApiOperation(value = "分页查询 表_公告 集合 ", notes = "入参 currentPage 当前页 | eachPageNumber 每页条数 进行分页查询操作")
	@GetMapping(value = "/queryBy/{currentPage}/{eachPageNumber}")
	public ResultMessage queryBy(
			@ApiParam(value = "当前页", required = true, example = "0") @PathVariable("currentPage") int currentPage,
			@ApiParam(value = "每页条数", required = true, example = "10") @PathVariable("eachPageNumber") int eachPageNumber
	) throws BusinessException {
		return new ResultMessage(tNoticeService.queryBy(currentPage, eachPageNumber));
	}

	//------------------------------------------------------------------------------------------------------------------自定义方法

}
