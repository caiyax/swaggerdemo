package com.bupt.swagger.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/*统一返回类*/
@Data
@ApiModel("返回结果")
public class GenericResult<T> {

    @ApiModelProperty("返回码")
    private int code;
    @ApiModelProperty("返回信息")
    private String msg;
    @ApiModelProperty("返回数据")
    private T data;
}
