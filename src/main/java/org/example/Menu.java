package org.example;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static void MenuPrincipal(){

        ConsoleUtils.mensaje("Por favor elija la divisa a convertir: ");
        ConsoleUtils.mensaje("1 - USD");
        ConsoleUtils.mensaje("2 - EUR");
        ConsoleUtils.mensaje("3 - ARS");
        ConsoleUtils.mensaje("0 - SALIR");
        Integer opcion1 = ConsoleUtils.leerEntero();

        if (opcion1 == 0){
            ConsoleUtils.mensaje("Gracias por usar nuestro programa");
            return;
        }

        ConsoleUtils.mensaje("Por favor elija el tipo de cambio: ");
        ConsoleUtils.mensaje("1 - USD");
        ConsoleUtils.mensaje("2 - EUR");
        ConsoleUtils.mensaje("3 - ARS");
        ConsoleUtils.mensaje("0 - SALIR");
        Integer opcion2 = ConsoleUtils.leerEntero();

        if (opcion2 == 0){
            ConsoleUtils.mensaje("Gracias por usar nuestro programa");
            return;
        }

        ConsoleUtils.mensaje("Por favor ingrese el monto a convertir: ");
        Double monto = ConsoleUtils.leerMonto();

        DatosMonedas resultado = realizarConversion(opcion1,opcion2,monto);
        System.out.println(resultado);
    }

    private static DatosMonedas realizarConversion(Integer opcion1, Integer opcion2, Double monto){

//        String moneda1 = "";
//        String moneda2 = "";
//
//        if(opcion1 == 1) moneda1 = "USD";
//        if(opcion1 == 2) moneda1 = "EUR";
//        if(opcion1 == 3) moneda1 = "ARS";
//
//        if(opcion2 == 1) moneda2 = "USD";
//        if(opcion2 == 2) moneda2 = "EUR";
//        if(opcion2 == 3) moneda2 = "ARS";

        Map<Integer,String> monedas = Map.of(1,"USD", 2,"EUR",3,"ARS");

        String moneda1 = monedas.get(opcion1);
        String moneda2 = monedas.get(opcion2);

        String amount = String.valueOf(monto);
        ConsultaApi api = new ConsultaApi();
        DatosMonedas datos = api.getAmount(moneda1,moneda2,amount);
        return datos;
    }


}
