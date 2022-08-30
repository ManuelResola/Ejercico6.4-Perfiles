package com.ejercicio6.ej6.perfiles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@PropertySource("miconfiguracion.properties")
@Component
@Data
class Propiedades {
    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

@GetMapping ("/parametros")
public  String index(){
    System.out.println("password = " + getPassword());
    System.out.println("url = " + getUrl());

    return "";
}
@Data
class MiConfiguracion {
    @Value("${valor1}")
    private String valor1;

    @Value("${valor2}")
    private String valor2;




    }

}





