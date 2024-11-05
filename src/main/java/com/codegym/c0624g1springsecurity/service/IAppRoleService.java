package com.codegym.c0624g1springsecurity.service;

import com.codegym.c0624g1springsecurity.model.AppRole;
import com.codegym.c0624g1springsecurity.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
