package com.java110.community.dao;


import com.java110.common.exception.DAOException;

import java.util.List;
import java.util.Map;

/**
 * 小区单元组件内部之间使用，没有给外围系统提供服务能力
 * 小区单元服务接口类，要求全部以字符串传输，方便微服务化
 * 新建客户，修改客户，删除客户，查询客户等功能
 * <p>
 * Created by wuxw on 2016/12/27.
 */
public interface IUnitServiceDao {

    /**
     * 保存 小区单元信息
     *
     * @param businessUnitInfo 小区单元信息 封装
     * @throws DAOException 操作数据库异常
     */
     void saveBusinessUnitInfo(Map businessUnitInfo) throws DAOException;


    /**
     * 查询小区单元信息（business过程）
     * 根据bId 查询小区单元信息
     *
     * @param info bId 信息
     * @return 小区单元信息
     * @throws DAOException
     */
     List<Map> getBusinessUnitInfo(Map info) throws DAOException;


    /**
     * 保存 小区单元信息 Business数据到 Instance中
     *
     * @param info
     * @throws DAOException
     */
     void saveUnitInfoInstance(Map info) throws DAOException;


    /**
     * 查询小区单元信息（instance过程）
     * 根据bId 查询小区单元信息
     *
     * @param info bId 信息
     * @return 小区单元信息
     * @throws DAOException
     */
     List<Map> getUnitInfo(Map info) throws DAOException;


    /**
     * 修改小区单元信息
     *
     * @param info 修改信息
     * @throws DAOException
     */
     void updateUnitInfoInstance(Map info) throws DAOException;

}