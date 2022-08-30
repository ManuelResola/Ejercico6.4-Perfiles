package com.ejercicio6.ej6.perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles {
        String perfil1 = "perfil1";

    @Override
    public void miFunion() {
        System.out.println(perfil1);
    }
}