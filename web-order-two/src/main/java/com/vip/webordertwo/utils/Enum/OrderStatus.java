package com.vip.webordertwo.utils.Enum;

import com.baomidou.mybatisplus.extension.api.R;

/**
 * @author Tang
 */

public enum OrderStatus {
//    0:未审核或发起交易;
//    1:交易完成;
//    20:买家申请退款;
//    30:卖家发货,没收货;
//    31 买家发货,没收获;
//    24 卖家拒绝
//    34:买家退货中;
//    40:交易取消;
//    55:客户退货

    DEAL(0),
    FULFILL(1),
    APPLY_FORRE_FUND(20),
    VENDOY_RETUSE(24),
    DELIVER_GOODS_VENDOY(30),
    DELIVER_GOODS_BUYES(31),
    BUYES_RETURNSING(34),
    DEAL_CANCEL(40),
    BUYES_RETURNS(55);

    private int code;

    public int getCode(){
        return code;
    }
    OrderStatus(int code) {
        this.code = code;
    }


}
