/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.ignore.configuration;

import cputgroup3a.ignore.service.IgnoreService;
import cputgroup3a.ignore.service.Impl.IgnoreServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class AppConfig {
    @Bean(name="IG")
    public IgnoreService getService(){
        return new IgnoreServiceImpl();
    }
}
