class Conta(private val titular: String, private  val numeroConta: Int) {
    private var saldo=0.0

//    constructor(titular:String,numeroConta: Int) : this() {
//        this.titular=titular
//        this.numeroConta=numeroConta
//    }
    fun depositar(valor:Double){
        this.saldo+=valor
        println("Depósito de $valor realizado com sucesso!")
    }
    fun sacar(valor: Double){
        if(this.saldo<valor){
            println("Impossível Sacar,saldo insuficiente")
        }else{
            this.saldo-=valor
            println("Saque de $valor realizado com sucesso!")
        }
    }
    fun transfere(contaDestino:Conta,valor: Double){
        if(this.saldo<valor){
            println("Impossível transferir,saldo insuficiente!")
        }else{
            this.saldo-=valor
            contaDestino.saldo+=valor
            println("Transferência realizada com sucesso!")
        }
    }
    fun testaBoolean():Boolean{//Tipo do retorno do método
        return 1==1
    }
    fun getSaldo(): Double {
        return this.saldo
    }
    fun setSaldo(saldoFinal:Double){
        this.saldo=saldoFinal
    }
    fun getTitular(): String {
        return this.titular
    }
    fun getNumeroConta(): Int {
        return this.numeroConta
    }

}

fun main(){
    println("Bem vindo ao ByteBank")
    val conta1 = Conta("Igor",222)
    conta1.depositar(3000.00)
    println("Número da conta : ${conta1.getNumeroConta()} , nome do titular: ${conta1.getTitular()},e o seu saldo é: ${conta1.getSaldo()}")
    conta1.depositar(2000.0)
    println(conta1.getSaldo())
    conta1.sacar(1500.0)
    println(conta1.getSaldo())
    val conta2=Conta("Yone",333)
    conta2.depositar(2500.00)
    conta2.transfere(conta1,2000.00)
    println(conta1.getSaldo())
    println(conta2.getSaldo())
    println(conta1.testaBoolean())
}