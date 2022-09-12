package ru.yandex.trinoga.nikita.enrollment.components.schemas;

import lombok.Data;

import java.util.List;

@Data
public class SystemItem {
    private String id;
    private String url;
    private String date;
    private String parentId;
    private SystemItemType type;
    private int size;
    private List<SystemItem> children;
}
