package com.gfalencar.ProjetoRest;

import org.springframework.web.bind.annotation.*;

@RestController // Adiciona a classe anotada ao container para subir juntamente com a aplicação
//também fica preparada para tratar requisições REST.
public class MeuResource7 {
//    Métodos que irão receber as requisições. POST/GET/PUT/DELETE

//    Método que irá obter os dados do cliente (GET).
//    Retornará um objeto da classe Cliente.
// Como a classe já está anotada com @RestController, todo retorno do objeto será JSON
//    @RequestMapping(value = "/ProjetoRest/cliente/{id}", method = RequestMethod.GET) // Essa anotação efetua o mapeamento do GET
    // podemos usar o GetMapping ao invés do RequestMapping.
    @GetMapping("/ProjetoRest/clientes/{id}")
    public Cliente obterDadosCliente(@PathVariable Long id){ //Anotação pathVariable indica que o parametro "id" é uma variável da URL.
        System.out.println(String.format("Id Recebido via URL: %d", id));
        Cliente cliente = new Cliente("Schtarden" ,"000.000.000-00");
        return cliente;
    }
}
