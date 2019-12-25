package com.example.baiduocr.utils;import android.util.Log;import java.util.Date;import butterknife.internal.Utils;/** * author: zdj * created on: 2019/11/12 * description: */public class LogUtil {	public static void d(String TAG, String method, String msg) {		if (Constants.DEBUG) {			Log.d(TAG, "[" + method + "]" + msg);		}	}	public static void d(String TAG, String msg) {		if (Constants.DEBUG) {			Log.d(TAG, "[" + getFileLineMethod() + "]" + msg);		}	}	public static void i(String TAG, String msg) {		if (Constants.DEBUG) {			Log.i(TAG, "[" + getFileLineMethod() + "]" + msg);		}	}	public static void i(String msg) {		if (Constants.DEBUG) {			Log.i(_FILE_(), getLineMethod() + msg);		}	}	public static void d(String msg) {		if (Constants.DEBUG) {			Log.d(_FILE_(), "[" + getLineMethod() + "]" + msg);		}	}	public static void e(String msg) {		if (Constants.DEBUG) {			Log.e(_FILE_(), getLineMethod() + msg);		}	}	public static void e(String TAG, String msg) {		if (Constants.DEBUG) {			Log.e(TAG, getLineMethod() + msg);		}	}	public static String getFileLineMethod() {		StackTraceElement traceElement = ((new Exception()).getStackTrace())[2];		StringBuffer toStringBuffer = new StringBuffer("[")				.append(traceElement.getFileName()).append(" | ")				.append(traceElement.getLineNumber()).append(" | ")				.append(traceElement.getMethodName()).append("]");		return toStringBuffer.toString();	}	public static String getLineMethod() {		StackTraceElement traceElement = ((new Exception()).getStackTrace())[2];		StringBuffer toStringBuffer = new StringBuffer("[")				.append(traceElement.getLineNumber()).append(" | ")				.append(traceElement.getMethodName()).append("]");		return toStringBuffer.toString();	}	public static String _FILE_() {		StackTraceElement traceElement = ((new Exception()).getStackTrace())[2];		return traceElement.getFileName();	}	public static String _FUNC_() {		StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];		return traceElement.getMethodName();	}	public static int _LINE_() {		StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];		return traceElement.getLineNumber();	}}