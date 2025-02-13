package com.project.email_assistant;

import lombok.Data;

@Data
public class EmailRequest {

    private String emailContent;
    private String tone;
}
