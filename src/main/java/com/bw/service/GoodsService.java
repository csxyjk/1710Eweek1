package com.bw.service;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2019��12��29�� ����8:03:33 �๦��˵��
 */
public interface GoodsService {

	List<Goods> findAll();

	List<Brand> findBrand();

	List<Type> findType();

	void add(Goods goods);

}
