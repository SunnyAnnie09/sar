package pku;

import java.util.HashMap;

public class Utils {
	//用来简化消息头中的key
	public static final HashMap<String, Character> StrToCharMap = new HashMap<>();
	public static final HashMap<Character, String> CharToStrMap= new HashMap<>();
	static{
		StrToCharMap.put(MessageHeader.MESSAGE_ID , 'a');
		StrToCharMap.put(MessageHeader.TOPIC  , 'b');
		StrToCharMap.put(MessageHeader.BORN_TIMESTAMP , 'c');
		StrToCharMap.put(MessageHeader.BORN_HOST  , 'd');
		StrToCharMap.put(MessageHeader.STORE_TIMESTAMP , 'e');
		StrToCharMap.put(MessageHeader.STORE_HOST , 'f');
		StrToCharMap.put(MessageHeader.START_TIME , 'g');
		StrToCharMap.put(MessageHeader.STOP_TIME , 'h');
		StrToCharMap.put(MessageHeader.TIMEOUT , 'i');
		StrToCharMap.put(MessageHeader.PRIORITY , 'j');
		StrToCharMap.put(MessageHeader.RELIABILITY , 'k');
		StrToCharMap.put(MessageHeader.SEARCH_KEY , 'l');
		StrToCharMap.put(MessageHeader.SCHEDULE_EXPRESSION , 'm');
		StrToCharMap.put(MessageHeader.SHARDING_KEY , 'n');
		StrToCharMap.put(MessageHeader.SHARDING_PARTITION , 'o');
		StrToCharMap.put(MessageHeader.TRACE_ID , 'p');
		
		CharToStrMap.put('a', MessageHeader.MESSAGE_ID);
		CharToStrMap.put('b', MessageHeader.TOPIC);
		CharToStrMap.put('c', MessageHeader.BORN_TIMESTAMP);
		CharToStrMap.put('d', MessageHeader.BORN_HOST);
		CharToStrMap.put('e', MessageHeader.STORE_TIMESTAMP);
		CharToStrMap.put('f', MessageHeader.STORE_HOST);
		CharToStrMap.put('g', MessageHeader.START_TIME);
		CharToStrMap.put('h', MessageHeader.STOP_TIME);
		CharToStrMap.put('i', MessageHeader.TIMEOUT);
		CharToStrMap.put('j', MessageHeader.PRIORITY);
		CharToStrMap.put('k', MessageHeader.RELIABILITY);
		CharToStrMap.put('l', MessageHeader.SEARCH_KEY);
		CharToStrMap.put('m', MessageHeader.SCHEDULE_EXPRESSION);
		CharToStrMap.put('n', MessageHeader.SHARDING_KEY);
		CharToStrMap.put('o', MessageHeader.SHARDING_PARTITION);
		CharToStrMap.put('p', MessageHeader.TRACE_ID);
	}
	
	public static void main(String[] args) {
		System.out.println(Utils.StrToCharMap.get(MessageHeader.BORN_TIMESTAMP));
		System.out.println(Utils.CharToStrMap.get('j'));
	}
	

}
