package ru.yandex.trinoga.nikita.enrollment.components.schemas;

import lombok.Data;

@Data
public class Error {
    private int code;
    private String message;
}
