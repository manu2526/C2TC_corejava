package com.tns.interf;


	interface Firstinterface{
		void mymethod();
	}

	interface Secondinterface{
		void myothermethod();
	}
	 
	public class Firinf implements Firstinterface,Secondinterface {

		public void mymethod()
		{
			System.out.println("firstinterface");
		}
		
		public void myothermethod()
		{
			System.out.println("secondinterface");
		}
		public static void main(String[] args) {
			Firinf f= new Firinf();
		 f.mymethod();
		 f.myothermethod();

		}
}