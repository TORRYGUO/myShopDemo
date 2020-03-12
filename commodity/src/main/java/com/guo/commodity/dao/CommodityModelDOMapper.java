package com.guo.commodity.dao;

import com.guo.client.model.commodity.CommodityModelDO;
import com.guo.client.model.commodity.CommodityModelDOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityModelDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    long countByExample(CommodityModelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int deleteByExample(CommodityModelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int insert(CommodityModelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int insertSelective(CommodityModelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    List<CommodityModelDO> selectByExample(CommodityModelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    CommodityModelDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CommodityModelDO record, @Param("example") CommodityModelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CommodityModelDO record, @Param("example") CommodityModelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CommodityModelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CommodityModelDO record);

    List<CommodityModelDO> queryAllModelByCommodityId(String commodityId);
}