package com.ra.bai3;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HospitalConfig {

    @Value("${hospital.name}")
    private String hospitalName;

    @Value("${hospital.hotline}")
    private String hospitalHotline;

    @Value("${hospital.db-ip}")
    private String databaseIp;

    @PostConstruct
    public void displayConfig() {
        System.out.println("===== THÔNG TIN CẤU HÌNH BỆNH VIỆN =====");
        System.out.println("Tên bệnh viện: " + hospitalName);
        System.out.println("Hotline: " + hospitalHotline);
        System.out.println("Database IP: " + databaseIp);
        System.out.println("========================================");
    }
}