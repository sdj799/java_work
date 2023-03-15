package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {

		/*
		 - 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용한다.
		 - 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정한다.
		 */
		
		File file = new File("C:\\Work\\folder_test\\test\\mytest\\apple");
		
		if(!file.exists()) { // 해당 파일 및 폴더가 존재하면 true, 존재하지 않으면 false
//			file.mkdir(); -> 만들고자 하는 경로의 상위 디렉토리가 존재하지 않는다면 동작 안함.
			file.mkdirs(); //폴더 생성 makedirectory mkdir은 하위폴더 한개만 생성가능
//									, mkdirs는 하위폴더 여러개
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("해당 폴더가 존재합니다.");
		}
		
	}

}
