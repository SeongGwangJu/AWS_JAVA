package ch14_싱글톤;

public class Samsung {
    private String companyName;
    private int autoIncrementSerialNumber;

    public Samsung() {
        companyName = "Samsung";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setAutoIncrementSerialNumber(int autoIncrementSerialNumber) {
        this.autoIncrementSerialNumber = autoIncrementSerialNumber;
    }

    public int getAutoIncrementSerialNumber() {

        return autoIncrementSerialNumber;
    }
}
