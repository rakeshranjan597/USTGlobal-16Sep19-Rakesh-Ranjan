package com.ustglobal.rmsspringmnvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.rmsspringmnvc.dao.RetailerProductDAO;
import com.ustglobal.rmsspringmnvc.dto.ProductBean;
import com.ustglobal.rmsspringmnvc.dto.RetailerBean;

@Service
public class RetailerProductServiceImpl implements RetailerProductService{

	@Autowired
	RetailerProductDAO dao;
	
	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		return dao.register(bean);
	}

	@Override
	public ProductBean searchProduct(int pid) {
		return dao.searchProduct(pid);
	}

	@Override
	public int updatePassword(int rid, String newpassword) {
		return dao.updatePassword(rid, newpassword);
	}

	@Override
	public ProductBean buyOneProduct(int bid) {
		return dao.buyOneProduct(bid);
	}

}
