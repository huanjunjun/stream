package ��;

import java.io.*;

public class L7_6
{
	 public static void main(String[] args) throws Exception
	 {
		String zfc = "111111111111";
		System.out.println("�ַ����� " + zfc);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		zfc = br.readLine();  //���ֱ������س��Ļ����ַ�������һ�����ַ���
		
		System.out.println("------------");
		System.out.println(zfc + "aaaaaaa"); 
		System.out.println(zfc.equals(""));  
		System.out.println(zfc.equals(null));	
	}
}

