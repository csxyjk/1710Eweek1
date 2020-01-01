package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.GoodsDao;
import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2019��12��29�� ����8:05:23 �๦��˵��
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
