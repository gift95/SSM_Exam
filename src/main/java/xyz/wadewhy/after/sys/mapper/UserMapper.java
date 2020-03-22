package xyz.wadewhy.after.sys.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.wadewhy.after.sys.domain.User;
import xyz.wadewhy.after.sys.vo.UserVo;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * 保存用户
     * @param
     */
    int insertSelective(UserVo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);

    /**
     * @param username
     * @return
     */
    User queryUserByUserName(@Param("name") String username);


    int deleteRoleUserByRid(Integer rid);

    List<User> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);

    int add_role_user( @Param("rid") Integer rid,@Param("uid") Integer uid);

    int delete_role_user(Integer uid);

    List<Integer> queryUidByRid(@Param("rid") Integer roleId);

//根据uid删除role_user记录
    int deleteRoleUserByUid(@Param("value") String ids);

    int deleteUserByids(@Param("value") String ids);
}