package com.hisun.lemon.pwm.service.impl;

import com.hisun.lemon.common.exception.LemonException;
import com.hisun.lemon.pwm.dao.IWithdrawOrderDao;
import com.hisun.lemon.pwm.dto.WithdrawResultDTO;
import com.hisun.lemon.pwm.entity.WithdrawOrderDO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author leon
 * @date 2017/7/11
 * @time 11:28
 */
@Transactional
@Service
public class WithdrawOrderTransactionalService {

    @Resource
    private IWithdrawOrderDao withdrawOrderDao;

    /**
     *  将提现金额由账户转到提现银行卡
     */
    public void applyAmountTransfer(){

    }

    /**
     *  将提现金额由银行卡退回到账户
     */
    public void applyAmountBack(){

    }

    /**
     * 提现申请，生成订单
     * @param withdrawOrderDO
     */
    public void createOrder(WithdrawOrderDO withdrawOrderDO){

        int num = withdrawOrderDao.insert(withdrawOrderDO);
        if(num != 1){
            throw new LemonException("PWM0001");
        }
    }

    /**
     * 提现成功，更新提现单据信息
     */
    public void updateOrder(WithdrawResultDTO withdrawResultDTO){

        int num = withdrawOrderDao.update(withdrawResultDTO);
        if(num != 1){
            throw new LemonException("PWM0003");
        }
    }
}
