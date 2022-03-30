package com.example.Assignment4.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Errordetails {
    private Date timestamp;
    private String message;
    private String details;
}