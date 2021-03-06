package test.model;

import org.sansovo.simple.model.BaseEntity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role_privilege
 */
public class SysRolePrivilege extends BaseEntity {
    /**
     * 角色ID
     * role_id
     */
    private Long roleId;

    /**
     * 权限ID
     * privilege_id
     */
    private Long privilegeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_privilege.role_id
     *
     * @return the value of sys_role_privilege.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_privilege.role_id
     *
     * @param roleId the value for sys_role_privilege.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_privilege.privilege_id
     *
     * @return the value of sys_role_privilege.privilege_id
     *
     * @mbg.generated
     */
    public Long getPrivilegeId() {
        return privilegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_privilege.privilege_id
     *
     * @param privilegeId the value for sys_role_privilege.privilege_id
     *
     * @mbg.generated
     */
    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}