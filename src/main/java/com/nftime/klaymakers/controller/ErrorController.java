package com.nftime.klaymakers.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
@Controller
@Slf4j
@RequestMapping("${server.error.path:${error.path:/error}}")
public class ErrorController extends BasicErrorController {

    public ErrorController(ErrorAttributes ea
            , ServerProperties sp
            , List<ErrorViewResolver> evr) {
        super(ea, sp.getError(), evr);
    }

    @Override
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView errorHtml(HttpServletRequest req
            , HttpServletResponse res) {
        log.error("{}", req);
        return super.errorHtml(req, res);
    }

    @Override
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest req) {
        log.error("{}", req);
        return super.error(req);
    }
}