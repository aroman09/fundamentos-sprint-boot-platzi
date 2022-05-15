package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDEpendency;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
    private ComponentDependency componentDependency;
    private MyBean mybean;
    private MyBeanWithDEpendency myBeanWithDEpendency;

    public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean mybean, MyBeanWithDEpendency myBeanWithDEpendency){
        this.componentDependency=componentDependency;
        this.mybean=mybean;
        this.myBeanWithDEpendency=myBeanWithDEpendency;
    }
    public static void main(String[] args)
    {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        componentDependency.saludar();
        mybean.print();
        myBeanWithDEpendency.printWithDependency();
    }
}
