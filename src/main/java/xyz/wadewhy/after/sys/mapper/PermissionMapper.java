package xyz.wadewhy.after.sys.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.wadewhy.after.sys.domain.Permission;
import xyz.wadewhy.after.sys.domain.Role_Permission;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    Permission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Permission record);
    /**
     * @param userId
     * @return
     */
    List<Permission> queryPermissionByUserId(Integer userId);

    /**
     * id=pid查询权限
     * @param pids
     * @return
     */
    List<Permission> queryPIdById(@Param("type") String type,@Param("pid") Set<Integer> pids);
//    List<Permission> queryPIdById(@Param("pid") Set<Integer> pids);

    /**
     * 查询顶层菜单
     * @return
     */
    List<Permission> findTopList();

    List<Permission> queryMenuById(@Param("pid") Set<Integer> pids);

    List<Role_Permission> queryRole_Permissions(@Param("rid") Integer rid);

    int deleteByRoleId(Integer rid);

    int add(Role_Permission role_permission);

    List<Integer> findRolePermissionByPid(Integer pid);



//    List<Permission> queryPermissionByIds(@Param("id") List<Integer> perId);
}