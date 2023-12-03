package com.example.SoftwareCompany.Component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class StandUpReminder {

    @Scheduled(cron = "0 15 8 * * *")
    public void sendStandUpReminders() {
        // Implement logic to send reminders
    }
}
