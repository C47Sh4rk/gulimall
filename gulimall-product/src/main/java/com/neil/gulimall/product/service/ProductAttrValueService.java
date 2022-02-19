package com.neil.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neil.gulimall.common.utils.PageUtils;
import com.neil.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author Neil
 * @email neilcanyouhearme@gmail.com
 * @date 2022-02-17 18:14:45
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

