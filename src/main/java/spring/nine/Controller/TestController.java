package spring.nine.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spring.nine.API.InformationData;

@RestController
public class TestController {
    InformationData info;
    @GetMapping("/Test")
    @ResponseBody
    public StringBuilder Test(){
        info = new InformationData();
        return info.getTemp_Xml_Data();
    }
}
