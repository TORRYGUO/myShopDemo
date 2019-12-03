package com.guo.order.dao;

import com.guo.client.model.order.OrderDetailDO;
import com.guo.client.model.order.OrderDetailDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    long countByExample(OrderDetailDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int deleteByExample(OrderDetailDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int insert(OrderDetailDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int insertSelective(OrderDetailDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    List<OrderDetailDO> selectByExample(OrderDetailDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    OrderDetailDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrderDetailDO record, @Param("example") OrderDetailDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrderDetailDO record, @Param("example") OrderDetailDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderDetailDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderDetailDO record);

    int insertAll(@Param("orderDetails") List<OrderDetailDO> orderDetails);

    int deletAllByOrderId(String orderId);
}