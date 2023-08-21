package org.lanqiao.beans.pojo;

import java.util.Date;

/**
 * Database Table Remarks:
 *   订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ljy_trade_ends
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LjyTradeEnds {
    /**
     * Database Column Remarks:
     *   订单ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_trade_ends.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   订单编号(注意非支付宝交易编号tradeNo)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_trade_ends.orderNo
     *
     * @mbg.generated
     */
    private String orderno;

    /**
     * Database Column Remarks:
     *   标识字段(默认0：未处理；1：处理中)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_trade_ends.flag
     *
     * @mbg.generated
     */
    private Boolean flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_trade_ends.modifyDate
     *
     * @mbg.generated
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_trade_ends.modifiedBy
     *
     * @mbg.generated
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_trade_ends.id
     *
     * @return the value of ljy_trade_ends.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_trade_ends.id
     *
     * @param id the value for ljy_trade_ends.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_trade_ends.orderNo
     *
     * @return the value of ljy_trade_ends.orderNo
     *
     * @mbg.generated
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_trade_ends.orderNo
     *
     * @param orderno the value for ljy_trade_ends.orderNo
     *
     * @mbg.generated
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_trade_ends.flag
     *
     * @return the value of ljy_trade_ends.flag
     *
     * @mbg.generated
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_trade_ends.flag
     *
     * @param flag the value for ljy_trade_ends.flag
     *
     * @mbg.generated
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_trade_ends.modifyDate
     *
     * @return the value of ljy_trade_ends.modifyDate
     *
     * @mbg.generated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_trade_ends.modifyDate
     *
     * @param modifydate the value for ljy_trade_ends.modifyDate
     *
     * @mbg.generated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_trade_ends.modifiedBy
     *
     * @return the value of ljy_trade_ends.modifiedBy
     *
     * @mbg.generated
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_trade_ends.modifiedBy
     *
     * @param modifiedby the value for ljy_trade_ends.modifiedBy
     *
     * @mbg.generated
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}