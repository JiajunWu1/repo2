package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;

/**
 * created  with Intellij  IDEA.
 *
 * @Auther:WJJ
 * @Date:2020/03/20/13:55
 */
//账户业务层实现类
public class AccountServeiceImpl implements IAccountService {

     private IAccountDao accountDao =new AccountDaoImpl();
 /*  BeanFactory bf=new BeanFactory();*/

    public AccountServeiceImpl(){
        System.out.println("对象创建了！！！");
    }

    public void saveAccount(){

        accountDao.saveAccount();
    }
}
