package com.yc.util;

public class StringUtil {
	public static boolean isNull(String...strs) {
		if(strs==null || strs.length<=0) {
			return true;
		}
		for(String s:strs) {
			if(null==s || "".equals(s)) {
				return true;
			}
		}
		return false;
	}
}
