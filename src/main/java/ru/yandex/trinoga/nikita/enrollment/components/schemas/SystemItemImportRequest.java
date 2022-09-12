package ru.yandex.trinoga.nikita.enrollment.components.schemas;

import lombok.Data;

import java.util.ArrayList;

@Data
public class SystemItemImportRequest {
    private ArrayList<SystemItemImport> items;
    private String updateDate;
}
