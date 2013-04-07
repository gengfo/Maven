package com.gengfo.maven.service;

import com.gengfo.maven.domain.DomainUtils;
import com.gengfo.maven.framework.FrameworkUtils;

public class InvoiceService implements ServiceInterface {

    public InvoiceService() {

    }

    public void helloService() {

        FrameworkUtils.helloFramework();

        DomainUtils.helloDomain();

        System.out.println("Hello Invoice Service!");

    }

}
