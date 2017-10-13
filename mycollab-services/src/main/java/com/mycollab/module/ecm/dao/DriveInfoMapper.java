package com.mycollab.module.ecm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.ecm.domain.DriveInfo;
import com.mycollab.module.ecm.domain.DriveInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface DriveInfoMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    long countByExample(DriveInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int deleteByExample(DriveInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int insert(DriveInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int insertSelective(DriveInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    List<DriveInfo> selectByExample(DriveInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    DriveInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int updateByExampleSelective(@Param("record") DriveInfo record, @Param("example") DriveInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int updateByExample(@Param("record") DriveInfo record, @Param("example") DriveInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int updateByPrimaryKeySelective(DriveInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    int updateByPrimaryKey(DriveInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    Integer insertAndReturnKey(DriveInfo value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_ecm_driveinfo
     *
     * @mbg.generated Fri Oct 13 12:37:28 ICT 2017
     */
    void massUpdateWithSession(@Param("record") DriveInfo record, @Param("primaryKeys") List primaryKeys);
}