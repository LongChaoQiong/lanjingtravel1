package org.lanqiao.beans.pojo;

import java.util.Date;

/**
 * Database Table Remarks:
 *   图片表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ljy_image
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LjyImage {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   图片类型(0:酒店图片1:房间图片2:评论图片)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * Database Column Remarks:
     *   关联id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.targetId
     *
     * @mbg.generated
     */
    private Long targetid;

    /**
     * Database Column Remarks:
     *   图片s上传顺序位置
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.position
     *
     * @mbg.generated
     */
    private Integer position;

    /**
     * Database Column Remarks:
     *   图片地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.imgUrl
     *
     * @mbg.generated
     */
    private String imgurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.creationDate
     *
     * @mbg.generated
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.createdBy
     *
     * @mbg.generated
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.modifyDate
     *
     * @mbg.generated
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_image.modifiedBy
     *
     * @mbg.generated
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.id
     *
     * @return the value of ljy_image.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.id
     *
     * @param id the value for ljy_image.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.type
     *
     * @return the value of ljy_image.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.type
     *
     * @param type the value for ljy_image.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.targetId
     *
     * @return the value of ljy_image.targetId
     *
     * @mbg.generated
     */
    public Long getTargetid() {
        return targetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.targetId
     *
     * @param targetid the value for ljy_image.targetId
     *
     * @mbg.generated
     */
    public void setTargetid(Long targetid) {
        this.targetid = targetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.position
     *
     * @return the value of ljy_image.position
     *
     * @mbg.generated
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.position
     *
     * @param position the value for ljy_image.position
     *
     * @mbg.generated
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.imgUrl
     *
     * @return the value of ljy_image.imgUrl
     *
     * @mbg.generated
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.imgUrl
     *
     * @param imgurl the value for ljy_image.imgUrl
     *
     * @mbg.generated
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.creationDate
     *
     * @return the value of ljy_image.creationDate
     *
     * @mbg.generated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.creationDate
     *
     * @param creationdate the value for ljy_image.creationDate
     *
     * @mbg.generated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.createdBy
     *
     * @return the value of ljy_image.createdBy
     *
     * @mbg.generated
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.createdBy
     *
     * @param createdby the value for ljy_image.createdBy
     *
     * @mbg.generated
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.modifyDate
     *
     * @return the value of ljy_image.modifyDate
     *
     * @mbg.generated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.modifyDate
     *
     * @param modifydate the value for ljy_image.modifyDate
     *
     * @mbg.generated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_image.modifiedBy
     *
     * @return the value of ljy_image.modifiedBy
     *
     * @mbg.generated
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_image.modifiedBy
     *
     * @param modifiedby the value for ljy_image.modifiedBy
     *
     * @mbg.generated
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}