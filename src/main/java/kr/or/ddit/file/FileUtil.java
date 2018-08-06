package kr.or.ddit.file;

public class FileUtil {
	
	// 파일 업로드 경로
	public final static String fileUploadPath = "D:\\A_TeachingMaterial\\7.JspSpring\\fileUpload";
	
	/**
	* Method : getFileName
	* 최초작성일 : 2018. 7. 16.
	* 작성자 : PC04
	* 변경이력 :
	* @param contentDisposition
	* @return
	* Method 설명 : part의 Content-Disposition header로 부터 업로드 파일명을 리턴한다.
	* 
	* ex : form-data; name="uploadFile"; filename="icebear.jpg"
	*/
	public static String getFileName(String contentDisposition){
		String[] splitStr = contentDisposition.split("; ");
		
		for (String str : splitStr) {
			String[] resultArr = str.split("=");
			
			if(resultArr[0].startsWith("filename"))
//			if(resultArr[0].equals("filename"))
				return resultArr[1].replaceAll("\"", "");
//				return resultArr[1].substring(1,(resultArr[1].length()-1));
		}		
		return "";
	}
}
