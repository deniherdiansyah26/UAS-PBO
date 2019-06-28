/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UASPBOAVENGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        captain_america ca = new captain_america();
        ca.setnamaHero("captain america");
        ca.setHero1("\n" +
        "Kemampuan Captain America tidak memilikikekuatan super, \n" +
        "tetapi melalui Serum Super Soldier dan pengobatan Vita-Ray dia mempunyai kekuatan, \n" +
        "ketahanan, kelincahan, kecepatan, refleks, daya tahan, \n" +
        "dan penyembuahn berada di puncak alami manusia");
        System.out.println("nama Hero : "+ca.getnamaHero());
        System.out.println("karakter Hero : "+ca.getHero1());
        
        black_widow bw = new black_widow();
        bw.setnamaHero("black widow");
        bw.setHero2("\n" +
        "Kemampuan Black Widow bisa di bilang biasa saja, \n" +
        "kekuatannya cuma di seni bela diri, mulai dari karate, jujutsu, kung fu, dan seorang balerina, \n" +
        "dan black widow pun sama seperti pahlawan lain Black widow itu tek terpengaruh usia dan bisa regeneasi");
        System.out.println("nama Hero : "+bw.getnamaHero());
        System.out.println("karakter Hero : "+bw.getHero2());
        
        hulk hl = new hulk();
        hl.setnamaHero("hulk");
        hl.setHero3("\n" +
        "Kemampuan utama yang dimiliki hulk yaitu kekutan fisiknya \n" +
        "dan kekuatan hulk semakin meningkat seiring dengan kemarahannya, \n" +
        "hulk dapat mengangkat beban sampai 100 ton");
        System.out.println("nama Hero : "+hl.getnamaHero());
        System.out.println("karakter Hero : "+hl.getHero3());
        
        iron_man im = new iron_man();
        im.setnamaHero("iron man");
        im.setHero4("\n" +
        "Iron man memiliki armor bertenaga yang memberinya kekuatan dan daya tahan super, \n" +
        "terbang dan sederet senjata, \n" +
        "Armor diciptakan dan dipakai oleh stark");
        System.out.println("nama Hero : "+im.getnamaHero());
        System.out.println("karakter Hero : "+im.getHero4());
        
        spiderman sm = new spiderman();
        sm.setnamaHero("spiderman");
        sm.setHero5("\n" +
        "Spederman mempunyai kekuatan menempel dan merayap di tembok, \n" +
        "dan bisa mengeluarkan jaring yang kuat dari tangannya, \n" +
        "seperti pahlawan lain spiderman mempunyai  Superhuman durabilty");
        System.out.println("nama Hero : "+sm.getnamaHero());
        System.out.println("karakter Hero : "+sm.getHero5());
        
        dr_strange dr = new dr_strange();
        dr.setnamaHero("dr strange");
        dr.setHero6("\n" +
        "Dr Strange adalah seorang Socerer Supreme, praktisi ilmu sihir terbaik di dunia \n" +
        "dia belajar ilmu sihir dari Ancien One, \n" +
        "ancient One adalah tokoh mistis sakti dari himalaya");
        System.out.println("nama Hero : "+dr.getnamaHero());
        System.out.println("karakter Hero : "+dr.getHero6());
    }
    
}
