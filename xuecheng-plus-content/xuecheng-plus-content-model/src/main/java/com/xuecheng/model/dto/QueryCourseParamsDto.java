package com.xuecheng.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @PROJECT_NAME: xuecheng-plus-project0218
 * @DESCRIPTION:
 * @USER: dxh
 * @DATE: 2023/2/18 21:35
 */
@Data
@ToString
public class QueryCourseParamsDto {
	//审核状态
	@ApiModelProperty("审核状态")
	private String auditStatus;
	//课程名称
	@ApiModelProperty("课程名称")
	private String courseName;
	//发布状态
	@ApiModelProperty("发布状态")
	private String publishStatus;

}
