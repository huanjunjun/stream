package stream;

import java.io.*;

public class L7_7
{
	public static void main(String[] args) throws Exception 
	{
		DataOutputStream sjl = new DataOutputStream(new FileOutputStream("C:/Users/ASUS/Desktop/1.txt"));
		sjl.writeLong(12345);  
		sjl.close();
		System.out.println(12345);
		System.out.printf("%#X\n", 12345);
				
		PrintStream pl = new PrintStream(new FileOutputStream("C:/Users/ASUS/Desktop/2.txt"));
		pl.println(12345);  
		pl.close();
	}
}


//DataOutputStream �е� writeXXX(data)�����Ľ���Ǽ����ʶ��Ķ�������ʽ
//PrintStream �е� println(data)�����Ľ����������ϰ�߿������ַ�����ʽ