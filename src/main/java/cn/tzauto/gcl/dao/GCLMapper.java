package cn.tzauto.gcl.dao;

import cn.tzauto.gcl.bean.AlarmBean;
import cn.tzauto.gcl.bean.GCLData;
import cn.tzauto.gcl.bean.OperationBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GCLMapper {

    List<AlarmBean> queryAlarm();

    List<OperationBean> queryOperation();

    List<GCLData> queryData();
}
