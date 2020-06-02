package cn.tzauto.gcl.bean;

/**
 * {"AlarmID":"22865","EventTime":"2020-05-23 09:31:21","Explain_ID":"149","NewValue":"290.","OldValue":"292","OperatorID":"3","OperatorName":"SysAdmin"}
 */
public class OperationBean {

    private String alarmID;
    private String eventTime;
    private String explainID;
    private String oldValue;
    private String newValue;
    private String opID;
    private String opName;
    private String message;

    public String getAlarmID() {
        return alarmID;
    }

    public void setAlarmID(String alarmID) {
        this.alarmID = alarmID;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getExplainID() {
        return explainID;
    }

    public void setExplainID(String explainID) {
        this.explainID = explainID;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getOpID() {
        return opID;
    }

    public void setOpID(String opID) {
        this.opID = opID;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
