package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @PROJECT_NAME: xuecheng-plus-project0218
 * @DESCRIPTION:
 * @USER: dxh
 * @DATE: 2023/2/18 21:42
 */
//针对分页查询结果经过分析也存在固定的数据和格式，
// 所以在base工程定义一个基础的模型类
@Data
@ToString
public class PageResult<T> implements Serializable {
	// 数据列表
	private List<T> items;
	//总记录数
	private long counts;
	//当前页码
	private long page;
	//每页记录数
	private long pageSize;
	public PageResult(List<T> items, long counts, long page, long pageSize) {
		this.items = items;
		this.counts = counts;
		this.page = page;
		this.pageSize = pageSize;
	}

}
