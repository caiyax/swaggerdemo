package com.bupt.swagger.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户基本信息")
public class ApiInfo {

    @ApiModelProperty("url")
    private String url;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("项目")
    private String project;
}
