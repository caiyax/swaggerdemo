package com.bupt.swagger.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户基本信息")
public class User {

    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("地址")
    private String address;
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    @ApiModelProperty("邮箱")
    @NotNull
    private String email;

}