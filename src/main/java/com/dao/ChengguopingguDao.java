package com.dao;

import com.entity.ChengguopingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengguopingguView;

/**
 * 成果评估 Dao 接口
 *
 * @author 
 */
public interface ChengguopingguDao extends BaseMapper<ChengguopingguEntity> {

   List<ChengguopingguView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
