package com.jiagouedu.services.front.ordership.impl;import com.jiagouedu.core.ServersManager;import com.jiagouedu.services.front.ordership.OrdershipService;import com.jiagouedu.services.front.ordership.bean.Ordership;import com.jiagouedu.services.front.ordership.dao.OrdershipDao;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;@Servicepublic class OrdershipServiceImpl extends ServersManager<Ordership, OrdershipDao> implements		OrdershipService {    @Autowired    @Override    public void setDao(OrdershipDao ordershipDao) {        this.dao = ordershipDao;    }}