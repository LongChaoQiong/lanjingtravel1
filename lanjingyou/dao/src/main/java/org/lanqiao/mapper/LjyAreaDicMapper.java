package org.lanqiao.mapper;

import java.util.List;
import org.lanqiao.beans.pojo.LjyAreaDic;

public interface LjyAreaDicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_area_dic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_area_dic
     *
     * @mbg.generated
     */
    int insert(LjyAreaDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_area_dic
     *
     * @mbg.generated
     */
    LjyAreaDic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_area_dic
     *
     * @mbg.generated
     */
    List<LjyAreaDic> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_area_dic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LjyAreaDic record);
}