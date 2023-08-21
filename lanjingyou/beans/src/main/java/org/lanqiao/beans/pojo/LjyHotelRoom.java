package org.lanqiao.beans.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   酒店房间表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ljy_hotel_room
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LjyHotelRoom {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   酒店ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.hotelId
     *
     * @mbg.generated
     */
    private Long hotelid;

    /**
     * Database Column Remarks:
     *   房间名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.roomTitle
     *
     * @mbg.generated
     */
    private String roomtitle;

    /**
     * Database Column Remarks:
     *   房间价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.roomPrice
     *
     * @mbg.generated
     */
    private BigDecimal roomprice;

    /**
     * Database Column Remarks:
     *   酒店床型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.roomBedTypeId
     *
     * @mbg.generated
     */
    private Long roombedtypeid;

    /**
     * Database Column Remarks:
     *   是否包含早餐
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.isHavingBreakfast
     *
     * @mbg.generated
     */
    private Integer ishavingbreakfast;

    /**
     * Database Column Remarks:
     *   1:在线付 2:到店付 3:不限
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.payType
     *
     * @mbg.generated
     */
    private Integer paytype;

    /**
     * Database Column Remarks:
     *   满意度（冗余字段，在用户评论后更新）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.satisfaction
     *
     * @mbg.generated
     */
    private Long satisfaction;

    /**
     * Database Column Remarks:
     *   是否可预订(0:不可以 1:可以)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.isBook
     *
     * @mbg.generated
     */
    private Integer isbook;

    /**
     * Database Column Remarks:
     *   是否可取消(0:不可 1:可以)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.isCancel
     *
     * @mbg.generated
     */
    private Integer iscancel;

    /**
     * Database Column Remarks:
     *   是否及时响应(0:不及时 1:及时)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.isTimelyResponse
     *
     * @mbg.generated
     */
    private Integer istimelyresponse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.creationDate
     *
     * @mbg.generated
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.createdBy
     *
     * @mbg.generated
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.modifyDate
     *
     * @mbg.generated
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_hotel_room.modifiedBy
     *
     * @mbg.generated
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.id
     *
     * @return the value of ljy_hotel_room.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.id
     *
     * @param id the value for ljy_hotel_room.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.hotelId
     *
     * @return the value of ljy_hotel_room.hotelId
     *
     * @mbg.generated
     */
    public Long getHotelid() {
        return hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.hotelId
     *
     * @param hotelid the value for ljy_hotel_room.hotelId
     *
     * @mbg.generated
     */
    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.roomTitle
     *
     * @return the value of ljy_hotel_room.roomTitle
     *
     * @mbg.generated
     */
    public String getRoomtitle() {
        return roomtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.roomTitle
     *
     * @param roomtitle the value for ljy_hotel_room.roomTitle
     *
     * @mbg.generated
     */
    public void setRoomtitle(String roomtitle) {
        this.roomtitle = roomtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.roomPrice
     *
     * @return the value of ljy_hotel_room.roomPrice
     *
     * @mbg.generated
     */
    public BigDecimal getRoomprice() {
        return roomprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.roomPrice
     *
     * @param roomprice the value for ljy_hotel_room.roomPrice
     *
     * @mbg.generated
     */
    public void setRoomprice(BigDecimal roomprice) {
        this.roomprice = roomprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.roomBedTypeId
     *
     * @return the value of ljy_hotel_room.roomBedTypeId
     *
     * @mbg.generated
     */
    public Long getRoombedtypeid() {
        return roombedtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.roomBedTypeId
     *
     * @param roombedtypeid the value for ljy_hotel_room.roomBedTypeId
     *
     * @mbg.generated
     */
    public void setRoombedtypeid(Long roombedtypeid) {
        this.roombedtypeid = roombedtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.isHavingBreakfast
     *
     * @return the value of ljy_hotel_room.isHavingBreakfast
     *
     * @mbg.generated
     */
    public Integer getIshavingbreakfast() {
        return ishavingbreakfast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.isHavingBreakfast
     *
     * @param ishavingbreakfast the value for ljy_hotel_room.isHavingBreakfast
     *
     * @mbg.generated
     */
    public void setIshavingbreakfast(Integer ishavingbreakfast) {
        this.ishavingbreakfast = ishavingbreakfast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.payType
     *
     * @return the value of ljy_hotel_room.payType
     *
     * @mbg.generated
     */
    public Integer getPaytype() {
        return paytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.payType
     *
     * @param paytype the value for ljy_hotel_room.payType
     *
     * @mbg.generated
     */
    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.satisfaction
     *
     * @return the value of ljy_hotel_room.satisfaction
     *
     * @mbg.generated
     */
    public Long getSatisfaction() {
        return satisfaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.satisfaction
     *
     * @param satisfaction the value for ljy_hotel_room.satisfaction
     *
     * @mbg.generated
     */
    public void setSatisfaction(Long satisfaction) {
        this.satisfaction = satisfaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.isBook
     *
     * @return the value of ljy_hotel_room.isBook
     *
     * @mbg.generated
     */
    public Integer getIsbook() {
        return isbook;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.isBook
     *
     * @param isbook the value for ljy_hotel_room.isBook
     *
     * @mbg.generated
     */
    public void setIsbook(Integer isbook) {
        this.isbook = isbook;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.isCancel
     *
     * @return the value of ljy_hotel_room.isCancel
     *
     * @mbg.generated
     */
    public Integer getIscancel() {
        return iscancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.isCancel
     *
     * @param iscancel the value for ljy_hotel_room.isCancel
     *
     * @mbg.generated
     */
    public void setIscancel(Integer iscancel) {
        this.iscancel = iscancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.isTimelyResponse
     *
     * @return the value of ljy_hotel_room.isTimelyResponse
     *
     * @mbg.generated
     */
    public Integer getIstimelyresponse() {
        return istimelyresponse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.isTimelyResponse
     *
     * @param istimelyresponse the value for ljy_hotel_room.isTimelyResponse
     *
     * @mbg.generated
     */
    public void setIstimelyresponse(Integer istimelyresponse) {
        this.istimelyresponse = istimelyresponse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.creationDate
     *
     * @return the value of ljy_hotel_room.creationDate
     *
     * @mbg.generated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.creationDate
     *
     * @param creationdate the value for ljy_hotel_room.creationDate
     *
     * @mbg.generated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.createdBy
     *
     * @return the value of ljy_hotel_room.createdBy
     *
     * @mbg.generated
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.createdBy
     *
     * @param createdby the value for ljy_hotel_room.createdBy
     *
     * @mbg.generated
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.modifyDate
     *
     * @return the value of ljy_hotel_room.modifyDate
     *
     * @mbg.generated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.modifyDate
     *
     * @param modifydate the value for ljy_hotel_room.modifyDate
     *
     * @mbg.generated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_hotel_room.modifiedBy
     *
     * @return the value of ljy_hotel_room.modifiedBy
     *
     * @mbg.generated
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_hotel_room.modifiedBy
     *
     * @param modifiedby the value for ljy_hotel_room.modifiedBy
     *
     * @mbg.generated
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}