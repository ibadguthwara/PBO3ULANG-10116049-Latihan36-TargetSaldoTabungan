/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan36.targetsaldotabungan;

/**
 *
 * @author ibadguthwara
 */
public class Tabungan {
    private static final double BANK_INTEREST = 0.08;

    private double saldoAwal = 3500000.0;
    private double saldoTarget = 6000000.0;
    private int lamaBulan = 0;

    private void menabung() {
        saldoAwal += saldoAwal * BANK_INTEREST;
        lamaBulan += 1;
    }

    public void printTargetSaldo(){    
        do{                                    
            menabung();
            System.out.printf(
                "Saldo di bulan ke-"
                .concat(String.valueOf(lamaBulan))
                .concat(" Rp.")
                .concat(String.valueOf("%,d\r\n")), 
                (int) saldoAwal);
        } while(saldoAwal < saldoTarget);
    }
    
}
