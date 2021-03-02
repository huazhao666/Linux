package com.huazhao.controller;

import com.huazhao.model.Person;

public class AppController {
    public void service() {
        Person person = new Person(1, "Hello");

        System.out.println(person);
    }
}
