package com.neil.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neil.gulimall.common.utils.PageUtils;
import com.neil.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Neil
 * @email neilcanyouhearme@gmail.com
 * @date 2022-02-17 18:14:45
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

