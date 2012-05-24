package main.java.git2jira;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

/**
 * 
 * @author sebastian.gramano@mulesoft.com
 *
 */
public class AttachmentOutboundTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage arg0, String arg1)
			throws TransformerException {
		int i = 0;
		i++;
		return arg0;
	}

}
