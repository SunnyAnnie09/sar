package pku;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;

import pku.demo.DemoMessageStore;

/**
 * Created by yangxiao on 2017/11/14.
 */
public class Producer {

	public ByteMessage createBytesMessageToTopic(String topic, byte[] body) throws Exception {
		ByteMessage msg = new DefaultMessage(body); // 设置消息体
		msg.putHeaders(MessageHeader.TOPIC, topic); // 把topic绑定到消息体中
		return msg;
	}

	public void send(ByteMessage defaultMessage) throws Exception {
		String topic = defaultMessage.headers().getString(MessageHeader.TOPIC);
		MessageStore.store.push(defaultMessage, topic);
	}

	public void flush() throws Exception {
		 synchronized (MessageStore.msgs){
	            MessageStore.lastsave();
	        }
	    }

	
}
