package com.jiagouedu.services.manage.attributelink.dao.impl;import com.jiagouedu.core.dao.BaseDao;import com.jiagouedu.core.dao.page.PagerModel;import com.jiagouedu.services.manage.attributelink.bean.AttributeLink;import com.jiagouedu.services.manage.attributelink.dao.AttributeLinkDao;import org.springframework.stereotype.Repository;import javax.annotation.Resource;import java.util.List;@Repository("attributeLinkDaoManage")public class AttributeLinkDaoImpl implements AttributeLinkDao {    @Resource	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(AttributeLink e) {		return dao.selectPageList("manage.attributeLink.selectPageList",				"manage.attributeLink.selectPageCount", e);	}	public List selectList(AttributeLink e) {		return dao.selectList("manage.attributeLink.selectList", e);	}	public AttributeLink selectOne(AttributeLink e) {		return (AttributeLink) dao.selectOne("manage.attributeLink.selectOne", e);	}	public int delete(AttributeLink e) {		return dao.delete("manage.attributeLink.delete", e);	}	public int update(AttributeLink e) {		return dao.update("manage.attributeLink.update", e);	}	public int deletes(String[] ids) {		AttributeLink e = new AttributeLink();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(AttributeLink e) {		return dao.insert("manage.attributeLink.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.attributeLink.deleteById", id);	}	@Override	public int deleteByCondition(AttributeLink e) {		return dao.delete("manage.attributeLink.deleteByCondition", e);	}	public AttributeLink selectById(String id) {		return (AttributeLink) dao.selectOne(id);	}	@Override	public void deleteByAttributeId(int id) {		dao.delete("manage.attributeLink.deleteByAttributeId", id);	}}