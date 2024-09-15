package PokedexProjeto;

import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class PokedexPro extends JFrame {
    private JButton btnSquirtle;
    private JButton btnChar;
    private JButton btnBulba;
    private JPanel MainPanel;

    public static void main(String[] args) {
        new PokedexPro();
    }

    public PokedexPro() {

        setContentPane(MainPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1020, 640);
        setTitle("POKEDÉX DA BLING");

        //BOTÃO PARA APARECER TODOS OS REQUISITOS DO SQUIRTLE JUNTO DAS EVOLUÇÕES
        btnSquirtle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int squirtle;

                //REPETIÇÃO COM DO/WHILE PARA OS JOPTIONPANES MOSTRANDO AS EVOLUÇÕES
                do {
                    String[] proxAnt = {"Sair", "Wartotle", "Blastoise"};

                    squirtle = JOptionPane.showOptionDialog(MainPanel, "<html>Squirtle <hr>" + "<br>HP: 44" +
                                    "<br>Attack: 48" + "<br>Defense: 65" + "<br>Sp. Atk: 50" + "<br>Sp. Def: 64" +
                                    "<br>Speed: 43" + "<br> " + " <br><em>Total: 314</em> ", "Squirtle #007",
                            0, 3, null, proxAnt, proxAnt[0]);
                    if (squirtle == 1) {
                        JOptionPane.showMessageDialog(MainPanel, "<html>Wartotle <hr>" + "<br>HP: 59" +
                                "<br>Attack: 63" + "<br>Defense: 80" + "<br>Sp. Atk: 65" + "<br>Sp. Def: 80" +
                                "<br>Speed: 58" + "<br> "  +" <br><em>Total: 405</em> ", "Wartotle #008",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    if (squirtle == 2) {
                        JOptionPane.showMessageDialog(MainPanel, "<html>Blastoise <hr>" + "<br>HP: 79" +
                                "<br>Attack: 83" + "<br>Defense: 100" + "<br>Sp. Atk: 85" + "<br>Sp. Def: 105" +
                                "<br>Speed: 78" + "<br> " +"<br><em>Total 530</em>", "Blastoise #009",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } while (squirtle != 0);
            }
        });

        //CONFIGURAÇÃO DO BOTÃO FOGO PARA MOSTRAR AS INFORMAÇÕES DOS POKÉMONS;
        btnChar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int charmander ;

                //REPETIÇÃO COM DO/WHILE PARA OS JOPTIONPANES MOSTRANDO AS EVOLUÇÕES
                do {
                    String[] proxAnte = {"Sair", "Charmeleon", "Charizard"};

                    charmander = JOptionPane.showOptionDialog(MainPanel, "<html>Charmander <hr>" + "<br>HP: 39" +
                            "<br>Attack: 52" + "<br>Defense: 43" + "<br>Sp. Atk: 60" + "<br>Sp. Def: 50" + "<br>Speed: 65" +
                            "<br> " + "<br><em>Total: 309</em>", "Charmander #004", 0, 3,
                            null, proxAnte, proxAnte[0]);

                    if (charmander == 1) {
                        JOptionPane.showMessageDialog(MainPanel, "<html>Charmeleon <hr>" + "<br>HP: 58" +
                                "<br>Attack: 64" + "<br>Defense: 58" + "<br>Sp. Atk: 80" + "<br>Sp. Def: 65" + "<br>Speed: 80"
                                + "<br> " + "<br><em>Total: 405</em>", "Charmeleon #005",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    if (charmander == 2) {
                        JOptionPane.showMessageDialog(MainPanel, "<html>Charizard <hr>" + "<br>HP: 78" +
                                "<br>Attack: 84" + "<br>Defense: 78" + "<br>Sp. Atk: 109" + "<br>Sp. Def: 85" + "<br>Speed: 100"
                                + "<br> " + "<br><em>Total: 534</em>", "Charizard #006",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } while (charmander != 0);
            }
        });

        //CONFIGURAÇÃO DO BOTÃO PARA MOSTRAR A EVOLUÇÃO E POKEMONS DO TIPO PLANTA;
        btnBulba.addComponentListener(new ComponentAdapter() {
        });
        btnBulba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int bulba;

                do {


                String[] proxAnt = {"Sair", "Ivysaur", "Venasaur"};

                bulba = JOptionPane.showOptionDialog(MainPanel, "<html>Bulbasaur <hr>" + "<br>HP: 45" +
                                "<br>Attack: 49" + "<br>Defense: 49" + "<br>Sp. Atk: 65" + "<br>Sp. Def: 65" + "<br>Speed: 45" +
                                "<br> " + "<br><em>Total: 318</em>", "Bulbasaur #001", 0, 3,
                        null, proxAnt, proxAnt[0]);

                if (bulba == 1) {
                    JOptionPane.showMessageDialog(MainPanel, "<html>Ivysaur <hr>" + "<br>HP: 60" +
                                    "<br>Attack: 62" + "<br>Defense: 63" + "<br>Sp. Atk: 80" + "<br>Sp. Def: 80" + "<br>Speed: 60"
                                    + "<br> " + "<br><em>Total: 405</em>", "Ivysaur #002",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                if (bulba == 2) {
                    JOptionPane.showMessageDialog(MainPanel, "<html>Venasaur <hr>" + "<br>HP: 80" +
                                    "<br>Attack: 82" + "<br>Defense: 83" + "<br>Sp. Atk: 100" + "<br>Sp. Def: 100" + "<br>Speed: 80"
                                    + "<br> " + "<br><em>Total: 525</em>", "Venasaur #003",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                } while (bulba != 0);
            }
        });
    }
}