package com.neil.gulimall.product.dao;

import com.neil.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Neil
 * @email neilcanyouhearme@gmail.com
 * @date 2022-02-17 18:14:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
