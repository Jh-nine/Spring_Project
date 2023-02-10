package spring.nine.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.nine.API.API_Test;
import spring.nine.API.InformationData;

@Controller
public class IndexController {
    @GetMapping("/")
    @ResponseBody
    public StringBuilder index(){
        InformationData info = new InformationData();
        return info.getTemp_Xml_Data();
    }
}
