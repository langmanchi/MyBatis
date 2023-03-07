package com.atguigu.mybatis.mapper;

public interface UserMapper {

    /**
     * MyBatis面向接口编程的两个一直
     * 1 映射文件namespace 与mapper接口的全类名保持一致
     * 2 映射文件中SQL语句的id和mapper接口中的方法名一直
     *
     * 表--实体类--mapper接口--映射文件
     */
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();
}
