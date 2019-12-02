package com.ustglobal.rmsspringmnvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.rmsspringmnvc.dto.ProductBean;
import com.ustglobal.rmsspringmnvc.dto.RetailerBean;

@Repository
public class RetailerProductDAOImpl implements RetailerProductDAO{

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public RetailerBean login(int id, String password) {
		String jpql = "from RetailerBean where rid=:id and password=:password";
		EntityManager em = factory.createEntityManager();
		TypedQuery<RetailerBean> query = em.createQuery(jpql, RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int register(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return bean.getRid();
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return 0;
	}

	@Override
	public ProductBean searchProduct(int pid) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductBean.class, pid);
	}

	@Override
	public int updatePassword(int rid, String newpassword) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			RetailerBean bean = manager.find(RetailerBean.class, rid);
			bean.setPassword(newpassword);
			transaction.commit();			
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return 0;
		}
	}

	@Override
	public ProductBean buyOneProduct(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductBean bean = manager.find(ProductBean.class, bid);
			int quantity = bean.getQuantity();
			bean.setQuantity(quantity-1);
			int newquantity = bean.getQuantity();
			if(newquantity < 1 ) {
				ProductBean bean2 = manager.find(ProductBean.class, bid);
				manager.remove(bean);
			}
			transaction.commit();			
			return bean;
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
	}

	@Override
	public int deleteProduct(int pid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductBean bean = manager.find(ProductBean.class, pid);
			manager.remove(bean);
			transaction.commit();			
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return 0;
		}
	}

	
}
