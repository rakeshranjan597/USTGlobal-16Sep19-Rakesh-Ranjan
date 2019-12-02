package com.ustglobal.rmsspringmnvc.dao;

import com.ustglobal.rmsspringmnvc.dto.ProductBean;
import com.ustglobal.rmsspringmnvc.dto.RetailerBean;

public interface RetailerProductDAO {

	public RetailerBean login(int id, String password);

	public int register(RetailerBean bean);
	
	public ProductBean searchProduct(int pid);
	
	public int updatePassword(int rid, String newpassword);
	
	public ProductBean buyOneProduct(int bid);
	
	public int deleteProduct(int pid);

}
