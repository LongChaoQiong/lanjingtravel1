package org.lanqiao.mapper;

import java.util.List;
import org.lanqiao.beans.pojo.LjyHotelFeature;

public interface LjyHotelFeatureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_feature
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_feature
     *
     * @mbg.generated
     */
    int insert(LjyHotelFeature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_feature
     *
     * @mbg.generated
     */
    LjyHotelFeature selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_feature
     *
     * @mbg.generated
     */
    List<LjyHotelFeature> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_feature
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LjyHotelFeature record);
}