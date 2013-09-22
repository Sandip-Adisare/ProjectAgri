package com.vn.core;

/**
 * @author viraj patil
 *
 */
public class AppUtil {

	/**
	 * Returns true if _arg is null or has length 0.
	 * @param _arg
	 * @return {@link Boolean}
	 */
	public static boolean isEmpty(String _arg) {
		if (_arg != null && _arg.length() != 0) {
			return false;
		}
		return true;
	}
}
