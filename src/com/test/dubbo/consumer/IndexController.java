package com.test.dubbo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dubbo.provider.TestRegistryService;


@Controller  
public class IndexController {    
    @Autowired 
    @Qualifier("testRegistryService")
    private TestRegistryService testRegistryService;  
      
    @RequestMapping("/hello")  
    public String index(Model model){  
         String name=testRegistryService.hello("client message");  
         System.out.println(name);  
         return "";  
    }  
  
}