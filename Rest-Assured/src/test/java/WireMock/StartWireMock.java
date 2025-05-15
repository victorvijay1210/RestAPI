package WireMock;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

public class StartWireMock  {
	
	
	public static void main(String[] args) {
		WireMockRule wireMockRule = new WireMockRule(8089); 
	//	WireMockRule wireMockRule = new WireMockRule(wireMockConfig().port(8089).httpsPort(8443));
		
		//wireMockRule.start();
		//System.out.println("WireMock Started");
	
		wireMockRule.stop();
		//System.out.println("WireMock Stopped");
		
	}

	

}
