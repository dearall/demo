package test.model;

import java.util.Date;
import org.sansovo.simple.model.BaseEntity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role
 */
public class SysRole extends BaseEntity {
    /**
     * 角色名
     * role_name
     */
    private String roleName;

    /**
     * 有效标志
     * enabled
     */
    private Integer enabled;

    /**
     * 创建人
     * create_by
     */
    private Long createBy;

    /**
     * 创建时间
     * create_time
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_name
     *
     * @return the value of sys_role.role_name
     *
     * @mbg.generated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_name
     *
     * @param roleName the value for sys_role.role_name
     *
     * @mbg.generated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.enabled
     *
     * @return the value of sys_role.enabled
     *
     * @mbg.generated
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.enabled
     *
     * @param enabled the value for sys_role.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_by
     *
     * @return the value of sys_role.create_by
     *
     * @mbg.generated
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_by
     *
     * @param createBy the value for sys_role.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_time
     *
     * @param createTime the value for sys_role.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}