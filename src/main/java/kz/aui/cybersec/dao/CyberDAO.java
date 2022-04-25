package kz.aui.cybersec.dao;
import kz.aui.cybersec.models.Security;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class CyberDAO {

    public List<Security> securityList;

    private int count = 0;

    {
        securityList = new ArrayList<>();
        securityList.add(new Security(20, "Yes", "Yes", "No"));
        securityList.add(new Security(30, "Yes", "Yes", "No"));
        securityList.add(new Security(15, "Yes", "Yes", "No"));
    }

    private int n;

    public List<Security> test_num() {
        return securityList;
    }

    public void res(int ssn){
        System.out.println(ssn);
    }

    public void save(Security security){
        securityList.add(security);
        if (security.getSecurity_staff_num() <= 15 && security.getSecurity_staff_num() > 0){
            count += 5;
        }
        else if (security.getSecurity_staff_num() > 15 && security.getSecurity_staff_num() < 30) {
            count += 10;
        }
        else if (security.getSecurity_staff_num() > 30) {
            count += 15;
        }
        else {
            security.setLevel("Invalid value");
        }

        if (security.getSiem().equals("yes")){
            count += 10;
        }
        if (security.getAnalyze_data().equals("yes")){
            count += 15;
        }
        if (security.getIntegration_soc().equals("yes")){
            count += 20;
        }
        if (security.getTraining() >= 90.0){
            count += 10;
        }
        if (security.getPolicy().equals("yes")){
            count += 10;
        }
        if (security.getPassword() >= 90.0){
            count += 10;
        }
        if (security.getMalware() >= 90.0){
            count += 10;
        }

        System.out.println(count);

        if(count > 0 && count <= 25){
            security.setLevel("You security level is Low");
        }
        if(count > 25 && count <= 75){
            security.setLevel("You security level is Medium");
        }
        if(count > 75 && count <= 100){
            security.setLevel("You security level is High");
        }

    }


}
