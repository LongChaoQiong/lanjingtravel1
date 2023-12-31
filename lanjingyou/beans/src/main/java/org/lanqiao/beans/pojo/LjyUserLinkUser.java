package org.lanqiao.beans.pojo;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ljy_user_link_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LjyUserLinkUser {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   常用联系人姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.linkUserName
     *
     * @mbg.generated
     */
    private String linkusername;

    /**
     * Database Column Remarks:
     *   证件号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.linkIdCard
     *
     * @mbg.generated
     */
    private String linkidcard;

    /**
     * Database Column Remarks:
     *   常用联系人电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.linkPhone
     *
     * @mbg.generated
     */
    private String linkphone;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.userId
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.creationDate
     *
     * @mbg.generated
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.createdBy
     *
     * @mbg.generated
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.modifyDate
     *
     * @mbg.generated
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.modifiedBy
     *
     * @mbg.generated
     */
    private Long modifiedby;

    /**
     * Database Column Remarks:
     *   证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_user_link_user.linkIdCardType
     *
     * @mbg.generated
     */
    private Integer linkidcardtype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.id
     *
     * @return the value of ljy_user_link_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.id
     *
     * @param id the value for ljy_user_link_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.linkUserName
     *
     * @return the value of ljy_user_link_user.linkUserName
     *
     * @mbg.generated
     */
    public String getLinkusername() {
        return linkusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.linkUserName
     *
     * @param linkusername the value for ljy_user_link_user.linkUserName
     *
     * @mbg.generated
     */
    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.linkIdCard
     *
     * @return the value of ljy_user_link_user.linkIdCard
     *
     * @mbg.generated
     */
    public String getLinkidcard() {
        return linkidcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.linkIdCard
     *
     * @param linkidcard the value for ljy_user_link_user.linkIdCard
     *
     * @mbg.generated
     */
    public void setLinkidcard(String linkidcard) {
        this.linkidcard = linkidcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.linkPhone
     *
     * @return the value of ljy_user_link_user.linkPhone
     *
     * @mbg.generated
     */
    public String getLinkphone() {
        return linkphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.linkPhone
     *
     * @param linkphone the value for ljy_user_link_user.linkPhone
     *
     * @mbg.generated
     */
    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.userId
     *
     * @return the value of ljy_user_link_user.userId
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.userId
     *
     * @param userid the value for ljy_user_link_user.userId
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.creationDate
     *
     * @return the value of ljy_user_link_user.creationDate
     *
     * @mbg.generated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.creationDate
     *
     * @param creationdate the value for ljy_user_link_user.creationDate
     *
     * @mbg.generated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.createdBy
     *
     * @return the value of ljy_user_link_user.createdBy
     *
     * @mbg.generated
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.createdBy
     *
     * @param createdby the value for ljy_user_link_user.createdBy
     *
     * @mbg.generated
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.modifyDate
     *
     * @return the value of ljy_user_link_user.modifyDate
     *
     * @mbg.generated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.modifyDate
     *
     * @param modifydate the value for ljy_user_link_user.modifyDate
     *
     * @mbg.generated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.modifiedBy
     *
     * @return the value of ljy_user_link_user.modifiedBy
     *
     * @mbg.generated
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.modifiedBy
     *
     * @param modifiedby the value for ljy_user_link_user.modifiedBy
     *
     * @mbg.generated
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_user_link_user.linkIdCardType
     *
     * @return the value of ljy_user_link_user.linkIdCardType
     *
     * @mbg.generated
     */
    public Integer getLinkidcardtype() {
        return linkidcardtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_user_link_user.linkIdCardType
     *
     * @param linkidcardtype the value for ljy_user_link_user.linkIdCardType
     *
     * @mbg.generated
     */
    public void setLinkidcardtype(Integer linkidcardtype) {
        this.linkidcardtype = linkidcardtype;
    }
}