package com.example.modulo5tarefa

//Criar uma classe veículo que tenha as seguintes propriedades e métodos:
//  Propriedades:
//      Long velocity: Valor inicial 0
//      Long acceleration: Valor inicial 10
//      String model
// Métodos:
//      Crie um método para incrementar a velocidade do carro que
//          calcule a nova velocidade, somando o valor da
//          propriedade acceleration ao da velocity, salvando o
//          resultado em velocity
//      Crie um método para reduzir a velocidade do carro que calcule a nova
//          velocidade, decrementando o valor da propriedade acceleration
//          ao da velocity, salvando o resultado em velocity.
//          Importante! O valor da velocidade nunca pode ser negativo.
//• Crie um método que retorna a velocidade atual do veículo

fun main() {

    var carro = Veiculo("Insira aqui o modelo do veiculo")

    //Demonstrando a propriedade inicializada em 0
    carro.mostrarVelocidade()
    //Incrementando o valor a variavel velocity
    carro.incrementoVelocidade(10)
    //Apresentando resultado
    carro.mostrarVelocidade()
    //Decrementando o valor a variavel velocity
    carro.decrementoVelocidade(10)
    //Apresentando resultado
    carro.mostrarVelocidade()
    //Testando se o valor é inferior a 0
    carro.decrementoVelocidade(100)
    //Apresentando o ultimo resultado, caso esteja parado adicionei um teste para dar uma outra mensagem caso velocidade seja 0
    carro.mostrarVelocidade()



}

class Veiculo(model: String){
    //Definicao das propriedades
    var velocity: Long
    var acceleration: Long
    var model: String
    var andando: Boolean

    //Inicializacao da propriedades
    init{
        this.acceleration = 10
        this.velocity = acceleration
        this.model = model
        this.andando = true
    }


    //Metodo de Incremento
    fun incrementoVelocidade(velocidade: Long){
        acceleration = velocidade
        velocity += acceleration
    }

    //Metodo de Decremento
    fun decrementoVelocidade(velocidade: Long): Long{
        acceleration = velocidade
        velocity -= acceleration
        if(velocity < velocidade){
            velocity = 0
            andando = false
        }
        return velocity
    }

    //Metodo de visualizacao
    fun mostrarVelocidade(){
        if(andando == true){
            println("A velocidade atual do carro modelo $model é de $velocity km/h")
        }else{
            println("O carro do modelo $model está parado")
        }
    }
}