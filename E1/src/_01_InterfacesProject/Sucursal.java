package _01_InterfacesProject;

import Utils.Random;

public class Sucursal implements Buy, Sell {

    public long caja = 0;

    public void buy() {

        int buyingPrice = Random.getRandom(2, 15);
        caja = caja - buyingPrice;

        System.out.println("Se ha realizado una compra. Caja: " + caja + "€");
        System.out.println("\t Compra: " + buyingPrice + "€");

    }

    public void sell() {

        int sellingPrice = Random.getRandom(5, 20);
        caja = caja + sellingPrice;

        System.out.println("Se ha realizado una venta. Caja: " + caja + "€");
        System.out.println("\t Venta: " + sellingPrice + "€");

    }
    
}
