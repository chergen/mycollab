package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.ContactLead;
import com.mycollab.module.crm.domain.ContactLeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ContactLeadMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    long countByExample(ContactLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int deleteByExample(ContactLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Delete({
        "delete from m_crm_contacts_leads",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Insert({
        "insert into m_crm_contacts_leads (id, contactId, ",
        "leadId, isConvertRel)",
        "values (#{id,jdbcType=INTEGER}, #{contactid,jdbcType=INTEGER}, ",
        "#{leadid,jdbcType=INTEGER}, #{isconvertrel,jdbcType=BIT})"
    })
    int insert(ContactLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int insertSelective(ContactLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    List<ContactLead> selectByExample(ContactLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Select({
        "select",
        "id, contactId, leadId, isConvertRel",
        "from m_crm_contacts_leads",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.ContactLeadMapper.BaseResultMap")
    ContactLead selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int updateByExampleSelective(@Param("record") ContactLead record, @Param("example") ContactLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int updateByExample(@Param("record") ContactLead record, @Param("example") ContactLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int updateByPrimaryKeySelective(ContactLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Update({
        "update m_crm_contacts_leads",
        "set contactId = #{contactid,jdbcType=INTEGER},",
          "leadId = #{leadid,jdbcType=INTEGER},",
          "isConvertRel = #{isconvertrel,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ContactLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    Integer insertAndReturnKey(ContactLead value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contacts_leads
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    void massUpdateWithSession(@Param("record") ContactLead record, @Param("primaryKeys") List primaryKeys);
}