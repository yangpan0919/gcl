package cn.tzauto.gcl.sevice;

import cn.tzauto.gcl.bean.AlarmBean;
import cn.tzauto.gcl.bean.GCLData;
import cn.tzauto.gcl.bean.OperationBean;
import cn.tzauto.gcl.dao.GCLMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GCLService {

    @Autowired
    GCLMapper gclMapper;

    public List<AlarmBean> queryAlarm(){
        return gclMapper.queryAlarm();
    }

    public List<OperationBean> queryOperation(){
        return gclMapper.queryOperation();
    }
    public List<GCLData> queryData(){
        return gclMapper.queryData();
    }



}
