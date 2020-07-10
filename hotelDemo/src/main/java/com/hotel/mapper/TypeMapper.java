package com.hotel.mapper;

import com.hotel.entity.Type;
import com.hotel.entity.TypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    long countByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int deleteByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int deleteByPrimaryKey(Integer typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int insert(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int insertSelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    List<Type> selectByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    Type selectByPrimaryKey(Integer typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByPrimaryKeySelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    int updateByPrimaryKey(Type record);
}