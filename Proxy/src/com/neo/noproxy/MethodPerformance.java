package com.neo.noproxy;
/**
 *
 * @author lile
 * @date   2016年8月22日 time 下午5:05:51
 */
public class MethodPerformance {
	private long begin;
	private long end;
	private String serviceMethod;
	public MethodPerformance(String serviceMethod){
		this.serviceMethod = serviceMethod;
		//记录目标类方法开始执行的系统时间
		this.begin = System.currentTimeMillis();
	}
	/**
	 * 打印方法执行性能报告
	 */
	public void printPerformance(){
		end = System.currentTimeMillis();
		long elapse = end - begin;
		
		System.out.println(serviceMethod + "花费" + elapse + "毫秒");
	}
}

