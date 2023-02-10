package spring.nine.API;

public class InformationData {
    private final String encorded_APIkey = "24%2BxY3FOTGQExKs%2BgXvH8yTBk8ddPvKVpMX%2B1u9QEAwqYmiiulEgIfX%2BBBcG0Lzb6DtfHnJ%2BckJ%2BEzsyMoifzQ%3D%3D";
    private final String decorded_APIkey = "24+xY3FOTGQExKs+gXvH8yTBk8ddPvKVpMX+1u9QEAwqYmiiulEgIfX+BBcG0Lzb6DtfHnJ+ckJ+EzsyMoifzQ==";
    private StringBuilder temp_Xml_Data;
    public String getEncorded_APIkey() {
        return encorded_APIkey;
    }
    public String getDecorded_APIkey() {
        return decorded_APIkey;
    }
    public void xmlData(StringBuilder Data){
        temp_Xml_Data = Data;
    }
    public StringBuilder getTemp_Xml_Data(){
        return temp_Xml_Data;
    }
}
