package ru.yandex.trinoga.nikita.enrollment.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.trinoga.nikita.enrollment.components.schemas.SystemItem;
import ru.yandex.trinoga.nikita.enrollment.components.schemas.SystemItemImport;
import ru.yandex.trinoga.nikita.enrollment.components.schemas.SystemItemImportRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;

@RestController
public class Controller {
    Gson gson = new Gson();

    @PostMapping("/import")
    public String addItems(@RequestBody String body) {
        Type type = new TypeToken<ArrayList<SystemItemImportRequest>>(){}.getType();

        ArrayList<SystemItemImportRequest> items = gson.fromJson(body, type);

        for (SystemItemImportRequest item : items) {
            System.out.println(item.getUpdateDate());
            if (item.getItems() != null) {
                for (SystemItemImport file : item.getItems()) {
                    System.out.println(file);
                }
            }
        }

        return items.toString();
    }
}
