package com.nascon.shop.controller;

import com.nascon.shop.dto.ToolDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/v1/tools")
public class RestController {

    @GetMapping("/")
    public String index(){
        ToolDTO tool = new ToolDTO("name");
        return tool.getName();
    }

    @GetMapping("/getTools")
    public ResponseEntity<List<ToolDTO>> getTools(){
        ToolDTO tool = new ToolDTO("name");
        List<ToolDTO> tools = new ArrayList<>();
        tools.add(tool);
        return ResponseEntity.ok(tools);
    }
}
