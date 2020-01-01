package com.bw.service;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月29日 下午8:03:33 类功能说明
 */
public interface GoodsService {

	List<Goods> findAll();

	List<Brand> findBrand();

	List<Type> findType();

	void add(Goods goods);

}
