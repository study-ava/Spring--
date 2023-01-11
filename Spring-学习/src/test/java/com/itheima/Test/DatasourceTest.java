package com.itheima.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;


public class DatasourceTest {


    @Test
    //����spring������������Դ
    public void test3() throws Exception {

        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource=app.getBean(DataSource.class);
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }


    @Test
    //�����ֶ�����c3p0����Դ������properties�����ļ���
    public void test2() throws Exception {
      //��ȡ�����ļ�
        ResourceBundle rb=ResourceBundle.getBundle("jdbc");
        String driver=rb.getString("jdbc.driver");
        String url= rb.getString("jdbc.url");
        String username= rb.getString("jdbc.username");
        String password= rb.getString("jdbc.password");

      //��������Դ�����������Ӳ���
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setPassword(password);
        dataSource.setUser(username);
        dataSource.setJdbcUrl(url);

        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }



    @Test
    //�����ֶ�����c3p0����Դ
    public void test1() throws Exception {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        Connection connection= (Connection) dataSource.getConnection();
        System.out.println(connection);
        connection.close();


    }

}
