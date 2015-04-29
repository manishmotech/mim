package org.motechproject.nms.outbounddialer.it;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.motechproject.nms.outbounddialer.service.OutboundDialerService;
import org.motechproject.testing.osgi.BasePaxIT;
import org.motechproject.testing.osgi.container.MotechNativeTestContainerFactory;
import org.ops4j.pax.exam.ExamFactory;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerSuite;

import javax.inject.Inject;

import static org.junit.Assert.assertTrue;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerSuite.class)
@ExamFactory(MotechNativeTestContainerFactory.class)
public class OutboundDialerServiceBundleIT extends BasePaxIT {

    @Inject
    OutboundDialerService outboundDialerService;

    @Test
    public void testTargetFileGeneration() {
        outboundDialerService.generateTargetFile();
    }

    @Test
    public void testServicePresent() {
        assertTrue(outboundDialerService != null);
    }
}
