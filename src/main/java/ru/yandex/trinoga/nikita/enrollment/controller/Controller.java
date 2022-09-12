package ru.yandex.trinoga.nikita.enrollment.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.trinoga.nikita.enrollment.components.schemas.SystemItem;

@RestController
public class Controller {
    Gson gson = new Gson();

    @GetMapping("/import")
    public String addFilesAndFolders(@RequestBody String body) {

        SystemItem item = gson.fromJson(body, SystemItem.class);

        return item.toString();
    }
}
