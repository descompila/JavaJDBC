/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Categoria;
import model.bean.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Samuelson
 */
public class ProdutoDAOTest {

    public ProdutoDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {

        Categoria categoria = new Categoria();
        categoria.setId(1);

        Produto produto = new Produto();
        produto.setDescricao("Feijão");
        produto.setQtd(20);
        produto.setValor(10);
        produto.setCategoria(categoria);

        ProdutoDAO dao = new ProdutoDAO();

        if (dao.save(produto)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }

    }

    @Test
    @Ignore
    public void listar() {

        ProdutoDAO dao = new ProdutoDAO();

        for (Produto p : dao.findAll()) {

            System.out.println("Descrição Produto:" + p.getDescricao() + " - Descrição Categoria: " + p.getCategoria().getDescricao());

        }

    }

    @Test
    public void atualizar() {

        Categoria categoria = new Categoria();
        categoria.setId(1);

        Produto produto = new Produto();
        produto.setQtd(20);
        produto.setDescricao("Farinha");
        produto.setCategoria(categoria);
        produto.setValor(10);
        
        produto.setId(3);

        ProdutoDAO dao = new ProdutoDAO();

        if (dao.update(produto)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }

    }

}
