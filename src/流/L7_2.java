package ��;

// �����ı��ļ����ַ����������ʽ�ļ����ֽ���

import java.io.*;

public class L7_2
{
	public static void main(String[] args) throws Exception
	{
		//FileReader fz = new FileReader("E:/javadaima/java2-1/51zxw.jpg");
		//FileWriter zt = new FileWriter("e:/51zxw.jpg"); //·����б�ܺ�windows���෴
		
		FileInputStream fz = new FileInputStream("E:/javadaima/java2-1/51zxw.jpg");
		FileOutputStream zt = new FileOutputStream("e:/51zxw.jpg");
		
		int aa;
		aa = fz.read();
		while (aa!=(-1))
		{
			zt.write(aa);
			aa = fz.read();
		}		
		zt.flush();  //�����в�������ȫ��д���ļ����ú�����д���ļ��ر�֮ǰ
		
		fz.close();
		zt.close();
	}
}