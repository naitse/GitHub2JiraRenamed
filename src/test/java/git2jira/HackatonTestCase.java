/*
 * Generated by the Mule project wizard. http://mule.mulesoft.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package git2jira;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HackatonTestCase extends FunctionalTestCase
{
    protected String getConfigResources()
    {
        return "hackaton-functional-test-config.xml";
    }

    @Test
    public void hackaton() throws Exception
    {
        Thread.sleep(100000);
    }
}
