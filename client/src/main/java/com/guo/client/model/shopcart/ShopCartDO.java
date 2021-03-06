package com.guo.client.model.shopcart;

import java.io.Serializable;
import java.util.Date;

public class ShopCartDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.cart_id
     *
     * @mbg.generated
     */
    private String cartId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.seller_id
     *
     * @mbg.generated
     */
    private String sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.commodity_id
     *
     * @mbg.generated
     */
    private String commodityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.commodity_model_id
     *
     * @mbg.generated
     */
    private String commodityModelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.total
     *
     * @mbg.generated
     */
    private Integer total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.unit_price
     *
     * @mbg.generated
     */
    private Double unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop_cart.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_shop_cart
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.id
     *
     * @return the value of t_shop_cart.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.id
     *
     * @param id the value for t_shop_cart.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.cart_id
     *
     * @return the value of t_shop_cart.cart_id
     *
     * @mbg.generated
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.cart_id
     *
     * @param cartId the value for t_shop_cart.cart_id
     *
     * @mbg.generated
     */
    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.user_id
     *
     * @return the value of t_shop_cart.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.user_id
     *
     * @param userId the value for t_shop_cart.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.seller_id
     *
     * @return the value of t_shop_cart.seller_id
     *
     * @mbg.generated
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.seller_id
     *
     * @param sellerId the value for t_shop_cart.seller_id
     *
     * @mbg.generated
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.commodity_id
     *
     * @return the value of t_shop_cart.commodity_id
     *
     * @mbg.generated
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.commodity_id
     *
     * @param commodityId the value for t_shop_cart.commodity_id
     *
     * @mbg.generated
     */
    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.commodity_model_id
     *
     * @return the value of t_shop_cart.commodity_model_id
     *
     * @mbg.generated
     */
    public String getCommodityModelId() {
        return commodityModelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.commodity_model_id
     *
     * @param commodityModelId the value for t_shop_cart.commodity_model_id
     *
     * @mbg.generated
     */
    public void setCommodityModelId(String commodityModelId) {
        this.commodityModelId = commodityModelId == null ? null : commodityModelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.total
     *
     * @return the value of t_shop_cart.total
     *
     * @mbg.generated
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.total
     *
     * @param total the value for t_shop_cart.total
     *
     * @mbg.generated
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.unit_price
     *
     * @return the value of t_shop_cart.unit_price
     *
     * @mbg.generated
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.unit_price
     *
     * @param unitPrice the value for t_shop_cart.unit_price
     *
     * @mbg.generated
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.status
     *
     * @return the value of t_shop_cart.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.status
     *
     * @param status the value for t_shop_cart.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.create_time
     *
     * @return the value of t_shop_cart.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.create_time
     *
     * @param createTime the value for t_shop_cart.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop_cart.update_time
     *
     * @return the value of t_shop_cart.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop_cart.update_time
     *
     * @param updateTime the value for t_shop_cart.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}