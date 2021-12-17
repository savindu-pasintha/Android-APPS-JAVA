package spl.support.wifyblutoothonoffapp.sample;

public class Access {
    private String KeyName,keyValue;

    public Access(){ }
    public Access(String a, String b){
        this.KeyName=a;
        this.keyValue=b;
    }

    public String getKeyName() {
        return KeyName;
    }

    public void setKeyName(String keyName) {
        KeyName = keyName;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }
}
