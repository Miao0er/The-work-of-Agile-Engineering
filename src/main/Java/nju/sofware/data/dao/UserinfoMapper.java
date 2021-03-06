package nju.sofware.data.dao;

import java.util.List;
import nju.sofware.data.dataobject.Userinfo;
import nju.sofware.data.dataobject.UserinfoExample;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    long countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    Userinfo selectByPrimaryKey(Integer id);
    
    /*
     * ��������
     * 2019/07/10
     * ��˶
     */
    List<Userinfo> selectAll();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Jul 10 17:14:07 CST 2019
     */
    int updateByPrimaryKey(Userinfo record);
}