package com.dmk.yx.vo.product;

import lombok.Data;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;

@Data
public class CategoryQueryVo {
	
	@ApiModelProperty(value = "分类名称")
	private String name;

}

