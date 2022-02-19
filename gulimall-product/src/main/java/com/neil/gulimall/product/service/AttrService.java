package com.neil.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neil.gulimall.common.utils.PageUtils;
import com.neil.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Neil
 * @email neilcanyouhearme@gmail.com
 * @date 2022-02-17 18:14:45
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

