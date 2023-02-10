package spring.nine.API;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class API_Test {
    static InformationData info;
    public API_Test(){
        try {
            info = new InformationData();
            StringBuilder urlBuilder = new StringBuilder("https://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_PRMSCT_SBBGST"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2021", "UTF-8")); /*사업연도*/
            urlBuilder.append("&" + URLEncoder.encode("realm_nm","UTF-8") + "=" + URLEncoder.encode("일반·지방행정", "UTF-8")); /*분야명*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                System.out.println("BufferReader Err");
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb);
        } catch (IOException e){
            e.getStackTrace();
        }

    }
}
