package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

/**
 * created  with Intellij  IDEA.
 *
 * @Auther:WJJ
 * @Date:2020/03/20/14:00
 */
//账户的持久层实现类
public class AccountDaoImpl implements IAccountDao {

  public void  saveAccount(){
      System.out.println("保存了账户");
  }
}
