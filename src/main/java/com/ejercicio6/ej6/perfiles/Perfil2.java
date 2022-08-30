package com.ejercicio6.ej6.perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles {
    String perfil2 = "perfil2";

    @Override
    public void miFunion() {
        System.out.println(perfil2);
    }
}