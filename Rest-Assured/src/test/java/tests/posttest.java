package tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class posttest {

	public static void main(String[] args) {
		
		
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	    
		Date newdate = new Date();
		
		String today = date.format(newdate);
		
		System.out.println(today);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -7);
		Date today1 = cal.getTime();
		String fromdate = date.format(today1);
		System.out.println(fromdate);
	  String vaildTo ="validTo";
		
		

		String json = "{\r\n"
				+ "  \"merchantId\": \"8278cf7b-1a80-4762-9203-58204fd95ced\",\r\n"
				+ "  \"offerRequest\": {\r\n"
				+ "    \"en\": {\r\n"
				+ "      \"cashbackValue\": 0,\r\n"
				+ "      \"curatedOfferImage\": \"string\",\r\n"
				+ "      \"currency\": \"string\",\r\n"          
				+ "      \"description\": \"string\",\r\n"
				+ "      \"howToRedeem\": \"string\",\r\n"
				+ "      \"image\": \"string\",\r\n"
				+ "      \"locations\": [\r\n"
				+ "        \"string\"\r\n"
				+ "      ],\r\n"
				+ "      \"name\": \"string\",\r\n"
				+ "      \"offerActive\": true,\r\n"
				+ "      \"offerSource\": \"string\",\r\n"
				+ "      \"offerSourceImage\": \"string\",\r\n"
				+ "      \"offerStatus\": true,\r\n"
				+ "      \"offerType\": \"CARD_LINKED\",\r\n"
				+ "      \"online\": true,\r\n"
				+ "      \"partner\": true,\r\n"
				+ "      \"payoutType\": \"string\",\r\n"
				+ "      \"redemptionCode\": \"string\",\r\n"
				+ "      \"sensitiveFlag\": true,\r\n"
				+ "      \"termsAndConditions\": [\r\n"
				+ "        \"string\"\r\n"
				+ "      ],\r\n"
				+ "      \"url\": \"string\",\r\n"
				+ "      \"validFrom\": \"2022-10-14T09:59:56.295Z\",\r\n"
				+      "\""+vaildTo+"\""+":"+"\""+fromdate+"\""
				+ "    },\r\n"
				+ "    \"ar\": {\r\n"
				+ "      \"cashbackValue\": 0,\r\n"
				+ "      \"curatedOfferImage\": \"string\",\r\n"
				+ "      \"currency\": \"string\",\r\n"
				+ "      \"description\": \"string\",\r\n"
				+ "      \"howToRedeem\": \"string\",\r\n"
				+ "      \"image\": \"string\",\r\n"
				+ "      \"locations\": [\r\n"
				+ "        \"string\"\r\n"
				+ "      ],\r\n"
				+ "      \"name\": \"string\",\r\n"
				+ "      \"offerActive\": true,\r\n"
				+ "      \"offerSource\": \"string\",\r\n"
				+ "      \"offerSourceImage\": \"string\",\r\n"
				+ "      \"offerStatus\": true,\r\n"
				+ "      \"offerType\": \"CARD_LINKED\",\r\n"
				+ "      \"online\": true,\r\n"
				+ "      \"partner\": true,\r\n"
				+ "      \"payoutType\": \"string\",\r\n"
				+ "      \"redemptionCode\": \"string\",\r\n"
				+ "      \"sensitiveFlag\": true,\r\n"
				+ "      \"termsAndConditions\": [\r\n"
				+ "        \"string\"\r\n"
				+ "      ],\r\n"
				+ "      \"url\": \"string\",\r\n"
				+ "      \"validFrom\": \"2022-10-14T09:59:56.295Z\",\r\n"
				+      "\""+vaildTo+"\""+":"+"\""+fromdate+"\""
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
						
		System.out.println(json.toString());
	}

}
