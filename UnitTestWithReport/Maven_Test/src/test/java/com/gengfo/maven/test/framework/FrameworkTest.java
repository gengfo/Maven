package com.gengfo.maven.test.framework;

import junit.framework.TestCase;

import com.gengfo.maven.domain.DomainUtils;
import com.gengfo.maven.framework.FrameworkUtils;
import com.gengfo.maven.service.InvoiceService;

public class FrameworkTest extends TestCase {

    public void testFramework() {

        FrameworkUtils.helloFramework();

    }

    public void testDomain() {

        DomainUtils.helloDomain();

    }

    public void testService() {

        InvoiceService invSvc = new InvoiceService();

        invSvc.helloService();

    }

}
