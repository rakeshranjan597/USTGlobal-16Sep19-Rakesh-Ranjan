package com.ustglobal.rmsspringmnvc.service;

import com.ustglobal.rmsspringmnvc.dto.ProductBean;
import com.ustglobal.rmsspringmnvc.dto.RetailerBean;

public interface RetailerProductService {

	public RetailerBean login(int id, String password);

	public int register(RetailerBean bean);
	
	public ProductBean searchProduct(int pid);
	
	public int updatePassword(int rid, String newpassword);
	
	public ProductBean buyOneProduct(int bid);
	
}
