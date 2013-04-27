package com.gengfo.maven.test.framework;

import junit.framework.TestCase;

import com.gengfo.maven.domain.DomainUtils;
import com.gengfo.maven.service.InvoiceService;

public class DomainTest extends TestCase {

    public void testDomain() {

        DomainUtils.helloDomain();

    }

    public void testService() {

        InvoiceService invSvc = new InvoiceService();

        invSvc.helloService();

    }

}
