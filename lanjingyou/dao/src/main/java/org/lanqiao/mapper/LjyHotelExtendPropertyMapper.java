package org.lanqiao.mapper;

import java.util.List;
import org.lanqiao.beans.pojo.LjyHotelExtendProperty;

public interface LjyHotelExtendPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_extend_property
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_extend_property
     *
     * @mbg.generated
     */
    int insert(LjyHotelExtendProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_extend_property
     *
     * @mbg.generated
     */
    LjyHotelExtendProperty selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_extend_property
     *
     * @mbg.generated
     */
    List<LjyHotelExtendProperty> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_extend_property
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LjyHotelExtendProperty record);
}