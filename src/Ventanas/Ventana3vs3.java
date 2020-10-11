package Ventanas;

import ConcreteHeros.*;
import Principal.Map3vs3;
import Principal.Senda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.KeyAdapter;

public class Ventana3vs3 {
    private JPanel rootPanel;
    private JButton playTurnButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton intercambiarButton;
    private JLabel inconHeroTop1;
    private JLabel inconHeroTop2;
    private JLabel nameheroTop1;
    private JLabel nameheroTop2;
    private JLabel hpValueTop1;
    private JLabel hpValueTop2;
    private JLabel manaValueTop1;
    private JLabel damageValueTop1;
    private JLabel armorValueTop1;
    private JLabel manaValueTop2;
    private JLabel damageValueTop2;
    private JLabel armorValueTop2;
    private JLabel inconHeroMid1;
    private JLabel inconHeroMid2;
    private JLabel hpValueMid1;
    private JLabel manaValueMid1;
    private JLabel damageValueMid1;
    private JLabel armorValueMid1;
    private JLabel hpValueMid2;
    private JLabel manaValueMid2;
    private JLabel damageValueMid2;
    private JLabel armorValueMid2;
    private JLabel inconHeroBot1;
    private JLabel nameheroMid1;
    private JLabel nameheroMid2;
    private JLabel nameheroBot1;
    private JLabel hpValueBot1;
    private JLabel manaValueBot1;
    private JLabel damageValueBot1;
    private JLabel armorValueBot1;
    private JLabel inconHeroBot2;
    private JLabel nameheroBot2;
    private JLabel hpValueBot2;
    private JLabel manaValueBot2;
    private JLabel damageValueBot2;
    private JLabel armorValueBot2;

    private Map3vs3 map3vs3;
    private JFrame v;

    private String sendaAintercambiar1 = "top";
    private String sendaAintercambiar2 = "top";

    public Ventana3vs3(Map3vs3 map3vs3, VentanaPrincipal vp) {
        this.map3vs3 = map3vs3;

        update();
        v = new JFrame();
        v.setContentPane(getRootPanel());
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);

        playTurnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(
                        (map3vs3.getTop().getHero1().getVida() <= 0  &&  map3vs3.getMid().getHero1().getVida() <= 0 && map3vs3.getBot().getHero1().getVida() <= 0)
                                ||
                                (map3vs3.getTop().getHero2().getVida() <= 0&& map3vs3.getMid().getHero2().getVida() <= 0 && map3vs3.getBot().getHero2().getVida() <= 0)
                )
                {
                    System.out.println("Fin del Juego");
                    v.setVisible(false);
                    v.dispose();
                    VentanaPrincipal Vp = new VentanaPrincipal(vp.getUser(),vp.getDota());
                }
                else{
                    map3vs3.play();
                    update();
                }


            }
        });
        intercambiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String senda1 = comboBox1.getSelectedItem().toString();
                String senda2 = comboBox2.getSelectedItem().toString();
                Senda s1 ;
                Senda s2 ;
                switch (senda1){
                    case "Top": s1 = map3vs3.getTop();break;
                    case "Mid": s1 = map3vs3.getMid();break;
                    case "Bot": s1 = map3vs3.getBot();break;
                    default: s1 = null;
                }
                switch (senda2){
                    case "Top": s2 = map3vs3.getTop();break;
                    case "Mid": s2 = map3vs3.getMid();break;
                    case "Bot": s2 = map3vs3.getBot();break;
                    default: s2 = null;
                }
                map3vs3.intercambiarHeroes1(s1,s2);
                update();
            }
        });

    }

    public void update(){
//////////////////////////     TOP      /////////////////////////////////////////////////////////////////////////////////////////////
        inconHeroTop1.setIcon(map3vs3.getTop().getHero1().getIcon());
        nameheroTop1.setText(map3vs3.getTop().getHero1().getName());
        hpValueTop1.setText(""+map3vs3.getTop().getHero1().getVida());
        manaValueTop1.setText(""+map3vs3.getTop().getHero1().getMana());
        damageValueTop1.setText(""+map3vs3.getTop().getHero1().getBasicDamage());
        armorValueTop1.setText(""+map3vs3.getTop().getHero1().getArmadura());

        inconHeroTop2.setIcon(map3vs3.getTop().getHero2().getIcon());
        nameheroTop2.setText(map3vs3.getTop().getHero2().getName());
        hpValueTop2.setText(""+map3vs3.getTop().getHero2().getVida());
        manaValueTop2.setText(""+map3vs3.getTop().getHero2().getMana());
        damageValueTop2.setText(""+map3vs3.getTop().getHero2().getBasicDamage());
        armorValueTop2.setText(""+map3vs3.getTop().getHero2().getArmadura());

//////////////////////////     MID      ////////////////////////////////////////////////////////////////////////////////////////////
        inconHeroMid1.setIcon(map3vs3.getMid().getHero1().getIcon());
        nameheroMid1.setText(map3vs3.getMid().getHero1().getName());
        hpValueMid1.setText(""+map3vs3.getMid().getHero1().getVida());
        manaValueMid1.setText(""+map3vs3.getMid().getHero1().getMana());
        damageValueMid1.setText(""+map3vs3.getMid().getHero1().getBasicDamage());
        armorValueMid1.setText(""+map3vs3.getMid().getHero1().getArmadura());


        inconHeroMid2.setIcon(map3vs3.getMid().getHero2().getIcon());
        nameheroMid2.setText(map3vs3.getMid().getHero2().getName());
        hpValueMid2.setText(""+map3vs3.getMid().getHero2().getVida());
        manaValueMid2.setText(""+map3vs3.getMid().getHero2().getMana());
        damageValueMid2.setText(""+map3vs3.getMid().getHero2().getBasicDamage());
        armorValueMid2.setText(""+map3vs3.getMid().getHero2().getArmadura());

//////////////////////////     BOT      /////////////////////////////////////////////////////////////////////////////////////////////
        inconHeroBot1.setIcon(map3vs3.getBot().getHero1().getIcon());
        nameheroBot1.setText(map3vs3.getBot().getHero1().getName());
        hpValueBot1.setText(""+map3vs3.getBot().getHero1().getVida());
        manaValueBot1.setText(""+map3vs3.getBot().getHero1().getMana());
        damageValueBot1.setText(""+map3vs3.getBot().getHero1().getBasicDamage());
        armorValueBot1.setText(""+map3vs3.getBot().getHero1().getArmadura());


        inconHeroBot2.setIcon(map3vs3.getBot().getHero2().getIcon());
        nameheroBot2.setText(map3vs3.getBot().getHero2().getName());
        hpValueBot2.setText(""+map3vs3.getBot().getHero2().getVida());
        manaValueBot2.setText(""+map3vs3.getBot().getHero2().getMana());
        damageValueBot2.setText(""+map3vs3.getBot().getHero2().getBasicDamage());
        armorValueBot2.setText(""+map3vs3.getBot().getHero2().getArmadura());
        /////////////////// Dead HERO ////////////////////////////////////////////

        if (map3vs3.getTop().getHero1().getVida() <= 0)
            nameheroTop1.setForeground(Color.RED);
        else
            nameheroTop1.setForeground(Color.WHITE);
        if ( map3vs3.getTop().getHero2().getVida() <= 0)
            nameheroTop2.setForeground(Color.RED);
        else
            nameheroTop2.setForeground(Color.WHITE);


        if (map3vs3.getMid().getHero1().getVida() <= 0 )
            nameheroMid1.setForeground(Color.RED);
        else
            nameheroMid1.setForeground(Color.WHITE);

        if (map3vs3.getMid().getHero2().getVida() <= 0 )
            nameheroMid2.setForeground(Color.RED);
        else
            nameheroMid2.setForeground(Color.WHITE);


        if (map3vs3.getBot().getHero1().getVida() <= 0 )
            nameheroBot1.setForeground(Color.RED);
        else
            nameheroBot1.setForeground(Color.WHITE);

        if (map3vs3.getBot().getHero2().getVida() <= 0 )
            nameheroBot2.setForeground(Color.RED);
        else
            nameheroBot2.setForeground(Color.WHITE);

        if(
                (map3vs3.getTop().getHero1().getVida() <= 0  &&  map3vs3.getMid().getHero1().getVida() <= 0 && map3vs3.getBot().getHero1().getVida() <= 0)
                        ||
                        (map3vs3.getTop().getHero2().getVida() <= 0&& map3vs3.getMid().getHero2().getVida() <= 0 && map3vs3.getBot().getHero2().getVida() <= 0)
        )
            playTurnButton.setText("Volver a la Ventana Principal");
    }








    /////////////////////////////////////////////GETTERS AND SETTERS ///////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public JFrame getV() {
        return v;
    }

    public void setV(JFrame v) {
        this.v = v;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public JButton getPlayTurnButton() {
        return playTurnButton;
    }

    public void setPlayTurnButton(JButton playTurnButton) {
        this.playTurnButton = playTurnButton;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JComboBox getComboBox2() {
        return comboBox2;
    }

    public void setComboBox2(JComboBox comboBox2) {
        this.comboBox2 = comboBox2;
    }

    public JButton getIntercambiarButton() {
        return intercambiarButton;
    }

    public void setIntercambiarButton(JButton intercambiarButton) {
        this.intercambiarButton = intercambiarButton;
    }

    public JLabel getInconHeroTop1() {
        return inconHeroTop1;
    }

    public void setInconHeroTop1(JLabel inconHeroTop1) {
        this.inconHeroTop1 = inconHeroTop1;
    }

    public JLabel getInconHeroTop2() {
        return inconHeroTop2;
    }

    public void setInconHeroTop2(JLabel inconHeroTop2) {
        this.inconHeroTop2 = inconHeroTop2;
    }

    public JLabel getNameheroTop1() {
        return nameheroTop1;
    }

    public void setNameheroTop1(JLabel nameheroTop1) {
        this.nameheroTop1 = nameheroTop1;
    }

    public JLabel getNameheroTop2() {
        return nameheroTop2;
    }

    public void setNameheroTop2(JLabel nameheroTop2) {
        this.nameheroTop2 = nameheroTop2;
    }

    public JLabel getHpValueTop1() {
        return hpValueTop1;
    }

    public void setHpValueTop1(JLabel hpValueTop1) {
        this.hpValueTop1 = hpValueTop1;
    }

    public JLabel getHpValueTop2() {
        return hpValueTop2;
    }

    public void setHpValueTop2(JLabel hpValueTop2) {
        this.hpValueTop2 = hpValueTop2;
    }

    public JLabel getManaValueTop1() {
        return manaValueTop1;
    }

    public void setManaValueTop1(JLabel manaValueTop1) {
        this.manaValueTop1 = manaValueTop1;
    }

    public JLabel getDamageValueTop1() {
        return damageValueTop1;
    }

    public void setDamageValueTop1(JLabel damageValueTop1) {
        this.damageValueTop1 = damageValueTop1;
    }

    public JLabel getArmorValueTop1() {
        return armorValueTop1;
    }

    public void setArmorValueTop1(JLabel armorValueTop1) {
        this.armorValueTop1 = armorValueTop1;
    }

    public JLabel getManaValueTop2() {
        return manaValueTop2;
    }

    public void setManaValueTop2(JLabel manaValueTop2) {
        this.manaValueTop2 = manaValueTop2;
    }

    public JLabel getDamageValueTop2() {
        return damageValueTop2;
    }

    public void setDamageValueTop2(JLabel damageValueTop2) {
        this.damageValueTop2 = damageValueTop2;
    }

    public JLabel getArmorValueTop2() {
        return armorValueTop2;
    }

    public void setArmorValueTop2(JLabel armorValueTop2) {
        this.armorValueTop2 = armorValueTop2;
    }

    public JLabel getInconHeroMid1() {
        return inconHeroMid1;
    }

    public void setInconHeroMid1(JLabel inconHeroMid1) {
        this.inconHeroMid1 = inconHeroMid1;
    }

    public JLabel getInconHeroMid2() {
        return inconHeroMid2;
    }

    public void setInconHeroMid2(JLabel inconHeroMid2) {
        this.inconHeroMid2 = inconHeroMid2;
    }

    public JLabel getHpValueMid1() {
        return hpValueMid1;
    }

    public void setHpValueMid1(JLabel hpValueMid1) {
        this.hpValueMid1 = hpValueMid1;
    }

    public JLabel getManaValueMid1() {
        return manaValueMid1;
    }

    public void setManaValueMid1(JLabel manaValueMid1) {
        this.manaValueMid1 = manaValueMid1;
    }

    public JLabel getDamageValueMid1() {
        return damageValueMid1;
    }

    public void setDamageValueMid1(JLabel damageValueMid1) {
        this.damageValueMid1 = damageValueMid1;
    }

    public JLabel getArmorValueMid1() {
        return armorValueMid1;
    }

    public void setArmorValueMid1(JLabel armorValueMid1) {
        this.armorValueMid1 = armorValueMid1;
    }

    public JLabel getHpValueMid2() {
        return hpValueMid2;
    }

    public void setHpValueMid2(JLabel hpValueMid2) {
        this.hpValueMid2 = hpValueMid2;
    }

    public JLabel getManaValueMid2() {
        return manaValueMid2;
    }

    public void setManaValueMid2(JLabel manaValueMid2) {
        this.manaValueMid2 = manaValueMid2;
    }

    public JLabel getDamageValueMid2() {
        return damageValueMid2;
    }

    public void setDamageValueMid2(JLabel damageValueMid2) {
        this.damageValueMid2 = damageValueMid2;
    }

    public JLabel getArmorValueMid2() {
        return armorValueMid2;
    }

    public void setArmorValueMid2(JLabel armorValueMid2) {
        this.armorValueMid2 = armorValueMid2;
    }

    public JLabel getInconHeroBot1() {
        return inconHeroBot1;
    }

    public void setInconHeroBot1(JLabel inconHeroBot1) {
        this.inconHeroBot1 = inconHeroBot1;
    }

    public JLabel getNameheroMid1() {
        return nameheroMid1;
    }

    public void setNameheroMid1(JLabel nameheroMid1) {
        this.nameheroMid1 = nameheroMid1;
    }

    public JLabel getNameheroMid2() {
        return nameheroMid2;
    }

    public void setNameheroMid2(JLabel nameheroMid2) {
        this.nameheroMid2 = nameheroMid2;
    }

    public JLabel getNameheroBot1() {
        return nameheroBot1;
    }

    public void setNameheroBot1(JLabel nameheroBot1) {
        this.nameheroBot1 = nameheroBot1;
    }

    public JLabel getHpValueBot1() {
        return hpValueBot1;
    }

    public void setHpValueBot1(JLabel hpValueBot1) {
        this.hpValueBot1 = hpValueBot1;
    }

    public JLabel getManaValueBot1() {
        return manaValueBot1;
    }

    public void setManaValueBot1(JLabel manaValueBot1) {
        this.manaValueBot1 = manaValueBot1;
    }

    public JLabel getDamageValueBot1() {
        return damageValueBot1;
    }

    public void setDamageValueBot1(JLabel damageValueBot1) {
        this.damageValueBot1 = damageValueBot1;
    }

    public JLabel getArmorValueBot1() {
        return armorValueBot1;
    }

    public void setArmorValueBot1(JLabel armorValueBot1) {
        this.armorValueBot1 = armorValueBot1;
    }

    public JLabel getInconHeroBot2() {
        return inconHeroBot2;
    }

    public void setInconHeroBot2(JLabel inconHeroBot2) {
        this.inconHeroBot2 = inconHeroBot2;
    }

    public JLabel getNameheroBot2() {
        return nameheroBot2;
    }

    public void setNameheroBot2(JLabel nameheroBot2) {
        this.nameheroBot2 = nameheroBot2;
    }

    public JLabel getHpValueBot2() {
        return hpValueBot2;
    }

    public void setHpValueBot2(JLabel hpValueBot2) {
        this.hpValueBot2 = hpValueBot2;
    }

    public JLabel getManaValueBot2() {
        return manaValueBot2;
    }

    public void setManaValueBot2(JLabel manaValueBot2) {
        this.manaValueBot2 = manaValueBot2;
    }

    public JLabel getDamageValueBot2() {
        return damageValueBot2;
    }

    public void setDamageValueBot2(JLabel damageValueBot2) {
        this.damageValueBot2 = damageValueBot2;
    }

    public JLabel getArmorValueBot2() {
        return armorValueBot2;
    }

    public void setArmorValueBot2(JLabel armorValueBot2) {
        this.armorValueBot2 = armorValueBot2;
    }

    public Map3vs3 getMap3vs3() {
        return map3vs3;
    }

    public void setMap3vs3(Map3vs3 map3vs3) {
        this.map3vs3 = map3vs3;
    }


    public static void main(String[] args) {
        Senda top = new Senda(new Lion(),new TerrorBlade());
        Senda mid = new Senda(new Queen(),new Sven());
        Senda bot = new Senda(new Necro(),new Templar());
        Ventana3vs3 v = new Ventana3vs3(new Map3vs3(top,mid,bot),null);
    }
}
