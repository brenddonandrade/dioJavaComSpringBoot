package OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

import OperacoesBasicas.Item;

public class CarrinhoCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList();
        for (Item i : this.carrinhoCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                this.carrinhoCompras.remove(i);
            }
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : this.carrinhoCompras) {
            valorTotal += (i.getPreco() * i.getQuantidade());
        }

        return valorTotal;
    }

    // Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e
    // quantidades
    @Override
    public String toString() {
        String descricao = "";
        if (carrinhoCompras.size() == 0)
            return "";
        else {
            for (Item i : this.carrinhoCompras) {
                descricao += ("Nome: " + i.getNome()
                        + ", Preco: " + i.getPreco() +
                        " , Quantidade: " + i.getQuantidade() + " \n");
            }
            return descricao;
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.println(carrinhoCompras);
        carrinhoCompras.adicionarItem("Notebook", 20000.00, 2);

        System.out.println(carrinhoCompras);

        carrinhoCompras.adicionarItem("Celular", 4000.00, 1);

        System.out.println(carrinhoCompras);
        System.out.println(carrinhoCompras.calcularValorTotal());

    }
}
