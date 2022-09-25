import model.Item;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Conveniencia {
    public static void main(String[] args) {
        //Cria uma lista de Itens com nome itemList
        List<Item> itemList = new ArrayList<>();
        //instância um objeto do tipo item e adiciona na lista de itens
        Item leite = new Item(2, "1 litro de leite",2,5 );
        itemList.add(leite); //adiciona na lista

        Item pao = new Item(1,"pão francês", 10, 0.75);
        itemList.add(pao);

        Item manteiga = new Item(3,"manteiga calu", 1, 22);
        itemList.add(manteiga);

        Item cafe = new Item(4,"cafe da roça", 3, 5);
        itemList.add(cafe);

        /*
        Aplica desconto atraves do metodo setDesconto, ao objeto do tipo item como nome de leite,
        mas o mesmo poderia ser qualquer outro nome pode ser itemA, Os atributos do meu Objeto
        que serão salvos no banco de dados depois.
        */
        leite.setDesconto(0.15);

        /*
          Usando ForEach para percorrer a lista e imprimir os dados dos objetos dentro dela.
          Em caso de duvida do uso do forEach Estamos definido o tipo de variavel que ele vai percorre que no caso sera um objeto do tipo Item "for (Item x:"
          no mesmo lado definimos o nome desse Item ao qual atribui nome X, X recebera os dados de cada o objeto dento da lista um por um ate a termino da lista
          Aqui atribuimos qual a lista ele percorera "itemList)" a mesma foi criada no inicio do codigo, dentro das {} colocamos quais comandos executar
          dentro do lupe que é do tamanho da lista iniciando em 0.
        */
        for (Item x: itemList) {
            System.out.println(
                    "Item\t" + x.getId() +
                    "\tDescricao\t" + x.getDescriccao() +
                    "\tQuantidade\t" + x.getQuantidade() +
                    "\tPreço Unitario\t" + x.getPrecoUnitario() +
                    "\tValor Total \t" + x.getAjustePrecoTotal() +
                    "\n");
        }
    }
}
//fim da aplicação