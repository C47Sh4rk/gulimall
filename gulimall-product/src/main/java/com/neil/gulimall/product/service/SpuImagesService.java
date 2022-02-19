package com.neil.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neil.gulimall.common.utils.PageUtils;
import com.neil.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author Neil
 * @email neilcanyouhearme@gmail.com
 * @date 2022-02-17 18:14:44
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

