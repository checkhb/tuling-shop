package com.jiagouedu.services.manage.orderdetail.impl;import com.jiagouedu.core.ServersManager;import com.jiagouedu.services.manage.orderdetail.OrderdetailService;import com.jiagouedu.services.manage.orderdetail.bean.Orderdetail;import com.jiagouedu.services.manage.orderdetail.dao.OrderdetailDao;import com.jiagouedu.web.action.manage.report.ReportInfo;import org.springframework.stereotype.Service;import javax.annotation.Resource;import java.util.List;@Service("orderdetailServiceManage")public class OrderdetailServiceImpl extends ServersManager<Orderdetail, OrderdetailDao>		implements OrderdetailService {    @Resource(name = "orderdetailDaoManage")    @Override    public void setDao(OrderdetailDao orderdetailDao) {        this.dao = orderdetailDao;    }	@Override	public List<ReportInfo> reportProductSales(Orderdetail orderdetail) {		return dao.reportProductSales(orderdetail);	}}