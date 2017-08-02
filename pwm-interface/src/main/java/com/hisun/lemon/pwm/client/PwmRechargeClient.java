package com.hisun.lemon.pwm.client;

import com.hisun.lemon.framework.data.GenericRspDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hisun.lemon.framework.data.GenericDTO;
import com.hisun.lemon.pwm.dto.RechargeResultDTO;

/**
 * 充提  充值服务接口
 * @author tone
 * @date 2017年6月27日
 * @time 下午3:06:23
 *
 */
@FeignClient("PWM")
public interface PwmRechargeClient {
	/**
     * 充值结果通知
     * @param rechargeResultDTO 通知数据
     * @return
     */
    @PatchMapping("/pwm/recharge/result")
    public GenericRspDTO rechargeNotify(@Validated @RequestBody GenericDTO<RechargeResultDTO> rechargeResultDTO);
    
	/**
	 * 海币充值结果通知
	 * 
	 * @param genericResultDTO
	 * @return
	 */
	@PatchMapping("/pwm/recharge/result/sea")
	public GenericRspDTO completeSeaOrder(@Validated @RequestBody GenericDTO<RechargeResultDTO> genericResultDTO);
}
