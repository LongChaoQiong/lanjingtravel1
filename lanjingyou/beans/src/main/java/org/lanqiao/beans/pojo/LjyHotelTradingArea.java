package org.lanqiao.beans.pojo;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ljy_hotel_trading_area
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LjyHotelTradingArea {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_trading_area.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   酒店id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_trading_area.hotelId
     *
     * @mbg.generated
     */
    private Long hotelid;

    /**
     * Database Column Remarks:
     *   商圈id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_trading_area.areaId
     *
     * @mbg.generated
     */
    private Long areaid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_trading_area.creationDate
     *
     * @mbg.generated
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_trading_area.createdBy
     *
     * @mbg.generated
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_trading_area.modifyDate
     *
     * @mbg.generated
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_trading_area.modifiedBy
     *
     * @mbg.generated
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_trading_area.id
     *
     * @return the value of ljy_hotel_trading_area.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_trading_area.id
     *
     * @param id the value for ljy_hotel_trading_area.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_trading_area.hotelId
     *
     * @return the value of ljy_hotel_trading_area.hotelId
     *
     * @mbg.generated
     */
    public Long getHotelid() {
        return hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_trading_area.hotelId
     *
     * @param hotelid the value for ljy_hotel_trading_area.hotelId
     *
     * @mbg.generated
     */
    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_trading_area.areaId
     *
     * @return the value of ljy_hotel_trading_area.areaId
     *
     * @mbg.generated
     */
    public Long getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_trading_area.areaId
     *
     * @param areaid the value for ljy_hotel_trading_area.areaId
     *
     * @mbg.generated
     */
    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_trading_area.creationDate
     *
     * @return the value of ljy_hotel_trading_area.creationDate
     *
     * @mbg.generated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_trading_area.creationDate
     *
     * @param creationdate the value for ljy_hotel_trading_area.creationDate
     *
     * @mbg.generated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_trading_area.createdBy
     *
     * @return the value of ljy_hotel_trading_area.createdBy
     *
     * @mbg.generated
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_trading_area.createdBy
     *
     * @param createdby the value for ljy_hotel_trading_area.createdBy
     *
     * @mbg.generated
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_trading_area.modifyDate
     *
     * @return the value of ljy_hotel_trading_area.modifyDate
     *
     * @mbg.generated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_trading_area.modifyDate
     *
     * @param modifydate the value for ljy_hotel_trading_area.modifyDate
     *
     * @mbg.generated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_trading_area.modifiedBy
     *
     * @return the value of ljy_hotel_trading_area.modifiedBy
     *
     * @mbg.generated
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_trading_area.modifiedBy
     *
     * @param modifiedby the value for ljy_hotel_trading_area.modifiedBy
     *
     * @mbg.generated
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}