package org.lanqiao.beans.pojo;

import java.util.Date;

/**
 * Database Table Remarks:
 *   区域字典表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ljy_area_dic
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LjyAreaDic {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   区域名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   区域编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.areaNo
     *
     * @mbg.generated
     */
    private String areano;

    /**
     * Database Column Remarks:
     *   父级区域
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.parent
     *
     * @mbg.generated
     */
    private Long parent;

    /**
     * Database Column Remarks:
     *   0:未激活 1:已激活
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.isActivated
     *
     * @mbg.generated
     */
    private Integer isactivated;

    /**
     * Database Column Remarks:
     *   是否是商圈(0:不是 1:是)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.isTradingArea
     *
     * @mbg.generated
     */
    private Integer istradingarea;

    /**
     * Database Column Remarks:
     *   (0:不是 1：是)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.isHot
     *
     * @mbg.generated
     */
    private Integer ishot;

    /**
     * Database Column Remarks:
     *   区域级别(0:国家级 1:省级 2:市级 3:县/区)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     * Database Column Remarks:
     *   1:国内 2：国外
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.isChina
     *
     * @mbg.generated
     */
    private Integer ischina;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.pinyin
     *
     * @mbg.generated
     */
    private String pinyin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.creationDate
     *
     * @mbg.generated
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.createdBy
     *
     * @mbg.generated
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.modifyDate
     *
     * @mbg.generated
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ljy_area_dic.modifiedBy
     *
     * @mbg.generated
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.id
     *
     * @return the value of ljy_area_dic.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.id
     *
     * @param id the value for ljy_area_dic.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.name
     *
     * @return the value of ljy_area_dic.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.name
     *
     * @param name the value for ljy_area_dic.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.areaNo
     *
     * @return the value of ljy_area_dic.areaNo
     *
     * @mbg.generated
     */
    public String getAreano() {
        return areano;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.areaNo
     *
     * @param areano the value for ljy_area_dic.areaNo
     *
     * @mbg.generated
     */
    public void setAreano(String areano) {
        this.areano = areano;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.parent
     *
     * @return the value of ljy_area_dic.parent
     *
     * @mbg.generated
     */
    public Long getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.parent
     *
     * @param parent the value for ljy_area_dic.parent
     *
     * @mbg.generated
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.isActivated
     *
     * @return the value of ljy_area_dic.isActivated
     *
     * @mbg.generated
     */
    public Integer getIsactivated() {
        return isactivated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.isActivated
     *
     * @param isactivated the value for ljy_area_dic.isActivated
     *
     * @mbg.generated
     */
    public void setIsactivated(Integer isactivated) {
        this.isactivated = isactivated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.isTradingArea
     *
     * @return the value of ljy_area_dic.isTradingArea
     *
     * @mbg.generated
     */
    public Integer getIstradingarea() {
        return istradingarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.isTradingArea
     *
     * @param istradingarea the value for ljy_area_dic.isTradingArea
     *
     * @mbg.generated
     */
    public void setIstradingarea(Integer istradingarea) {
        this.istradingarea = istradingarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.isHot
     *
     * @return the value of ljy_area_dic.isHot
     *
     * @mbg.generated
     */
    public Integer getIshot() {
        return ishot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.isHot
     *
     * @param ishot the value for ljy_area_dic.isHot
     *
     * @mbg.generated
     */
    public void setIshot(Integer ishot) {
        this.ishot = ishot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.level
     *
     * @return the value of ljy_area_dic.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.level
     *
     * @param level the value for ljy_area_dic.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.isChina
     *
     * @return the value of ljy_area_dic.isChina
     *
     * @mbg.generated
     */
    public Integer getIschina() {
        return ischina;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.isChina
     *
     * @param ischina the value for ljy_area_dic.isChina
     *
     * @mbg.generated
     */
    public void setIschina(Integer ischina) {
        this.ischina = ischina;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.pinyin
     *
     * @return the value of ljy_area_dic.pinyin
     *
     * @mbg.generated
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.pinyin
     *
     * @param pinyin the value for ljy_area_dic.pinyin
     *
     * @mbg.generated
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.creationDate
     *
     * @return the value of ljy_area_dic.creationDate
     *
     * @mbg.generated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.creationDate
     *
     * @param creationdate the value for ljy_area_dic.creationDate
     *
     * @mbg.generated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.createdBy
     *
     * @return the value of ljy_area_dic.createdBy
     *
     * @mbg.generated
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.createdBy
     *
     * @param createdby the value for ljy_area_dic.createdBy
     *
     * @mbg.generated
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.modifyDate
     *
     * @return the value of ljy_area_dic.modifyDate
     *
     * @mbg.generated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.modifyDate
     *
     * @param modifydate the value for ljy_area_dic.modifyDate
     *
     * @mbg.generated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ljy_area_dic.modifiedBy
     *
     * @return the value of ljy_area_dic.modifiedBy
     *
     * @mbg.generated
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ljy_area_dic.modifiedBy
     *
     * @param modifiedby the value for ljy_area_dic.modifiedBy
     *
     * @mbg.generated
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}