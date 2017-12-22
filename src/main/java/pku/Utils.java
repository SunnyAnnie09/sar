package pku;

import java.util.HashMap;

public class Utils {
	//用来简化消息头中的key
	public static final HashMap<String, Byte> StrToByteMap = new HashMap<>();
	public static final HashMap<Byte, String> ByteToStrMap= new HashMap<>();
	static{
		StrToByteMap.put(MessageHeader.MESSAGE_ID , (byte) 1);
		StrToByteMap.put(MessageHeader.TOPIC  , (byte) 2);
		StrToByteMap.put(MessageHeader.BORN_TIMESTAMP , (byte) 3);
		StrToByteMap.put(MessageHeader.BORN_HOST  , (byte) 4);
		StrToByteMap.put(MessageHeader.STORE_TIMESTAMP , (byte) 5);
		StrToByteMap.put(MessageHeader.STORE_HOST , (byte) 6);
		StrToByteMap.put(MessageHeader.START_TIME , (byte) 7);
		StrToByteMap.put(MessageHeader.STOP_TIME , (byte) 8);
		StrToByteMap.put(MessageHeader.TIMEOUT , (byte) 9);
		StrToByteMap.put(MessageHeader.PRIORITY , (byte) 10);
		StrToByteMap.put(MessageHeader.RELIABILITY , (byte) 11);
		StrToByteMap.put(MessageHeader.SEARCH_KEY , (byte) 12);
		StrToByteMap.put(MessageHeader.SCHEDULE_EXPRESSION , (byte) 13);
		StrToByteMap.put(MessageHeader.SHARDING_KEY , (byte) 14);
		StrToByteMap.put(MessageHeader.SHARDING_PARTITION , (byte) 15);
		StrToByteMap.put(MessageHeader.TRACE_ID , (byte) 16);
		
		ByteToStrMap.put((byte) 1, MessageHeader.MESSAGE_ID);
		ByteToStrMap.put((byte) 2, MessageHeader.TOPIC);
		ByteToStrMap.put((byte) 3, MessageHeader.BORN_TIMESTAMP);
		ByteToStrMap.put((byte) 4, MessageHeader.BORN_HOST);
		ByteToStrMap.put((byte) 5, MessageHeader.STORE_TIMESTAMP);
		ByteToStrMap.put((byte) 6, MessageHeader.STORE_HOST);
		ByteToStrMap.put((byte) 7, MessageHeader.START_TIME);
		ByteToStrMap.put((byte) 8, MessageHeader.STOP_TIME);
		ByteToStrMap.put((byte) 9, MessageHeader.TIMEOUT);
		ByteToStrMap.put((byte) 10, MessageHeader.PRIORITY);
		ByteToStrMap.put((byte) 11, MessageHeader.RELIABILITY);
		ByteToStrMap.put((byte) 12, MessageHeader.SEARCH_KEY);
		ByteToStrMap.put((byte) 13, MessageHeader.SCHEDULE_EXPRESSION);
		ByteToStrMap.put((byte) 14, MessageHeader.SHARDING_KEY);
		ByteToStrMap.put((byte) 15, MessageHeader.SHARDING_PARTITION);
		ByteToStrMap.put((byte) 16, MessageHeader.TRACE_ID);
	}
	
	public static void main(String[] args) {
		System.out.println(Utils.StrToByteMap.get(MessageHeader.BORN_TIMESTAMP));
		System.out.println(Utils.ByteToStrMap.get((byte)6));
	}
	

}
