package com.hisun.lemon.pwm.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 提现结果处理：等待异步通知，传输对象
 * @author leon
 * @date 2017/7/17
 * @time 15:43
 */
@ApiModel("提现结果处理")
public class WithdrawResultDTO {

    //提现订单号
	@ApiModelProperty(name = "orderNo", value = "提现订单号")
    @NotEmpty(message="PWM10005")
	@Length(max=32)
    private String orderNo;
    //实际提现金额
	@ApiModelProperty(name = "wcActAmt", value = "实际提现金额")
    @Min(value=0, message="PWM10026")
    private BigDecimal wcActAmt;
    //资金流出模块订单号
	@ApiModelProperty(name = "rspOrderNo", value = "资金流出模块订单号")
    private String rspOrderNo;
    //记账时间
	@ApiModelProperty(name = "acTm", value = "记账时间")
    private LocalDate acTm;
    //提现状态
    @ApiModelProperty(name = "orderStatus", value = "提现状态  F1：失败")
    @NotEmpty(message="PWM10009")
    private String orderStatus;
    //银行卡后四位
    @ApiModelProperty(name = "cardNoLast", value = "银行卡后四位")
    @NotEmpty(message="PWM10048")
    private String cardNoLast;

    @ApiModelProperty(name = "wcRemark", value = "备注")
    private String wcRemark;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getWcActAmt() {
        return wcActAmt;
    }

    public void setWcActAmt(BigDecimal wcActAmt) {
        this.wcActAmt = wcActAmt;
    }

    public String getRspOrderNo() {
        return rspOrderNo;
    }

    public void setRspOrderNo(String rspOrderNo) {
        this.rspOrderNo = rspOrderNo;
    }

    public LocalDate getAcTm() {
        return acTm;
    }

    public void setAcTm(LocalDate acTm) {
        this.acTm = acTm;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCardNoLast() {
        return cardNoLast;
    }

    public void setCardNoLast(String cardNoLast) {
        this.cardNoLast = cardNoLast;
    }

    public String getWcRemark() {
        return wcRemark;
    }

    public void setWcRemark(String wcRemark) {
        this.wcRemark = wcRemark;
    }
}
