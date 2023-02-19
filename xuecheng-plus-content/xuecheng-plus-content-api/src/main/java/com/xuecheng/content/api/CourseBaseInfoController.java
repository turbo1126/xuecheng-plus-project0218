package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import com.xuecheng.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @PROJECT_NAME: xuecheng-plus-project0218
 * @DESCRIPTION:
 * @USER: dxh
 * @DATE: 2023/2/18 21:48
 */
@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
public class CourseBaseInfoController {
	@ApiOperation("课程查询接口")
	@PostMapping("/course/list")
	public PageResult<CourseBase> list(PageParams pageParams,@RequestBody QueryCourseParamsDto queryCourseParamsDto){
		//pageParams分页参数通过url的key/value传入，queryCourseParams通过json数据传入，
		// 使用@RequestBody注解将json转成QueryCourseParamsDto对象。
		CourseBase courseBase = new CourseBase();
		courseBase.setName("测试名称666");
		courseBase.setCreateDate(LocalDateTime.now());
		ArrayList<CourseBase> courseBases = new ArrayList<>();
		courseBases.add(courseBase);
		PageResult<CourseBase> pageResult = new PageResult<>(courseBases, 10, 1, 10);
		return pageResult;
	}
}
