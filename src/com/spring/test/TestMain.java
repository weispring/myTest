package com.spring.test;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.jws.soap.SOAPBinding.Use;



public class TestMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
  
        /*String rlt="{3abc0}def0}";
        Pattern scriptPattern = Pattern.compile("\\{3.*?0\\}", Pattern.CASE_INSENSITIVE);
        System.err.println(rlt);
		rlt = scriptPattern.matcher(rlt).replaceAll("");
		 System.err.println(rlt);*/
		
	/*	 Properties properties=System.getProperties();
		 Enum<?> enum= Enumeration<?>enumeration=properties.propertyNames();
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.err.println(object+":"+properties.getProperty((String)object));
		}*/
		 
		/*Map<String,String> map=new HashMap<>();
		
	    map.put("ceshi", null);
	    
	    System.err.println("哈哈1哈哈".replace("1", ""));*/
		/*System.err.println("2016年08月-2017年09月的还款记录".substring(0,17));
		int i=Integer.parseInt(null);yyyy-MM-dd HH:mm:ss
		System.err.println(i+"--------------");*/
		
		 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			java.util.Date uDate = sdf.parse("2017-10-03 15:45");
			System.out.println(""+uDate);
			/*System.err.println(uDate.getTime());
			
		
			System.err.println(date.getTime());
			date = date.valueOf("2017-10-03 15:45:22");
		   System.err.println("ddddd");*/
			Date date = new Date(uDate.getTime());
			date.setTime(uDate.getTime());
			System.err.println("----");
		 
	}

}
