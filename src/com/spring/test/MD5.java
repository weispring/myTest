package com.spring.test;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.relation.RelationServiceNotRegisteredException;
import javax.swing.plaf.synth.SynthStyle;  
  
/** 
 * 采用MD5加密解密 
 *  
 * @author tfq 
 * @datetime 2011-10-13 
 */  
public class MD5 {  
  
    /*** 
     * MD5加码 生成32位md5码 
     */  
    public static String string2MD5(String inStr) {  
        MessageDigest md5 = null;  
        try {  
            md5 = MessageDigest.getInstance("MD5");  
        } catch (Exception e) {  
            System.out.println(e.toString());  
            e.printStackTrace();  
            return "";  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++) {  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
  
    }  
  
    /** 
     * 加密解密算法 执行一次加密，两次解密 
     */  
    public static String convertMD5(String inStr) {  
  
        char[] a = inStr.toCharArray();  
        for (int i = 0; i < a.length; i++) {  
            a[i] = (char) (a[i] ^ 't');  
        }  
        String s = new String(a);  
        return s;  
  
    }  
  public String test() {
	  for (int i = 0; i <5; i++) {
			System.err.println("jjj"+i);
			return "1";
			
		}
	return "222";
}
    // 测试主函数  
    public static void main(String args[]) {
    	
    	
    	System.err.println(string2MD5("*059B6B5C99F758A5C9252C0DB8579F6E30F6D9F4"));
    	
    	/*double d=11.01;
    	Double double1=new Double(0.99);*/
    
    	//33d.pdf
    	//Pattern pattern=Pattern.compile("[d]{1,}.pdf");
    	Pattern pattern=Pattern.compile("[33]{1,}.pdf"); //不能匹配
    	//[abc] [a|b|c] 等效于
    	//(abc)		(a|b|c) 不等
		/*List<Map<String,Object>> pdf=new ArrayList<>();
	  
	    	 Matcher matcher=pattern.matcher("3.pdf");
             if(matcher.find()) {
            	 String tString=matcher.group();
            	// String hString=matcher.group(1);
            	 System.err.println("ddddddddd");
             }*/
    	/*Properties properties=System.getProperties();
    	
    	properties.get("");*/
    	
    	
    
    	
    	
    /*	BigDecimal bigDecimal=new BigDecimal(87799.00001);
    	
    	BigDecimal bigDecimal2=new BigDecimal(87799.00001);
    	
    	//bigDecimal=bigDecimal.setScale(3, 1);
    	
    	System.err.println(bigDecimal.toString());
    	
    	System.err.println(bigDecimal2.toString());
    	*/
    	
    	
    	
    	//String  hString=new MD5().test();
    	
    	
    	
    	
    	
    	
    	/*Double double1=new Double(90.099);
    	BigDecimal scale=BigDecimal.valueOf(Double.parseDouble("88.0908")*100);
    	System.err.println("dddddddddd");
    	if (null==null) {
			System.err.println("23132");
		}*/
    	
    	/**String string="multipart/form-data; boundary=----WebKitFormBoundaryMAsq7HAYYnEKPAw5";
    	
        int pos = string.indexOf("boundary=");

    	
    	
    	
    	
    	
    	/*double d=1.0-0.9;
    	double f=0.1;
    	if (d==f) {
			System.err.println("dddddddddd");
		}
    	System.err.println(d);*/
    	//BigDecimal bigDecimal=new BigDecimal("100.101");
    	//BigDecimal df=new BigDecimal("100.101");
    	//bigDecimal=bigDecimal.setScale(4,BigDecimal.ROUND_DOWN);
    	//BigDecimal bid=new BigDecimal(100.1166);
    	//bid=bigDecimal.setScale(4,BigDecimal.ROUND_DOWN);
    	 //bigDecimal=bigDecimal.add(bid);
    	 //bigDecimal=bigDecimal.add(bid);
    	//bigDecimal2=bigDecimal2.setScale(4,BigDecimal.ROUND_DOWN);
    	//System.err.println("lllllllllllll");
    	//BigDecimal decimal=bigDecimal2.setScale(2,BigDecimal.ROUND_DOWN);
       /*  String hString="";
         
         Pattern pattern=Pattern.compile("^[\u0391-\uFFE5]+");
         Matcher matcher=pattern.matcher("解缴费多说几句1232进件000");
         if (matcher.find()) {
			hString=matcher.group(0);
		}
    	System.err.println(hString);*/
    	 //System.out.println("解密的：" + convertMD5(""));
    /*	String string="12";
        String s = new String("ah号");  
        System.out.println("原始：" + string);  
        System.out.println("MD5后：" + string2MD5(string));  
        System.out.println("加密的：" + convertMD5(""));  
        System.out.println("解密的：" + convertMD5(convertMD5(string))); */
    	
    	//new MD5().MoveFile("C:\\lyceshi","C:\\12");
    
    	
    	/*File file1=new File("C:\\springboot-tomcat-tmp\\upload\\2017\\CPHZ20170512N000007");
    	
    	//获取最新文件夹
    	File [] dirs=file1.listFiles();
    	List<Long> dirList=new ArrayList<>();
    	for (int i = 0; i < dirs.length; i++) {
			dirList.add(dirs[i].lastModified());
		}
    	Collections.sort(dirList);
    	
    	//最新文件夹
         File lastDir=null;
    	for (int i = 0; i < dirs.length; i++) {
			if (dirs[i].lastModified()==dirList.get(dirList.size()-1)) {
				lastDir=dirs[i];
				break;
			}
		}
    	
    	//获取最新文件
    	File [] files=lastDir.listFiles();
    	List<Long> fileList=new ArrayList<>();
    	for (int i = 0; i < files.length; i++) {
			fileList.add(files[i].lastModified());
		}
    	
    	Collections.sort(fileList);
    	
    	File newFile=null;
    	for (File file : files) {
			if (file.lastModified()==fileList.get(fileList.size()-1)) {
				newFile=file;
			}
		}
    	
    	//删除文件
    	newFile.delete();
*/
    }  
    public boolean MoveFile(String oldfile,String newfile)  {
		try {
			File saveFile = new File(oldfile);
			
			String [] paths=saveFile.list();
			
			for (String string : paths) {
				File file=new File(oldfile+File.separator+string);
				if (file.isDirectory()) {
					File dir=new File(newfile+File.separator+string);
					if (!dir.exists()) {
						dir.mkdirs();
					}
					MoveFile(oldfile+File.separator+string, newfile+File.separator+string);
				}else {
					copyFile(oldfile+File.separator+string, newfile+File.separator+string);
				}
				
			}
			
		} catch (Exception e) {
			//logger.error("移动文件异常"+e.getMessage());
			return  false;
		}	
        return true;
	}
    
    public boolean copyFile(String oldfile,String newfile)  {
		try {
			File saveFile = new File(oldfile);
			//获取输入流
		    FileInputStream inputFile=new FileInputStream(saveFile);
		    BufferedInputStream bis = new BufferedInputStream(inputFile);
		    //输出流
		    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newfile));  
		    byte[] buff = new byte[2048];  
		    int bytesRead;  
		    while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
		      bos.write(buff, 0, bytesRead);  
		    }
		    //关闭流
		    bis.close(); 
		    inputFile.close();
		    bos.close(); 
		} catch (Exception e) {
			//logger.error("移动文件异常"+e.getMessage());
			return  false;
		}	
        return true;
	}
}  
			

	

