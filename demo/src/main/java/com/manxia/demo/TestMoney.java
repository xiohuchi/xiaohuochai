package com.manxia.demo;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.thread.ThreadUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 * @author 杨滨
 * @date 2022年07月05日
 */
public class TestMoney {
    public static void main(String[] args) {
        Date start = DateUtil.parse("2022-06-23");
        // 6月29日 2900
        // 6月23日 工行20万 0.04年利
        // 6月23日 20万 0.035年利

        double sGongHang = 20 * 10000 * 0.04 / 365 / 24 / 60 / 60;
        double sYou = 20 * 10000 * 0.035 / 365 / 24 / 60 / 60;

        while (true) {
            long between = DateUtil.between(start, new Date(), DateUnit.SECOND);
            String time = DateUtil.format(new Date(), "yyyy-MM-dd HH:mm");
            System.out.println("于2022-06-23借工行20万0.04年利，你20万0.035年利，截止到"+time+"，利息如下：");
            System.out.println(time + "工行利息：" + BigDecimal.valueOf(sGongHang * between).setScale(3, RoundingMode.HALF_UP));
            System.out.println(time + "你的利息：" + BigDecimal.valueOf(sYou * between).setScale(3, RoundingMode.HALF_UP));
            ThreadUtil.safeSleep(1000 * 60);
            
        }
    }
}
