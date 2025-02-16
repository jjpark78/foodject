package com.foodject.shop.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.shop.frame.Biz;
import com.foodject.shop.mapper.MainMapper;
import com.foodject.shop.vo.ShopVO;


@Service
public class MainBiz implements Biz<Integer, ShopVO> {

	@Autowired
	MainMapper dao;

	
	@Override
	public void register(ShopVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(ShopVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public ShopVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ShopVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<ShopVO> serchall(String obj) throws Exception{
		return dao.serchall(obj);
	}

}
