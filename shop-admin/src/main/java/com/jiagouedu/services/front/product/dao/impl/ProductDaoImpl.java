package com.jiagouedu.services.front.product.dao.impl;import com.jiagouedu.core.dao.BaseDao;import com.jiagouedu.core.dao.page.PagerModel;import com.jiagouedu.services.front.product.bean.Product;import com.jiagouedu.services.front.product.bean.ProductStockInfo;import com.jiagouedu.services.front.product.dao.ProductDao;import org.springframework.stereotype.Repository;import javax.annotation.Resource;import java.util.List;@Repositorypublic class ProductDaoImpl implements ProductDao {    @Resource	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Product e) {		return dao.selectPageList("front.product.selectPageList",				"front.product.selectPageCount", e);	}	public List selectList(Product e) {		return dao.selectList("front.product.selectList", e);	}	public Product selectOne(Product e) {		return (Product) dao.selectOne("front.product.selectOne", e);	}	public int delete(Product e) {		return dao.delete("front.product.delete", e);	}	public int update(Product e) {		return dao.update("front.product.update", e);	}	public int deletes(String[] ids) {		Product e = new Product();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Product e) {		return dao.insert("front.product.insert", e);	}	public int deleteById(int id) {		return dao.delete("front.product.deleteById", id);	}		public Product selectById(String id) {		return (Product) dao.selectOne("front.product.selectById", id);	}	public List<Product> selectParameterList(String id) {		return dao.selectList("front.product.selectParameterList", id);	}	@Override	public List<ProductStockInfo> selectStockList(Product product) {		return dao.selectList("front.product.selectStockList", product);	}	@Override	public List<Product> selectListProductHTML(Product product) {		return dao.selectList("front.product.selectListProductHTML", product);	}	@Override	public List<Product> selectProductListByIds(Product p) {		return dao.selectList("front.product.selectProductListByIds", p);	}	@Override	public void updateStockAfterPaySuccess(Product product) {		dao.update("front.product.updateStockAfterPaySuccess",product);	}	@Override	public List<Product> selectHotSearch(Product p) {		return dao.selectList("front.product.selectHotSearch",p);	}	@Override	public List<Product> loadHotProductShowInSuperMenu(Product product) {		return dao.selectList("front.product.loadHotProductShowInSuperMenu", product);	}	@Override	public void updateHit(Product p) {		dao.update("front.product.updateHit",p);	}	@Override	public List<Product> selectPageLeftHotProducts(Product p) {		return dao.selectList("front.product.selectPageLeftHotProducts",p);	}	@Override	public List<Product> selectActivityProductList(Product p) {		return dao.selectList("front.product.selectActivityProductList",p);	}}