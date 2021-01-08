
package org.dei.excecaoUnchecked;

import javax.swing.*;
import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa(null, 123);
        System.out.println(pessoa);
        Scanner ler = new Scanner(System.in);

        try {

            Pessoa p = new Pessoa();
            System.out.print("Nome:");
            String nome = ler.nextLine();
            p.setNome(nome);
            System.out.println("");


        System.out.print("Nº de ID Civil:");
        int idCivil = ler.nextInt();
        ler.nextLine();
        p.setIDCivil(idCivil);
        System.out.println("");

        System.out.println("\nPessoa: " + p);

        } catch (ArgumentoForaDosLimitesException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
