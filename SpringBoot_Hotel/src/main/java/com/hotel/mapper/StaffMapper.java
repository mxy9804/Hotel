package com.hotel.mapper;

import com.hotel.entity.Staff;
import com.hotel.entity.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    long countByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int deleteByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int deleteByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int insert(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int insertSelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    List<Staff> selectByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    Staff selectByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByPrimaryKeySelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_staff
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByPrimaryKey(Staff record);
}