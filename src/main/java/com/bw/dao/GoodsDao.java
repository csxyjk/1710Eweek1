package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2019��12��29�� ����8:07:20 �๦��˵��
 */
public interface GoodsDao {

	List<Goods> findAll();

	@Select("select * from t_brand")
	List<Brand> findBrand();

	@Select("select * from t_type")
	List<Type> findType();

	@Insert("INSERT INTO t_goods VALUES(NULL,#{name},#{ename},#{bid},#{tid},0,#{price},#{num},null,#{pic})")
	void add(Goods goods);

}
