package org.lanqiao.mapper;

import java.util.List;
import org.lanqiao.beans.pojo.LjyImage;

public interface LjyImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_image
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_image
     *
     * @mbg.generated
     */
    int insert(LjyImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_image
     *
     * @mbg.generated
     */
    LjyImage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_image
     *
     * @mbg.generated
     */
    List<LjyImage> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_image
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LjyImage record);
}