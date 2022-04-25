package kz.aui.cybersec.models;

public class Security {
    private int security_staff_num;
    private String siem;
    private String analyze_data;
    private String integration_soc;
    private double training;
    private String policy;
    private double password;
    private double malware;


    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public Security(){};


    public Security(int security_staff_num, String siem, String analyze_data, String integration_soc) {
        this.security_staff_num = security_staff_num;
        this.siem = siem;
        this.analyze_data = analyze_data;
        this.integration_soc = integration_soc;
    }

    public int getSecurity_staff_num() {
        return security_staff_num;
    }

    public void setSecurity_staff_num(int security_staff_num) {
        this.security_staff_num = security_staff_num;
    }

    public String getSiem() {
        return siem;
    }

    public void setSiem(String siem) {
        this.siem = siem;
    }

    public String getAnalyze_data() {
        return analyze_data;
    }

    public void setAnalyze_data(String analyze_data) {
        this.analyze_data = analyze_data;
    }

    public String getIntegration_soc() {
        return integration_soc;
    }

    public void setIntegration_soc(String integration_soc) {
        this.integration_soc = integration_soc;
    }

    public double getTraining() {
        return training;
    }

    public void setTraining(double training) {
        this.training = training;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public double getMalware() {
        return malware;
    }

    public void setMalware(double malware) {
        this.malware = malware;
    }
}
