package ru.yandex.trinoga.nikita.enrollment.components.schemas;

import lombok.Data;

@Data
public class SystemItemImport {
    private String id;
    private String url;
    private String parentId;
    private SystemItemType type;
    private int size;
}
