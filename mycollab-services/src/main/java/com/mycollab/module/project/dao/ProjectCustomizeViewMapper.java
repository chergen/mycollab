package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.ProjectCustomizeView;
import com.mycollab.module.project.domain.ProjectCustomizeViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ProjectCustomizeViewMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    long countByExample(ProjectCustomizeViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int deleteByExample(ProjectCustomizeViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int insert(ProjectCustomizeView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int insertSelective(ProjectCustomizeView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    List<ProjectCustomizeView> selectByExample(ProjectCustomizeViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    ProjectCustomizeView selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int updateByExampleSelective(@Param("record") ProjectCustomizeView record, @Param("example") ProjectCustomizeViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int updateByExample(@Param("record") ProjectCustomizeView record, @Param("example") ProjectCustomizeViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int updateByPrimaryKeySelective(ProjectCustomizeView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    int updateByPrimaryKey(ProjectCustomizeView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    Integer insertAndReturnKey(ProjectCustomizeView value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Oct 13 12:37:25 ICT 2017
     */
    void massUpdateWithSession(@Param("record") ProjectCustomizeView record, @Param("primaryKeys") List primaryKeys);
}