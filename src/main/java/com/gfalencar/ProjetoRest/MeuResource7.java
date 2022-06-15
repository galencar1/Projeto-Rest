package com.gfalencar.ProjetoRest;

import org.springframework.http.HttpStatus;
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
    
    
//  Método para salvar cliente    
    @PostMapping("/ProjetoRest/clientes")
    @ResponseStatus(HttpStatus.CREATED) // Retorna a resposta em caso de sucesso.
    public Cliente salvarNovoCliente(@RequestBody Cliente cliente){ // Nesse caso o método salvar recebe o JSON com os dados do cliente para que seja salvo.
                                                                    //A Anotação @RequestBody é responsável por transformar os dados do JSON em um objeto que será salvo
        //service.save(cliente); // Nesse caso receberia do serviço os dados do novo cliente
        return cliente;
    }
    
//  Método para deletar cliente.
    @DeleteMapping("/ProjetoRest/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCliente(@PathVariable Long id){
        //service.buscarPorId(id);
        //service.deletar(cliente);
    }
    
//  Método para atualizar dados do cliente.
    @PutMapping("/ProjetoRest/clientes/{id}")
    public Cliente atualizarDadosCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        //service.buscaPorId(id);
        //service.atualizar(cliente);
        return cliente;
    
    }
}
