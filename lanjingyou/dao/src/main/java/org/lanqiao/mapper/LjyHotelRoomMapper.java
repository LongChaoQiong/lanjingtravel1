package org.lanqiao.mapper;

import java.util.List;
import org.lanqiao.beans.pojo.LjyHotelRoom;

public interface LjyHotelRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_room
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_room
     *
     * @mbg.generated
     */
    int insert(LjyHotelRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_room
     *
     * @mbg.generated
     */
    LjyHotelRoom selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_room
     *
     * @mbg.generated
     */
    List<LjyHotelRoom> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ljy_hotel_room
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LjyHotelRoom record);
}