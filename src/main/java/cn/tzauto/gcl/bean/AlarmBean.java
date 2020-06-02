package cn.tzauto.gcl.bean;

/**
 * {"AlarmID":"195380","AlarmTime":"2020-05-24 08:37:29","Explain_ID":"65","IfAlarm":"T","RegainTime":""}
 */
public class AlarmBean {

    private String alarmID;
    private String alarmTime;
    private String explainID;
    private String regainTime;
    private String message;

    public String getRegainTime() {
        return regainTime;
    }

    public void setRegainTime(String regainTime) {
        this.regainTime = regainTime;
    }

    public String getAlarmID() {
        return alarmID;
    }

    public void setAlarmID(String alarmID) {
        this.alarmID = alarmID;
    }

    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    public String getExplainID() {
        return explainID;
    }

    public void setExplainID(String explainID) {
        this.explainID = explainID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
