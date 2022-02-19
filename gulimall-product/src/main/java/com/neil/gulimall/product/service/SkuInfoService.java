package com.neil.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neil.gulimall.common.utils.PageUtils;
import com.neil.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author Neil
 * @email neilcanyouhearme@gmail.com
 * @date 2022-02-17 18:14:44
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

