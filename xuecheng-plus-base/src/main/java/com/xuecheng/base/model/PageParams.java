package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @PROJECT_NAME: xuecheng-plus-project0218
 * @DESCRIPTION:
 * @USER: dxh
 * @DATE: 2023/2/18 21:31
 */
@Data
@ToString
public class PageParams {
	//当前页码默认值
	@ApiModelProperty("默认当前页码")
	public static final long DEFAULT_PAGE_CURRENT = 1L;
	//每页记录数默认值
	@ApiModelProperty("每页记录数默认值")
	public static final long DEFAULT_PAGE_SIZE = 10L;

	//当前页码
	@ApiModelProperty("当前页码")
	private Long pageNo = DEFAULT_PAGE_CURRENT;
	//每页记录数默认值
	@ApiModelProperty("页大小")
	private Long pageSize = DEFAULT_PAGE_SIZE;
	public PageParams(){
	}
	public PageParams(long pageNo,long pageSize){
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}

}
