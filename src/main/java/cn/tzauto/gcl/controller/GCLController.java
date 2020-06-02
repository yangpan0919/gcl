package cn.tzauto.gcl.controller;

import cn.tzauto.gcl.bean.AlarmBean;
import cn.tzauto.gcl.bean.GCLData;
import cn.tzauto.gcl.bean.OperationBean;
import cn.tzauto.gcl.sevice.GCLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GCLController {

    @Autowired
    GCLService gclService;

    @GetMapping("test")
    public String test() {
        System.out.println("2222222222222");
        return "[{\"name\":\"张三\", \"math\":99, \"chinese\":88},{\"name\":\"李四\", \"math\":17, \"chinese\":46},{\"name\":\"赵五\", \"math\":60, \"chinese\":60}]";
    }

    @GetMapping("alarm")
    public List<AlarmBean> alarm() {
        return gclService.queryAlarm();
    }

    @GetMapping("operation")
    public List<OperationBean> Operation() {
        return gclService.queryOperation();
    }

    @GetMapping("data")
    public List<GCLData> data() {
        return gclService.queryData();
    }
}
