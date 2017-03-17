package com.lanccj.controller;

import com.jfinal.core.Controller;

/**
 * Created by LancCJ on 2017/3/17.
 */
public class IndexController extends Controller {
    public void index() {
        renderText("你好,爸爸!!!!");
    }
}
