package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.GoodsDao;
import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月29日 下午8:05:23 类功能说明
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao gDao;

	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		return gDao.findAll();
	}

	@Override
	public List<Brand> findBrand() {
		// TODO Auto-generated method stub
		return gDao.findBrand();
	}

	@Override
	public List<Type> findType() {
		// TODO Auto-generated method stub
		return gDao.findType();
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		gDao.add(goods);
	}

}
