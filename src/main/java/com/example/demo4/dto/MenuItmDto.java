package com.example.demo4.dto;

import java.util.List;

public class MenuItmDto {


    private MenuItemType type;
    private String titel;
    private UIPageDto page;
    private List<MenuItmDto> children;

    public MenuItmDto() {

    }

    public MenuItmDto(MenuItemType type, String title, UIPageDto page, List<MenuItmDto> children) {
        this.type = type;
        this.titel = title;
        this.page = page;
        this.children = children;

    }

    public MenuItemType getType() {
        return type;
    }

    public void setType(MenuItemType type) {
        this.type = type;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String title) {
        this.titel = title;
    }

    public UIPageDto getPage() {
        return page;
    }

    public void setPage(UIPageDto page) {
        this.page = page;
    }

    public List<MenuItmDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuItmDto> children) {
        this.children = children;
    }
}







