package com.jiagouedu.services.front.orderpay.impl;import com.jiagouedu.core.ServersManager;import com.jiagouedu.services.front.orderpay.OrderpayService;import com.jiagouedu.services.front.orderpay.bean.Orderpay;import com.jiagouedu.services.front.orderpay.dao.OrderpayDao;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;@Service("orderpayServiceImpl")public class OrderpayServiceImpl extends ServersManager<Orderpay, OrderpayDao> implements        OrderpayService {    @Autowired    @Override    public void setDao(OrderpayDao orderpayDao) {        this.dao = orderpayDao;    }}