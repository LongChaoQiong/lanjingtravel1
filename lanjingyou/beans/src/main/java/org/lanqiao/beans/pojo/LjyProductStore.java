package org.lanqiao.beans.pojo;

import java.util.Date;

/**
 * Database Table Remarks:
 *   原始库存表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ljy_product_store
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LjyProductStore {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.productType
     *
     * @mbg.generated
     */
    private Integer producttype;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.productId
     *
     * @mbg.generated
     */
    private Long productid;

    /**
     * Database Column Remarks:
     *   商品库存
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.store
     *
     * @mbg.generated
     */
    private Integer store;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.creationDate
     *
     * @mbg.generated
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.createdBy
     *
     * @mbg.generated
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.modifyDate
     *
     * @mbg.generated
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_product_store.modifiedBy
     *
     * @mbg.generated
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.id
     *
     * @return the value of ljy_product_store.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.id
     *
     * @param id the value for ljy_product_store.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.productType
     *
     * @return the value of ljy_product_store.productType
     *
     * @mbg.generated
     */
    public Integer getProducttype() {
        return producttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.productType
     *
     * @param producttype the value for ljy_product_store.productType
     *
     * @mbg.generated
     */
    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.productId
     *
     * @return the value of ljy_product_store.productId
     *
     * @mbg.generated
     */
    public Long getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.productId
     *
     * @param productid the value for ljy_product_store.productId
     *
     * @mbg.generated
     */
    public void setProductid(Long productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.store
     *
     * @return the value of ljy_product_store.store
     *
     * @mbg.generated
     */
    public Integer getStore() {
        return store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.store
     *
     * @param store the value for ljy_product_store.store
     *
     * @mbg.generated
     */
    public void setStore(Integer store) {
        this.store = store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.creationDate
     *
     * @return the value of ljy_product_store.creationDate
     *
     * @mbg.generated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.creationDate
     *
     * @param creationdate the value for ljy_product_store.creationDate
     *
     * @mbg.generated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.createdBy
     *
     * @return the value of ljy_product_store.createdBy
     *
     * @mbg.generated
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.createdBy
     *
     * @param createdby the value for ljy_product_store.createdBy
     *
     * @mbg.generated
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.modifyDate
     *
     * @return the value of ljy_product_store.modifyDate
     *
     * @mbg.generated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.modifyDate
     *
     * @param modifydate the value for ljy_product_store.modifyDate
     *
     * @mbg.generated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_product_store.modifiedBy
     *
     * @return the value of ljy_product_store.modifiedBy
     *
     * @mbg.generated
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_product_store.modifiedBy
     *
     * @param modifiedby the value for ljy_product_store.modifiedBy
     *
     * @mbg.generated
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}