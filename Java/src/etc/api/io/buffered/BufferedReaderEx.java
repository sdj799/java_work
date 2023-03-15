package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Work\\file\\merong2.txt");
			br = new BufferedReader(fr);
			
			//BurfferedReader에는 ReadLine() 메서드가 있고
			//한 줄을 통째로 읽어서 String으로 리턴한다.
			//더 이상 읽어들일 데이터가 없다면 null을 리턴.
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
