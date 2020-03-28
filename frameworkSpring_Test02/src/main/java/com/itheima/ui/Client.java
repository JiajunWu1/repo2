package com.itheima.ui;


import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServeiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.Resource;


/**
 * created  with Intellij  IDEA.
 *
 * @Auther:WJJ
 * @Date:2020/03/20/14:02
 */
//模拟一个表现层，用于调用业务层
public class Client {
    /**
     * 获取spring的IOC核心容器，并根据ID获取对象
     *
     * ApplicationContext的三个常用实现类：(适合单例对象的创建)  更多采用此接口
     *            ClassPathXmlApplicationContext:他可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了(更常用)
     *            FileSystemXmlApplicationContext:他可以加载磁盘任意路径下的配置文件（必须有访问权限）
     *            AnnnotationConfigApplicationContext:他是用于读取注解创建容器的
     *
     *  核心容器的两个接口引发的问题：（适合多例对象的创建）
     *      ApplicationContext:
     *            它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象
     *      BeanFactory:
     *            它在构建核心容器时，创建对象采用的策略是采用延迟加载 的方式，也就是说什么时候ID获取对象，什么时候才真正的创建对象
     *
     * */

    public static void main(String[] args){
        //1.获取核心容器对象
      //  ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        /*ApplicationContext ac=new FileSystemXmlApplicationContext("D:\\JAVA\\frameworkSpring_Test02\\src\\main\\resources\bean.xml");*/
        //2.根据ID获取Bean对象
        /*BeanFactory bf=new BeanFactory();*/
       // IAccountService as=(IAccountService) ac.getBean("accountService");
       // IAccountDao adao=ac.getBean("accountDao",IAccountDao.class);
       // System.out.println(as);
       // System.out.println(adao);

        //---------BeanFactory-------
       ClassPathResource resource=new ClassPathResource("bean.xml");
       BeanFactory factory=new XmlBeanFactory(resource);
       IAccountService as=(IAccountService)factory.getBean("accountService");
        System.out.println(as);
    }
}
