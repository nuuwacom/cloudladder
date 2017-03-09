package com.nuuwa.cloudladder.adaptor;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by justin on 17/3/9.
 */
public class BoxAdaptorImplTest {

    Adaptor adaptor;

    @Before
    public void init() {
        adaptor = new BoxAdaptorImpl();
    }

    @Test
    public void testRetrieveAppInfo() throws Exception {
        assertTrue(null != adaptor.retrieveAppInfo());
    }

    @Test
    public void testBackupApp() throws Exception {
        assertTrue(adaptor.backupApp());
    }
}