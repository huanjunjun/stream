package 流;

// 缓冲流千万别和虚拟内存混淆

import java.io.*;

public class L7_3
{
	public static void main(String[] args) throws Exception
	{
		BufferedInputStream hcfz = new BufferedInputStream( new FileInputStream("C:/Users/ASUS/Desktop/40-java.pdf"));
		BufferedOutputStream hczt = new BufferedOutputStream(new FileOutputStream("C:/Users/ASUS/Desktop/111.pdf"));
		byte[] hc = new byte[2048];
		int ff;
		
		ff = hcfz.read(hc);
		while (-ff!=(-1))
		{
			hczt.write(hc, 0, ff);
			ff = hcfz.read(hc);
		}		
		hczt.flush();
		
		hczt.close();
		hcfz.close();
	}
}
