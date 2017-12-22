package pku;

import java.util.ArrayList;
import java.util.HashMap;

public class MessageStore {
	static final MessageStore store = new MessageStore();
	
	 //消息存储
    HashMap<String, ArrayList<ByteMessage>> msgs = new HashMap<>();
    //遍历指针
    HashMap<String, Integer> readPos = new HashMap<>();


    //加锁保证线程安全
    public synchronized void push(ByteMessage msg, String topic) {
        if (msg == null) {
            return;
        }
        if (!msgs.containsKey(topic)) {
            msgs.put(topic, new ArrayList<>());
        }
        //加入消息
        msgs.get(topic).add(msg);
    }
    //加锁保证线程安全
    public synchronized ByteMessage pull(String queue, String topic) {
        String k = queue + " " + topic;
        if (!readPos.containsKey(k)) {
            readPos.put(k, 0);
        }
        int pos = readPos.get(k);
        if (!msgs.containsKey(topic)) {
            return null;
        }
        ArrayList<ByteMessage> list = msgs.get(topic);
        if (list.size() <= pos) {
            return null;
        } else {
            ByteMessage msg = list.get(pos);
            readPos.put(k, pos + 1);
            return msg;
        }


    }

}
