package com.tencent.devops.dispatch.pojo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("DockerIpInfoVO")
data class DockerIpInfoVO(
    @ApiModelProperty("主键ID")
    val id: Long,
    @ApiModelProperty("构建机IP")
    val dockerIp: String,
    @ApiModelProperty("构建机PORT")
    val dockerHostPort: Int,
    @ApiModelProperty("构建机容量")
    val capacity: Int,
    @ApiModelProperty("构建机已使用量")
    val usedNum: Int,
    @ApiModelProperty("构建机CPU负载")
    val averageCpuLoad: Int,
    @ApiModelProperty("构建机内存负载")
    val averageMemLoad: Int,
    @ApiModelProperty("构建机硬盘负载")
    val averageDiskLoad: Int,
    @ApiModelProperty("构建机硬盘IO负载")
    val averageDiskIOLoad: Int,
    @ApiModelProperty("构建机是否可用")
    val enable: Boolean,
    @ApiModelProperty("是否为灰度节点", required = false)
    val grayEnv: Boolean?,
    @ApiModelProperty("是否为专用机独占", required = false)
    val specialOn: Boolean?,
    @ApiModelProperty("创建时间", required = false)
    val createTime: String?
)