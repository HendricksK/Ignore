/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.ignore;

import cputgroup3a.ignore.configuration.AppConfig;
import cputgroup3a.ignore.service.IgnoreService;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class IgnoreServiceTest {
    
    public IgnoreServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public static IgnoreService ig;
    public int data;
    
    @Ignore("This expression is not working correctly yet")
    @Test
    public void checkData()throws Exception{
        data = ig.sendMultiply(56, 21);
    }
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ig = (IgnoreService) ctx.getBean("IG");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
