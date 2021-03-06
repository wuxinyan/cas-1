
package org.apereo.cas;

import org.apereo.cas.web.flow.decorator.GroovyLoginWebflowDecoratorTests;
import org.apereo.cas.web.flow.decorator.RestfulLoginWebflowDecoratorTests;
import org.apereo.cas.web.flow.executor.ClientFlowExecutionRepositoryTests;
import org.apereo.cas.web.flow.executor.EncryptedTranscoderTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0-RC3
 */
@SelectClasses({
    GroovyLoginWebflowDecoratorTests.class,
    RestfulLoginWebflowDecoratorTests.class,
    ClientFlowExecutionRepositoryTests.class,
    EncryptedTranscoderTests.class
})
@RunWith(JUnitPlatform.class)
public class AllTestsSuite {
}
