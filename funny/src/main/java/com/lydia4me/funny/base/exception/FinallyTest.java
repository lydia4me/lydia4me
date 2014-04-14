package com.lydia4me.funny.base.exception;

public class FinallyTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	@SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {
		try{
			throw new Exception("1");
		}catch(Exception e){
			throw new Exception("2");
		}catch(Throwable t){
			throw new Exception("3");
		}finally{
			throw new Exception("4");//throw exception at here
		}
	}

}
