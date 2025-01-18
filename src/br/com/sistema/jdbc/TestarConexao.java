/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Elisa
 */
public class TestarConexao {
    
    public static void main(String[] args) {
        try {
            new ConexaoBanco().pegarConexao();
            JOptionPane.showMessageDialog(null, "Conexão com banco de dados realiada com sucesso!");
        } catch (HeadlessException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar se conectar ao banco de dados" + erro.getMessage());
        }
    }
    
}
