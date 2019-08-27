package br.com.sulamerica.senhasegura.properties;

public class Configuration {
	
	private static String URL = "https://senhasegura.localdomain/";
	private static String ACCESS_TOKEN_PATH = "/autorization";
	private static String AUTORIZATION_TOKEN_PATH = "/validate";
	private static String CLIENT_ID = "JDVAppID";
	private static String ACCESS_TOKEN = "Bearer-e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
	private static String EXPIRE_TOKEN = "600";
	
	
	
	
	public static String getURL() {
		return URL;
	}
	public static void setURL(String uRL) {
		URL = uRL;
	}
	public static String getACCESS_TOKEN_PATH() {
		return ACCESS_TOKEN_PATH;
	}
	public static void setACCESS_TOKEN_PATH(String aCCESS_TOKEN_PATH) {
		ACCESS_TOKEN_PATH = aCCESS_TOKEN_PATH;
	}
	public static String getAUTORIZATION_TOKEN_PATH() {
		return AUTORIZATION_TOKEN_PATH;
	}
	public static void setAUTORIZATION_TOKEN_PATH(String aUTORIZATION_TOKEN_PATH) {
		AUTORIZATION_TOKEN_PATH = aUTORIZATION_TOKEN_PATH;
	}
	public static String getCLIENT_ID() {
		return CLIENT_ID;
	}
	public static void setCLIENT_ID(String cLIENT_ID) {
		CLIENT_ID = cLIENT_ID;
	}
	public static String getACCESS_TOKEN() {
		return ACCESS_TOKEN;
	}
	public static void setACCESS_TOKEN(String aCCESS_TOKEN) {
		ACCESS_TOKEN = aCCESS_TOKEN;
	}
	public static String getEXPIRE_TOKEN() {
		return EXPIRE_TOKEN;
	}
	public static void setEXPIRE_TOKEN(String eXPIRE_TOKEN) {
		EXPIRE_TOKEN = eXPIRE_TOKEN;
	}
}
