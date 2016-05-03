package br.com.batistao.controller;

import br.com.batistao.model.Cliente;
import br.com.batistao.model.Pedido;
import br.com.batistao.model.Produto;
import br.com.batistao.repository.ClienteRepository;
import br.com.batistao.repository.PedidoRepository;
import br.com.batistao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ceb on 30/04/16.
 */
@RestController
@RequestMapping("/supermercado")
public class DatabaseController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @RequestMapping(method = RequestMethod.POST)
    public String cadastraMassaDeDados() {
        List<Produto> produtos = new ArrayList<Produto>();
        Produto sabaoEmPo = new Produto("OMO", "Sabão em Pó OMO Progress 1,8 kg", 26.79);
        produtos.add(sabaoEmPo);
        Produto detergente = new Produto("Ype", "Detergente Líquido Ype Neutro 500 Ml", 1.99);
        produtos.add(detergente);
        Produto esponja = new Produto("Scoth Brite", "Esponja Limpeza Scoth Brite 3M", 4.50);
        produtos.add(esponja);
        produtoRepository.save(produtos);

        Cliente cliente = new Cliente("Carlos", new Date(), "cezbatistao@email.com.br");
        clienteRepository.save(cliente);

        return "Sucesso na criação da massa de dados\n";
    }

    @RequestMapping(value = "/comprar/{idCliente}/{idProduto}/{quantidade}", method = RequestMethod.POST)
    public String comprar(@PathVariable Long idCliente, @PathVariable Long idProduto, @PathVariable Integer quantidade) {
        Cliente cliente = clienteRepository.findOne(idCliente);
        Produto produto = produtoRepository.findOne(idProduto);

        Pedido pedido = new Pedido(cliente);
        pedido.comprar(produto, quantidade);

        pedidoRepository.save(pedido);

        return "Sucesso na compra do produto: " + produto.getNome() + "\n";
    }
}
