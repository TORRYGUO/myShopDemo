package com.guo.client.model.commodity;

import java.io.Serializable;
import java.util.Date;

public class CommodityModelDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.commodity_id
     *
     * @mbg.generated
     */
    private String commodityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.commodity_model_id
     *
     * @mbg.generated
     */
    private String commodityModelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.commodity_model_name
     *
     * @mbg.generated
     */
    private String commodityModelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.commodity_model_info
     *
     * @mbg.generated
     */
    private String commodityModelInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.unit_price
     *
     * @mbg.generated
     */
    private Double unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_commodity_model.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_commodity_model
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.id
     *
     * @return the value of t_commodity_model.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.id
     *
     * @param id the value for t_commodity_model.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.commodity_id
     *
     * @return the value of t_commodity_model.commodity_id
     *
     * @mbg.generated
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.commodity_id
     *
     * @param commodityId the value for t_commodity_model.commodity_id
     *
     * @mbg.generated
     */
    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.commodity_model_id
     *
     * @return the value of t_commodity_model.commodity_model_id
     *
     * @mbg.generated
     */
    public String getCommodityModelId() {
        return commodityModelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.commodity_model_id
     *
     * @param commodityModelId the value for t_commodity_model.commodity_model_id
     *
     * @mbg.generated
     */
    public void setCommodityModelId(String commodityModelId) {
        this.commodityModelId = commodityModelId == null ? null : commodityModelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.commodity_model_name
     *
     * @return the value of t_commodity_model.commodity_model_name
     *
     * @mbg.generated
     */
    public String getCommodityModelName() {
        return commodityModelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.commodity_model_name
     *
     * @param commodityModelName the value for t_commodity_model.commodity_model_name
     *
     * @mbg.generated
     */
    public void setCommodityModelName(String commodityModelName) {
        this.commodityModelName = commodityModelName == null ? null : commodityModelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.commodity_model_info
     *
     * @return the value of t_commodity_model.commodity_model_info
     *
     * @mbg.generated
     */
    public String getCommodityModelInfo() {
        return commodityModelInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.commodity_model_info
     *
     * @param commodityModelInfo the value for t_commodity_model.commodity_model_info
     *
     * @mbg.generated
     */
    public void setCommodityModelInfo(String commodityModelInfo) {
        this.commodityModelInfo = commodityModelInfo == null ? null : commodityModelInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.unit_price
     *
     * @return the value of t_commodity_model.unit_price
     *
     * @mbg.generated
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.unit_price
     *
     * @param unitPrice the value for t_commodity_model.unit_price
     *
     * @mbg.generated
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.status
     *
     * @return the value of t_commodity_model.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.status
     *
     * @param status the value for t_commodity_model.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.create_time
     *
     * @return the value of t_commodity_model.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.create_time
     *
     * @param createTime the value for t_commodity_model.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_commodity_model.update_time
     *
     * @return the value of t_commodity_model.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_commodity_model.update_time
     *
     * @param updateTime the value for t_commodity_model.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}