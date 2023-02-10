package spring.nine.API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Subsidy {
    InformationData info = new InformationData();
    public void budget_bySector(){
        try {
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

    public void budget_byCentralGovernment(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_PCMNOF_SBBGST"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2020", "UTF-8")); /*사업연도*/
            urlBuilder.append("&" + URLEncoder.encode("jrsd_nm","UTF-8") + "=" + URLEncoder.encode("국회", "UTF-8")); /*소관명(중앙부처)*/
            urlBuilder.append("&" + URLEncoder.encode("realm_nm","UTF-8") + "=" + URLEncoder.encode("일반·지방행정", "UTF-8")); /*분야명*/
            urlBuilder.append("&" + URLEncoder.encode("exmk_nm","UTF-8") + "=" + URLEncoder.encode("민간이전", "UTF-8")); /*지출목명*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        } catch (IOException e){
            e.getStackTrace();
        }

    }

    public void budget_byEachItems(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_PEXTM_SBBGST"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2020", "UTF-8")); /*사업연도*/
            urlBuilder.append("&" + URLEncoder.encode("exmk_nm","UTF-8") + "=" + URLEncoder.encode("민간이전", "UTF-8")); /*지출목명*/
            urlBuilder.append("&" + URLEncoder.encode("jrsd_nm","UTF-8") + "=" + URLEncoder.encode("국회", "UTF-8")); /*소관명(중앙부처)*/
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
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public void business_BySector(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_PRMSCT_ABZMST"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2020", "UTF-8")); /*사업연도*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public void business_byCentralGovernment(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_PCMNOF_ABZMST"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2020", "UTF-8")); /*사업연도*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        } catch (IOException e){
            e.getStackTrace();
        }
    }

    public void status_businessDetails(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_DTLBZ_CSTS"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2020", "UTF-8")); /*사업연도*/
            urlBuilder.append("&" + URLEncoder.encode("dtlbz_nm","UTF-8") + "=" + URLEncoder.encode("성인전환기 발달장애인 자녀 진로상담 및 코칭 부모교육지원", "UTF-8")); /*내역사업기본정보의 내역사업명 관리항목*/
            urlBuilder.append("&" + URLEncoder.encode("jrsd_nm","UTF-8") + "=" + URLEncoder.encode("보건복지부", "UTF-8")); /*소관명*/
            urlBuilder.append("&" + URLEncoder.encode("exmk_nm","UTF-8") + "=" + URLEncoder.encode("민간이전", "UTF-8")); /*지출목명*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public void status_extraBusiness(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_ASBS_IFPBNT"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2017", "UTF-8")); /*사업연도*/
            urlBuilder.append("&" + URLEncoder.encode("ddtlbz_nm","UTF-8") + "=" + URLEncoder.encode("기초연금", "UTF-8")); /*보조사업명*/
            urlBuilder.append("&" + URLEncoder.encode("jrsd_nm","UTF-8") + "=" + URLEncoder.encode("보건복지부", "UTF-8")); /*소관명항목관리*/
            urlBuilder.append("&" + URLEncoder.encode("exc_instt_nm","UTF-8") + "=" + URLEncoder.encode("제주특별자치도", "UTF-8")); /*교부처 정보의 교부처명(100자리)*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public void info_extraBusiness(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_ABZM_IFPBNT_LIST"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2017", "UTF-8")); /*사업연도*/
            urlBuilder.append("&" + URLEncoder.encode("fiscal_year","UTF-8") + "=" + URLEncoder.encode("2017", "UTF-8")); /*회계연도*/
            urlBuilder.append("&" + URLEncoder.encode("ddtlbz_nm","UTF-8") + "=" + URLEncoder.encode("2017 공동방제단", "UTF-8")); /*보조사업명*/
            urlBuilder.append("&" + URLEncoder.encode("jrsd_nm","UTF-8") + "=" + URLEncoder.encode("농림축산식품부", "UTF-8")); /*소관명(중앙부처)*/
            urlBuilder.append("&" + URLEncoder.encode("pblntf_atrm_begin_de","UTF-8") + "=" + URLEncoder.encode("20180516", "UTF-8")); /*보조사업자 정보공시일자*/
            urlBuilder.append("&" + URLEncoder.encode("ifpbnt_sys_se_nm","UTF-8") + "=" + URLEncoder.encode("일반보조시설", "UTF-8")); /*정보공시시스템구분코드 항목관리일반보조사업보육시설사회복지시설창업진흥원*/
            urlBuilder.append("&" + URLEncoder.encode("exc_instt_nm","UTF-8") + "=" + URLEncoder.encode("통영축산농협", "UTF-8")); /*보조사업자명*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public void info_property(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_IMPPRP_IFPBNT_LIST"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("acyr","UTF-8") + "=" + URLEncoder.encode("2017", "UTF-8")); /*취득연도*/
            urlBuilder.append("&" + URLEncoder.encode("impprp_ty_nm","UTF-8") + "=" + URLEncoder.encode("기타", "UTF-8")); /*중요재산유형명*/
            urlBuilder.append("&" + URLEncoder.encode("prprty_ty_nm","UTF-8") + "=" + URLEncoder.encode("전기·통신기기", "UTF-8")); /*중요재산 유형의 상세 유형*/
            urlBuilder.append("&" + URLEncoder.encode("ctprvn_nm","UTF-8") + "=" + URLEncoder.encode("서울특별시", "UTF-8")); /*시도명*/
            urlBuilder.append("&" + URLEncoder.encode("jrsd_nm","UTF-8") + "=" + URLEncoder.encode("해양수산부", "UTF-8")); /*소관명*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public void idea_business(){
        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1051000/MoefOpenAPI/T_OPD_PBNS"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + info.getDecorded_APIkey().toString()); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식 ( XML/JSON )*/
            urlBuilder.append("&" + URLEncoder.encode("bsnsyear","UTF-8") + "=" + URLEncoder.encode("2021", "UTF-8")); /*사업연도*/
            urlBuilder.append("&" + URLEncoder.encode("realm_nm","UTF-8") + "=" + URLEncoder.encode("문화및관광", "UTF-8")); /*분야명 항목 관리*/
            urlBuilder.append("&" + URLEncoder.encode("pssrp_instt_se","UTF-8") + "=" + URLEncoder.encode("중앙부처", "UTF-8")); /*공모기관구분(중앙부처, 광역자치단체, 개인 등)*/
            urlBuilder.append("&" + URLEncoder.encode("pssrp_instt_nm","UTF-8") + "=" + URLEncoder.encode("문화체육관광부", "UTF-8")); /*공모기관명*/
            urlBuilder.append("&" + URLEncoder.encode("pblanc_nm","UTF-8") + "=" + URLEncoder.encode("2021 신문 우송비 지원 사업 보조사업자 공모(중앙일간지)", "UTF-8")); /*공고 제목 관리 컬럼*/
            urlBuilder.append("&" + URLEncoder.encode("pblanc_begin_det","UTF-8") + "=" + URLEncoder.encode("20210118", "UTF-8")); /*공모내역의 공고 시작일자 관리 컬럼*/
            urlBuilder.append("&" + URLEncoder.encode("pblanc_end_de","UTF-8") + "=" + URLEncoder.encode("20210125", "UTF-8")); /*공모내역의 공고 종료일자 관리 컬럼*/
            urlBuilder.append("&" + URLEncoder.encode("rcept_begin_de","UTF-8") + "=" + URLEncoder.encode("20210118", "UTF-8")); /*공모사업의 공고 접수 시작일자*/
            urlBuilder.append("&" + URLEncoder.encode("rcept_end_de","UTF-8") + "=" + URLEncoder.encode("20210125", "UTF-8")); /*공모사업의 공고 접수 종료일자*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
        }catch (IOException e){
            e.getStackTrace();
        }
    }

}
