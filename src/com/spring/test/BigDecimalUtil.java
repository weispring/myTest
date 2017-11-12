package com.spring.test;

import java.math.BigDecimal;

public class BigDecimalUtil {

    /**
     * 向上进位
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午3:06:55
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundUp(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_UP);
    }

    /**
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午5:18:41
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundDown(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_DOWN);
    }

    /**
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午5:18:44
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundCeiling(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_CEILING);
    }

    /**
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午5:18:47
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundFloor(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_FLOOR);
    }

    /**
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午5:18:50
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundHalfUp(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午5:18:53
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundHalfDown(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午5:18:56
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundHalfEven(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 
     * @author: Gao Peng
     * @date: 2016年6月21日 下午5:18:59
     * @param: @param
     *             newScale
     * @param: @param
     *             b
     * @param: @return
     * @return: BigDecimal
     */
    public static BigDecimal setScaleRoundUnnecessary(int newScale, BigDecimal b) {
        return b.setScale(newScale, BigDecimal.ROUND_UNNECESSARY);
    }

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("1.245");
        System.out.println("执行数值：" + b.toString());
        // 如果b为正数，则进行RoundUp操作，否则，RoundDown操作
        System.out.println("setScaleRoundCeiling:" + setScaleRoundCeiling(1, b));
        // 如果b为正数，则进行RoundDown操作，否则，RoundUp操作
        System.out.println("setScaleRoundFloor:" + setScaleRoundFloor(1, b));
        // 进位 向上取值
        System.out.println("setScaleRoundUp:" + setScaleRoundUp(1, b));
        // 截位 向下取值 
        System.out.println("setScaleRoundDown:" + setScaleRoundDown(1, b));
        // 四舍五入，截取小数 > .5 进位  看后面的哪一位的值 
        System.out.println("setScaleRoundHalfDown:" + setScaleRoundHalfDown(2, b));
        // 四舍五入，截取小数 >= .5 进位
        System.out.println("setScaleRoundHalfUp:" + setScaleRoundHalfUp(2, b));
        // 如果舍弃部分左边的数字为奇数，则作 ROUND_HALF_UP ；如果它为偶数，则作 ROUND_HALF_DOWN 。
        // 奇数/偶数根据舍弃位数后，数值的最后一位判断，比如4.123，保留1位，为4.1，则1是奇数
        System.out.println("setScaleRoundHalfEven:" + setScaleRoundHalfEven(2, b));
        // 该“伪舍入模式”实际是指明所要求的操作必须是精确的，，因此不需要舍入操作。
        System.out.println("setScaleRoundUnnecessary:" + setScaleRoundUnnecessary(3, b));
        
       System.err.println(BigDecimal.ZERO); 
    }
}
