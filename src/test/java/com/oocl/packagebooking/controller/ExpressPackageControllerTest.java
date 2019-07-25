package com.oocl.packagebooking.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oocl.packagebooking.service.PackageService;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.oocl.packagebooking.model.ExpressPackage;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PackageController.class)
public class ExpressPackageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PackageService packageService;

    @Test
    void should_return_package_list() throws Exception{
        ExpressPackage Pack = new ExpressPackage(001,"liufan","489489",40);
        ExpressPackage Pack2 = new ExpressPackage(002,"l78fan","123489",4);
        List<ExpressPackage> expressPackages = Arrays.asList(Pack,Pack);

        when(packageService.findAllPackage()).thenReturn(expressPackages);

        ResultActions resultActions = mockMvc.perform(get("/packages"));

        resultActions.andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }

}